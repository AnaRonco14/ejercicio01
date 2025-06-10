import java.util.Scanner;

public class CalculadoraPorcentaje {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita el monto total
        System.out.print("Ingresa el monto total de la cuenta: ");
        double montoTotal = scanner.nextDouble();

        // Solicita el porcentaje
        System.out.print("¿Qué porcentaje de propina deseas dejar? (10, 15, 20): ");
        int porcentaje = scanner.nextInt();

        // Calcula propina y total
        double propina = montoTotal * porcentaje / 100.0;
        double totalAPagar = montoTotal + propina;

        // Muestra resultados
        System.out.printf("Propina: $%.2f%n", propina);
        System.out.printf("Total a pagar: $%.2f%n", totalAPagar);

        scanner.close();
    }
    
}
