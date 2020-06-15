public class LogicVariable {
    private String name;
    private Boolean value;
    private LogicGate my_gate;
    private String formula;
    public LogicVariable(String name, Boolean value) {
        this.name = name;
        this.value = value;
    }
    public LogicVariable(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setValue(Boolean value) {
        this.value = value;
    }
    public Boolean getValue() {
        if (my_gate != null) {
            if (my_gate.getSymbol().equals("AND")) {
                my_gate.getInputs()[0].getValue();
                my_gate.getInputs()[1].getValue();
                setValue(my_gate.getInputs()[0].value && my_gate.getInputs()[1].value);
            }
            else if (my_gate.getSymbol().equals("OR")) {
                my_gate.getInputs()[0].getValue();
                my_gate.getInputs()[1].getValue();
                setValue(my_gate.getInputs()[0].value || my_gate.getInputs()[1].value);
            }
            else {
                my_gate.getInputs()[0].getValue();
                setValue(!(my_gate.getInputs()[0].value));
            }
        }
        return value;
    }
    public LogicGate getCalculatedBy() {
        return my_gate;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        LogicVariable lv = (LogicVariable) obj;
        return this.name.equals(((LogicVariable) obj).name);
    }

    public void setCalculatedBy(LogicGate my_gate) {
        this.my_gate = my_gate;
    }
    public void setFormula(String formula) {
        this.formula = formula;
    }
    public String getFormula() {
        return formula;
    }
}
