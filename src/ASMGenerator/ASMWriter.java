package ASMGenerator;

import TDS.SymbolTable;
import TDS.entries.Variable;
import org.antlr.runtime.tree.Tree;

import java.io.*;

/**
 * Created by quentin on 29/04/2017.
 */
public class ASMWriter {

	public static final int INT_SIZE = 2;
	private String output;

	public ASMWriter(String asmFile) {
		this.output = asmFile;
	}


	private static String formatASM(String left, String asm, String value) {
		return String.format("%-10s\t\t%-10s\t\t%-10s\n",left, asm, value);
	}

	public void generateASMFile(Tree tree, SymbolTable TDS) {
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(this.output), "utf-8"))) {
			//Début du programme

			writer.write(formatASM("\n\n\n\n// ------------- DEBUT DU PGM", "", "\n") +
					formatASM("SP", "EQU", "R15") +
					formatASM("WR", "EQU", "R14") +
					formatASM("BP", "EQU", "R13\n") +
					formatASM("EXIT_EXC", "EQU", "64") +
					formatASM("READ_EXC", "EQU", "65") +
					formatASM("WRITE_EXC", "EQU", "66\n") +
					formatASM("NUL", "EQU", "0") +
					formatASM("NULL", "EQU", "0") +
					formatASM("NIL", "EQU", "0\n") +

					formatASM("STACK_ADRS", "EQU", "0x1000") +
					formatASM("LOAD_ADRS", "EQU", "0xFE00\n") +
					formatASM("", "ORG", "LOAD_ADRS") +
					formatASM("", "START", "main_") +

					formatASM("main_", "LDW SP, #STACK_ADRS", "") +
					formatASM("", "LDW BP, #NIL", "\n") +
					formatASM("", "STW BP, -(SP)", "") +
					formatASM("", "LDW BP, SP", "")
			);

			this.constructASM(tree, writer, TDS);

			writer.write(formatASM("\n\n\n\n// ------------- FIN DU PGM", "", "\n") +
					formatASM("", "LDW SP, BP", "") +
					formatASM("", "LDW BP, (SP)+", "") +
					formatASM("", "TRP #EXIT_EXC", "") +
					formatASM("", "JEA @main_", "")
			);	
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to write or create File");
		}
	}

	private String varDecl(int deplType) {
		return formatASM("", "ADI SP, SP, #-" + deplType, "");
	}

	private String varAffect(int depl, int value) {
		return formatASM("", "LDW R0, #" + value, "") +
				formatASM("", "STW R0, (BP)-" + depl, "");
	}

	public String addConst(int constante, int depl) {
		getVar("R1", depl);
		return formatASM("", "ADQ" + constante + ", R1", "");
	}

	public String addToStack(String reg) {
		return formatASM("", "ADQ -2, SP", "") +
				formatASM("", "STW " + reg + ", (SP)", "");
	}

	public String removeFromStack(String reg) {
		return formatASM("", "LDW" + reg + ", (SP)", "") +
			formatASM("", "ADQ 2, SP", "");
	}

	private String getVar(String reg, int depl) {
		return formatASM("", "LDW" + reg + ", (BP)-" + depl, "");
	}

	private String printFuncCall(String varName) { //Equivalent à charger une fonction classique, inspiration
		return formatASM("", "ADI BP, RO, #-8", "") +
				formatASM("", "STW RO, -(SP)", "") +
				formatASM("", "JSR @print", "") +
				formatASM("", "ADI SP, SP, #2", "");

	}

	private String defPrintFunc() {
		return formatASM("", "print LDQ 0,R1", "") +
				formatASM("", "STW BP, -(SP)", "") +
				formatASM("", "LDW BP, SP", "") +
				formatASM("", "SUB SP, R1, SP", "") +
				formatASM("", "LDW R0, (BP)4","") +
				formatASM("", "TRP #WRITE_EXC", "") +
				formatASM("", "LDW SP, BP", "") +
				formatASM("", "LDW BP, (SP)+", "") +
				formatASM("", "RTS", "");
	}



	private void constructASM(Tree tree, Writer writer, SymbolTable TDS) throws IOException {
		switch(tree.getText()) {
			case "ROOT":
				for (int i = 0; i < tree.getChildCount(); i++) {
					constructASM(tree.getChild(i), writer, TDS);
				}
				break;

			case "VAR_DEC":
				if (tree.getChild(0).getText().equals("int")) {
					writer.write(varDecl(2));
				}
				else if(tree.getChild(0).getText().equals("string")) {
					writer.write(varDecl(2));
				}
				break;

			case "AFFECT":
				writer.write(varAffect(((Variable)TDS.get(tree.getChild(0).getText())).getDepl(), Integer.parseInt(tree.getChild(1).getText())));
				break;

			case "WRITE":
				writer.write(printFuncCall(tree.getChild(0).getText()));
		}
	}

}
