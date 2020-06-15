import java.util.ArrayList;
import java.util.List;

public class CombinatorialCircuit {
    private List<LogicVariable> logic_variables = new ArrayList<>();
    public Boolean addVariable(LogicVariable logic) {
        if (!logic_variables.contains(logic)) {
            logic_variables.add(logic);
            return true;
        }
        return false;
    }
    public LogicVariable getVariableByName(String name) {
        for (int i = 0; i < logic_variables.size();i++) {
            if (logic_variables.get(i).getName() == name) return logic_variables.get(i);
        }
        return null;
    }
}
