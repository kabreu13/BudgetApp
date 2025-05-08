import java.util.ArrayList;

public class Income {
    // private HashMap <String, Double> incomeMap = new HashMap<>();
    private ArrayList<Double> incomeList = new ArrayList<>(); 
    Income() {
        incomeList.add(0.00);
    }
    
    public void addIncome(Double value) {
        incomeList.add(value);
    }

    public Double getTotalIncome() {
        double total = 0;
        for(double value : incomeList)
            total += value;
        return total;
    }
}
