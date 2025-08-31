import java.util.Scanner;

public class EnvioCompra {

    // a. Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg;

        if (zona.equalsIgnoreCase("Nacional")) {
            costoPorKg = 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            costoPorKg = 10.0;
        } else {
            System.out.println("Zona inválida. Se asumirá 'Nacional' por defecto.");
            costoPorKg = 5.0;
        }

        return peso * costoPorKg;
    }

    // b. Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita los datos al usuario
        System.out.print("Ingrese el peso del paquete (kg): ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // limpiar el buffer

        System.out.print("Ingrese la zona de envío (Nacional o Internacional): ");
        String zona = scanner.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scanner.nextDouble();

        // Cálculo usando los métodos
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        // Mostrar resultados
        System.out.printf("Costo de envío: $%.2f\n", costoEnvio);
        System.out.printf("Total a pagar: $%.2f\n", total);

        scanner.close();
    }
}
