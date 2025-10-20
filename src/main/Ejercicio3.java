import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un numero aleatorio: ");
        int numero = entrada.nextInt();
        System.out.println("introduce otro numero aleatorio: "); 
        int numero2 = entrada.nextInt();
       
        int maximo = Math.max(numero, numero2);
        int minimo = Math.min(numero, numero2);
        System.out.println("10 numeros aleatorios entre " + minimo + " y " + maximo + ": ");
        for (int i = numero; i <= 10; i++) {
          int numeroAleatorio = (int)(Math.random() * (maximo - minimo + 1)) + minimo;
          System.out.println(numeroAleatorio);
        }
        entrada.close();
    }
}