import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos precios quieres introducir? ");
        int numeroProductos = entrada.nextInt();
        entrada.nextLine(); // consumir salto de línea

        if (numeroProductos <= 0) {
            System.out.println("No hay productos.");
            entrada.close();
            return;
        }

        String[] nombres = new String[numeroProductos];
        double[] precios = new double[numeroProductos];
        double totalVentas = 0.0;

        for (int i = 0; i < numeroProductos; i++) {
            System.out.print("Nombre del producto " + (i + 1) + ": ");
            nombres[i] = entrada.nextLine().trim();
            System.out.print("Introduce el precio del producto " + (i + 1) + ": ");
            precios[i] = entrada.nextDouble();
            entrada.nextLine(); // consumir salto de línea antes de la siguiente lectura
            totalVentas += precios[i];
        }

        System.out.println("\nListado de productos:");
        for (int i = 0; i < numeroProductos; i++) {
            System.out.printf("%d) %s - %.2f%n", i + 1, nombres[i], precios[i]);
        }

        System.out.printf("%nEl total de ventas es: %.2f%n", totalVentas);
        System.out.printf("Precio medio por producto: %.2f%n", (totalVentas / numeroProductos));
        entrada.close();
    }
}
