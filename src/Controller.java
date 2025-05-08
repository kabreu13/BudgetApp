import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {
    Income income = new Income();
    FixedExpenses fixedExpenses = new FixedExpenses();
    VariableExpenses variableExpenses = new VariableExpenses();

    @FXML private Text incomeText;
    @FXML private Text expensesText;
    @FXML private Text surplusText;
    @FXML private TextField addIncomeField;
    @FXML private TextField addFixedExField;
    @FXML private TextField addVarExField;

    @FXML 
    private void handleCalcBtn(ActionEvent event) {
        surplusText.setText("$" + Double.toString(
            income.getTotalIncome() - (
                fixedExpenses.getTotalFixedEx() + 
                variableExpenses.getTotalVarEx())));
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
        income.addIncome(Double.parseDouble(addIncomeField.getText()));
        incomeText.setText(Double.toString(income.getTotalIncome()));
    }

    @FXML 
    private void handleAddFixedExBtn(ActionEvent event) {
        fixedExpenses.addFixedEx(Double.parseDouble(addFixedExField.getText()));
        expensesText.setText(Double.toString(getTotalExpenses()));
    }

    @FXML 
    private void handleAddVarExBtn(ActionEvent event) {
        variableExpenses.addVarEx(Double.parseDouble(addVarExField.getText()));
        expensesText.setText(Double.toString(getTotalExpenses()));
    }

    public Double getTotalExpenses() {
        return fixedExpenses.getTotalFixedEx() + variableExpenses.getTotalVarEx();
    }
}