import java.util.ArrayList;
import java.util.stream.Collectors;

public class VariableExpenses implements CashFlow{
    // private HashMap<String, Double> varExMap = new HashMap<>();
    private ArrayList<Double> varExList = new ArrayList<>();

    VariableExpenses() {
        varExList.add(0.00);
    }
    
    public void add(Double value) {
        varExList.add(value);
    }

    public Double getTotal() {
        double total = 0;
        for(double value : varExList) {
            total += value;
        }
        return total;
    }

    public ArrayList<String> getList() {
        return varExList.stream().map(Object::toString).collect(Collectors.toCollection(ArrayList::new));
    }
}
