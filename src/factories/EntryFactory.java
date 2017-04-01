package factories;

import TDS.entries.Class;
import TDS.entries.*;
import core.Keywords;

/**
 * Factory for a Entry class, mainly used for tests.
 *
 * @author Maxime Escamez
 * @author Théo Le Donné
 * @author Quentin Tardivon
 * @author Yann Prono
 */
public class EntryFactory {

    public static Class createClass(String cls) {  return new Class(cls); }
    public static Class createInheritClass(String cls, String inherit) {  return new Class(cls, inherit);  }

    public static Variable createVariable(String type) {
        return new Variable(type);
    }
    public static Variable createStringVariable() {
        return new Variable(Keywords.STRING);
    }
    public static Variable createIntVariable() {  return new Variable(Keywords.INTEGER); }

    public static Method createMethod() {  return new Method(); }
    public static Method createMethodReturn(String type) {  return new Method(type); }
    public static Method createMethodReturnInt() {  return new Method(Keywords.INTEGER); }
    public static Method createMethodReturnString() {  return new Method(Keywords.STRING); }

    public static Variable createStringParameter() {  return new Parameter(Keywords.STRING); }
    public static Variable createIntParameter(String type) {  return new Parameter(Keywords.INTEGER); }
    public static Variable createParameter(String type) {  return new Parameter(type); }

    public static If createIf(String type) {  return new If(); }

    public static AnonymousBloc createAnonymousBlock() {  return new AnonymousBloc(); }

    public static ForLoop createForLoop() {
        return new ForLoop();
    }
}
