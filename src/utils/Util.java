package utils;

import TDS.Entry;
import TDS.SymbolTable;
import core.Keywords;
import exceptions.*;
import org.antlr.runtime.tree.Tree;


/**
 * Created by tld on 22/03/2017.
 */
public class Util {

    public static Boolean testType(Entry l, String r, SymbolTable tds) {
        if (l.get(Entry.TYPE).equals(r)) {
	        return true;
        }
        else if (tds.get(r)!=null) {
        	return l.get(Entry.TYPE).equals(tds.get(r).get(Entry.INHERIT));
        }
        else if(tds.getFather() != null) {
        	return testType(l,r,tds.getFather());
        }
        else {
	        return false;
        }
    }

    public static String testTypeOperationExpression(Tree node, SymbolTable tds) throws Exception {
        if(node.getChildCount() == 0)
            return Util.getType(node.getText(), tds);
        else {
            // An operation must be composed of only two child every time !
            assert node.getChildCount() == 2;
            String typeLeft = Util.testTypeOperationExpression(node.getChild(0), tds);
            if(!typeLeft.equals(Util.testTypeOperationExpression(node.getChild(1), tds)))
                throw new MismatchOperationException(null, null);

            return typeLeft;
        }
    }


    private static String testTypeOper(String nodeL, String nodeR) throws Exception {
        if (nodeL.equals(Keywords.INTEGER) && nodeR.equals(Keywords.INTEGER)) {
        	return Keywords.INTEGER;
        }
        else if (nodeL.equals(Keywords.STRING) && nodeR.equals(Keywords.STRING)) {
	        throw new StringOperationException();
        }
        else {
			throw new MismatchOperationException(null, null);
        }
    }

    public static String getType(String s, SymbolTable tds) throws Exception {
        if (s.matches("[0-9]+"))
            return Keywords.INTEGER;
        if (s.matches("\".*\""))
            return Keywords.STRING;
        else if (tds.getInfo(s) != null) {
	        return tds.getInfo(s).get(Entry.TYPE);
        }
	    else {
        	throw new UndeclaredVariableException(null, null, s); //TODO Vérifier que c'est toujours une variable
        }
    }

    public static void testReturnType(String expected, String real) throws Exception {
        if(!expected.equals(real))
            throw new ReturnValueTypeMismatchException(expected, real);

    }

    public static void testReadUse(String readingType) throws Exception{
		if (!"int".equals(readingType)) {
			throw new ReadUsageException(null, null, readingType);
		}
    }

	public static void testWriteUse(String readingType) throws Exception{
		if (!("int".equals(readingType) || "string".equals(readingType))) {
			throw new WriteUsageException(null, null, readingType);
		}
	}

    public static void testDo(Tree doChild,SymbolTable tds) throws Exception {
        // Test if the method is declared
        Util.testCall(doChild, tds);

        // Test if the method is void
        String called = doChild.getChild(0).getText();
        String receiver = doChild.getChild(doChild.getChildCount() - 1).getText();
        SymbolTable symbolTableReceiver = Util.getSymbolTable(receiver, tds);
        if(symbolTableReceiver.get(called).get(Entry.RETURN_TYPE) != null)
            throw new MethodNonVoidException(null, null, called);
    }

    public static void testCall(Tree callNode,SymbolTable tds) throws Exception {
        if(!(callNode.getChildCount() >= 2 && callNode.getChildCount() <= 3))
            throw new InexactDoCallException(null,null,callNode.getText());
        else {
            // Test the receiver: this / super / idf
            String receiver = callNode.getChild(callNode.getChildCount() - 1).getText();
            String called = callNode.getChild(0).getText();
            SymbolTable symbolTableReceiver = Util.getSymbolTable(receiver, tds);
            int actualNbParams = callNode.getChildCount() == 3 ? callNode.getChild(1).getChildCount() : 0;
            // Check if method exists
            if(symbolTableReceiver.get(called) == null || !symbolTableReceiver.get(called).getName().equals(Entry.METHOD))
                throw new UndeclaredMethodException(null, null, called);

            // Check Number of params
            if(Util.countParameters(symbolTableReceiver.getLink(called)) != actualNbParams)
                throw new IncorrectParamsMethodException(null, null, called);
        }
    }

