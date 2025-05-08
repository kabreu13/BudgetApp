import java.util.ArrayList;

public class FixedExpenses {
    // private HashMap<String, Double> fixedExMap = new HashMap<>();
    private ArrayList<Double> fixedExList = new ArrayList<Double>();

    FixedExpenses() {
        fixedExList.add(0.00);
    }
    
    public void addFixedEx(Double value) {
        fixedExList.add(value);
    }
    
    public Double getTotalFixedEx() {
        double total = 0;
        for(double value : fixedExList) {
            total += value;
        }
        return total;
    }
}

