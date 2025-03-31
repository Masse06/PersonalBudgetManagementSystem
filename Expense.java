public class Expense extends Transaction{
    private String category; // Categoría de donde procede el gasto

    public Expense(String description, double amount, String date, String category) {
        super(description, amount, date);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + ", categoría: " + category + " )";
    }
}
