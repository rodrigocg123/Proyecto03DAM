import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿Cuántos precios quieres introducir? ");
        int numeroProductos = entrada.nextInt();
        entrada.nextLine(); // consumir el salto de línea después del número
        double totalVentas = 0.0;

        for (int i = 0; i < numeroProductos; i++) {
            System.out.print("Nombre del producto " + (i+1) + ": ");
            String nombre = entrada.nextLine();
            System.out.println("Cuantos articulos tiene el producto " + nombre + ": ");
            int cantidad = entrada.nextInt();
            System.out.print("Introduce el precio del producto " + (i+1) + ": ");
            double precio = entrada.nextDouble();
            entrada.nextLine(); // consumir salto de línea antes de la siguiente lectura
            double preciofinal= (cantidad * precio);
            totalVentas += preciofinal;
            System.out.println("\nListado de productos:");
            System.out.println( (i+1)+  cantidad + "X" + "-->" + nombre + ": " + preciofinal + " euros");
        }
        
        System.out.println("Precio total de las compras: " + totalVentas);
        System.out.println("La media de precio en los productos es: "+(totalVentas / numeroProductos));
        if (numeroProductos <= 0) {
            System.out.println("No hay productos.");
            entrada.close();
            return;
        }
        
        entrada.close();
    }
}
