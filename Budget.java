import java.util.ArrayList;

public class Budget {
    private static ArrayList<Income> incomes = new ArrayList<>();
    private static ArrayList<Expense> expenses = new ArrayList<>();
    private static double balance = 0;

    public void addIncome(String description, double amount, String date, String source) {
        incomes.add(new Income(description, amount, date, source));
        balance += amount;
    }

    public void addExpense(String description, double amount, String date, String category) {
        expenses.add(new Expense(description, amount, date, category));
        balance -= amount;
    }

    public double balance() {
        return balance;
    }

    public String generateSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nResumen de tus ingresos\n-----------------------------\n");
        for (Income i : incomes) {
            sb.append(i.toString());
            sb.append("\n");
        }
        sb.append("\nResumen de tus gastos\n-----------------------------\n");
        for (Expense e : expenses) {
            sb.append(e.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
