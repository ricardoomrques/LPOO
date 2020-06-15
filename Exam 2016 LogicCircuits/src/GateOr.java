public class GateOr extends LogicGate {
    public GateOr(LogicVariable output, LogicVariable input1, LogicVariable input2) throws ColisionException, CycleException {
        super(output,input1,input2);
        setSymbol("OR");
        output.setCalculatedBy(this);
        if (input1.getFormula() == null) input1.setFormula(input1.getName());
        if (input2.getFormula() == null) input2.setFormula(input2.getName());
        setFormula(this.getSymbol() + "(" + input1.getFormula() + "," + input2.getFormula() + ")");
        getOutput().setFormula(this.getSymbol() + "(" + input1.getFormula() + "," + input2.getFormula() + ")");
    }
}