    private static String getTypeReturnByMethod(Tree node, SymbolTable tds) throws Exception {
        String receiver = node.getChild(node.getChildCount() - 1).getText();
        String called = node.getChild(0).getText();
        SymbolTable symbolTableReceiver = Util.getSymbolTable(receiver, tds);
        return symbolTableReceiver.get(called).get(Entry.RETURN_TYPE);
    }

    public static void testVoidCall(Tree callNode, SymbolTable tds) throws Exception {
        if (tds.getInfo(callNode.getChild(0).getText()).get(Entry.RETURN_TYPE) == null){
            throw new MethodNonVoidException(null,null,callNode.getChild(0).getText());
        }
    }

    public static void undeclaredClass(String className, SymbolTable tds) throws Exception {
    	throw new UndeclaredClassException(null, null, className);
    }

    private static int countParameters(SymbolTable tds) {
        int count = 0;
        for(String key: tds.getKeyEntries()) {
            if(tds.get(key).getName().equals(Entry.PARAMETER))
                count++;
        }
        return count;
    }

	public static void undeclaredToken(String tokenName, SymbolTable tds) throws Exception {
    	throw new UndeclaredVariableException(null, null, tokenName);
	}

	public static void undeclaredInheritance(String className, SymbolTable tds) throws Exception {
		throw new UndeclaredInheritanceException(null, null, className);
	}

	public static void mismatchType(String filename, Tree node, String type1 , String type2, String idf1, String idf2) throws Exception {
        throw new MismatchTypeException(filename,node,type1,type2,idf1,idf2);
    }

    public static String callReturnType(Tree node, SymbolTable tds)throws Exception{
        return Util.subTreeType(node, tds);
    }

    /**
     * This method will find the appropriate Symbol depending on the type of the receiver (idf , this or super in our case).
     *
     *          var a: Animal ;
     *          do a.eat()
     *
     *          // getSymbolTable(a, currentTDS) => returns the Symbol Table of Animal class
     *
     */
    private static SymbolTable getSymbolTable(String receiver, SymbolTable currentTDS) throws Exception {
        switch (receiver) {
            case Keywords.THIS:
                return currentTDS.getFather();
            case Keywords.SUPER:
                String inheritedClass = currentTDS.getFather().getFather().get(currentTDS.getFather().getName()).get(Entry.INHERIT);
                return currentTDS.getFather().getFather().getLink(inheritedClass);
            default:
                Entry e = currentTDS.getInfo(receiver);
                if(e == null || !(e.getName().equals(Entry.VARIABLE)))
                    throw new UndeclaredVariableException(null,null, receiver);
                return currentTDS.getLinkRecursive(e.get(Entry.TYPE));
        }
    }

    public static String subTreeType(Tree node,SymbolTable tds) throws Exception {
        switch (node.getText()) {
            case "PLUS":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case "DIFF":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case "MUL":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case "DIV":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));

            case ">":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case ">=":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case "<":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case "<=":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case "==":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case "!=":
                return Util.testTypeOper(subTreeType(node.getChild(0),tds),subTreeType(node.getChild(1),tds));
            case Keywords.NEW:
                return node.getChild(0).getText();
            case Keywords.THIS:
                return Util.getSymbolTable(node.getText(), tds).getName();
            case "CALL":
                Util.testCall(node, tds);
                return Util.getTypeReturnByMethod(node, tds);
            case "-":
                return Util.subTreeType(node.getChild(0), tds);
            case Keywords.NIL:
                return Keywords.NIL;
            default:
                return Util.getType(node.getText(),tds);
        }
    }
}
