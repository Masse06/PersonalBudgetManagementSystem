public class Transaction {
    private String description;
    private double amount;
    private String date;

    public Transaction(String description, double amount, String date) {
        this.description = description;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaccion (" +
                "descripcion: " + description+
                ", cantidad: " + amount +
                ", fecha: " + date;
    }
}
