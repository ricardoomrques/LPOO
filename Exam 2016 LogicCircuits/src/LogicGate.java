public abstract class LogicGate {
    private LogicVariable output;
    private LogicVariable[] input;
    private String symbol;
    private String formula;
    public LogicGate(LogicVariable output, LogicVariable input1, LogicVariable input2) throws ColisionException, CycleException {
        if (output.getCalculatedBy() != null) throw new ColisionException();
        this.output = output;
        this.input = new LogicVariable[]{input1, input2};
        if (input1.getValue() == null || input2.getValue() == null) throw new CycleException();
    }
    public LogicGate(LogicVariable output, LogicVariable input1) throws ColisionException, CycleException {
        if (output.getCalculatedBy() != null) throw new ColisionException();
        this.output = output;
        this.input = new LogicVariable[]{input1};
        if (input1.getValue() == null) throw new CycleException();
    }
    public LogicVariable getOutput() {
        return output;
    }

    public LogicVariable[] getInputs() {
        return input;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    public void setFormula(String formula) {
        this.formula = formula;
    }
    public String getFormula() {
        return formula;
    }
}
