import java.util.ArrayList;

interface CashFlow {
    ArrayList<Double> list = new ArrayList<>();

    void add(Double x);

    Double getTotal();

    ArrayList<String> getList();
}
