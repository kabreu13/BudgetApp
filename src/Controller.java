import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    Income income = new Income();
    FixedExpenses fixedExpenses = new FixedExpenses();
    VariableExpenses varExpenses = new VariableExpenses();
    View view = new View();
    ObservableList<String> observableIncome = FXCollections.observableArrayList(income.getList());
    ObservableList<String> observableFixedExpenses = FXCollections.observableArrayList(fixedExpenses.getList());
    ObservableList<String> observableVarExpenses = FXCollections.observableArrayList(varExpenses.getList());

    public Controller() {


        view.table.setItems(observableIncome);
        view.table.setItems(observableFixedExpenses);
        view.table.setItems(observableVarExpenses);
    }

    @FXML private Text incomeText;
    @FXML private Text expensesText;
    @FXML private Text surplusText;
    @FXML private TextField addIncomeField;
    @FXML private TextField addFixedExField;
    @FXML private TextField addVarExField;

    @FXML 
    private void handleCalcBtn(ActionEvent event) {
        surplusText.setText("$" + Double.toString(
            income.getTotal() - (
                fixedExpenses.getTotal() + 
                varExpenses.getTotal())));
    }

    @FXML 
    private void handleResetBtn(ActionEvent event) {
        incomeText.setText("$0.00");
        expensesText.setText("$0.00");
        surplusText.setText("$0.00");
    }
    
    @FXML 
    private void handleExportBtn(ActionEvent event) {

    }

    @FXML 
    private void handleAddIncomeBtn(ActionEvent event) {
        income.add(Double.parseDouble(addIncomeField.getText()));
        incomeText.setText(Double.toString(income.getTotal()));
    }

    @FXML 
    private void handleAddFixedExBtn(ActionEvent event) {
        fixedExpenses.add(Double.parseDouble(addFixedExField.getText()));
        expensesText.setText(Double.toString(getTotalExpenses()));
    }

    @FXML 
    private void handleAddVarExBtn(ActionEvent event) {
        varExpenses.add(Double.parseDouble(addVarExField.getText()));
        expensesText.setText(Double.toString(getTotalExpenses()));
    }

    public Double getTotalExpenses() {
        return fixedExpenses.getTotal() + varExpenses.getTotal();
    }
}