import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);
    static Budget budget = new Budget();

    public static void main(String[] args) {
        int option;
        do {
            System.out.print("\n---MENU---\n----------\n\n" +
                    "1. Realizar un ingreso\n2. Registrar un gasto\n3. Ver balance\n" +
                    "4. Ver último movimientos\n0. Salir del programa\n\nIngrese una opcion: ");
            option = sc.nextInt();
            sc.nextLine(); // Buffer
            switch (option) {
                case 1:
                    addIncome();
                    break;
                case 2:
                    addExpense();
                    break;
                case 3:
                    System.out.printf("Su balance es de: %f\n", budget.balance());
                    break;
                case 4:
                    System.out.println(budget.generateSummary());
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (option != 0);
    }

    public static void addIncome() {
        System.out.print("\nIngresa la descripcion: ");
        String description = sc.nextLine();
        System.out.print("Ingresa la cantidad del ingreso: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // Buffer
        System.out.print("Ingrese la fecha con el siguiente formato (dd/mm/aaaa): ");
        String date = sc.nextLine();
        System.out.print("Ingresa la categoría de donde proviene el ingreso: ");
        String source = sc.nextLine();

        budget.addIncome(description, amount, date, source);
    }

    public static void addExpense() {
        System.out.print("\nIngresa la descripcion: ");
        String description = sc.nextLine();
        System.out.print("Ingresa la cantidad del gasto: ");
        double amount = sc.nextDouble();
        sc.nextLine(); // Buffer
        System.out.print("Ingrese la fecha con el siguiente formato (dd/mm/aaaa): ");
        String date = sc.nextLine();
        System.out.print("Ingresa la categoría de donde proviene el gasto: ");
        String category = sc.nextLine();

        budget.addExpense(description, amount, date, category);
    }
}
