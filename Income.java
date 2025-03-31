public class Income extends Transaction{
    private String source; // Fuente del ingreso

    public Income(String description, double amount, String date, String source) {
        super(description, amount, date);
        this.source = source;
    }

    @Override
    public String toString() {
        return super.toString() + ", fuente: " + source + " )";
    }
}
