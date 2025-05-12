import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class View {
    TableView<String> table = new TableView<>();
    TableColumn<String, String> incomeCol = new TableColumn<>("Income");
    TableColumn<String, String> fixedExCol = new TableColumn<>("Fixed Expenses");
    TableColumn<String, String> varExCol = new TableColumn<>("Variable Expenses");

    public View() {
        table.getColumns().add(incomeCol);
        table.getColumns().add(fixedExCol);
        table.getColumns().add(varExCol);
    }
}
