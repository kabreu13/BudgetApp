import java.util.ArrayList;
import java.util.stream.Collectors;

public class Income implements CashFlow{
    // private HashMap <String, Double> incomeMap = new HashMap<>();
    private ArrayList<Double> incomeList = new ArrayList<>(); 
    Income() {
        incomeList.add(0.00);
    }
    
    public void add(Double value) {
        incomeList.add(value);
    }

    public Double getTotal() {
        double total = 0;
        for(double value : incomeList)
            total += value;
        return total;
    }

    public ArrayList<String> getList() {
        return incomeList.stream().map(Object::toString).collect(Collectors.toCollection(ArrayList::new));
    }
}
