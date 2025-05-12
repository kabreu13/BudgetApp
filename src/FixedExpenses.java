import java.util.ArrayList;
import java.util.stream.Collectors;

public class FixedExpenses implements CashFlow{
    // private HashMap<String, Double> fixedExMap = new HashMap<>();
    private ArrayList<Double> fixedExList = new ArrayList<Double>();

    FixedExpenses() {
        fixedExList.add(0.00);
    }
    
    public void add(Double value) {
        fixedExList.add(value);
    }
    
    public Double getTotal() {
        double total = 0;
        for(double value : fixedExList) {
            total += value;
        }
        return total;
    }

    public ArrayList<String> getList() {
        return fixedExList.stream().map(Object::toString).collect(Collectors.toCollection(ArrayList::new));
    }
}

