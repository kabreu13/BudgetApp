import java.util.ArrayList;

public class VariableExpenses {
    // private HashMap<String, Double> varExMap = new HashMap<>();
    private ArrayList<Double> varExList = new ArrayList<>();

    VariableExpenses() {
        varExList.add(0.00);
    }
    
    public void addVarEx(Double value) {
        varExList.add(value);
    }

    public Double getTotalVarEx() {
        double total = 0;
        for(double value : varExList) {
            total += value;
        }
        return total;
    }
}
