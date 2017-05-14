package ASMGenerator.expressions;


import ASMGenerator.ASMUtils;

public class ConstantString extends Expression {

    private String s;

    public ConstantString(String s) {
        this.s = s.substring(1, s.length() -1);
    }
    @Override
    public String generate() {
        return ASMUtils.generateConstantString(this.s);
    }
}
