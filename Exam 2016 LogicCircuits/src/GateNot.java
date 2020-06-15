public class GateNot extends LogicGate {
    public GateNot(LogicVariable output, LogicVariable input1) throws ColisionException, CycleException {
        super(output,input1);
        setSymbol("NOT");
        output.setCalculatedBy(this);
        if (input1.getFormula() == null) input1.setFormula(input1.getName());
        setFormula(this.getSymbol() + "(" + input1.getFormula() + ")");
        getOutput().setFormula(this.getSymbol() + "(" + input1.getFormula() + ")");
    }
}
