public class CuentaAtras {
    public static void main(String[] args) {

         System.out.println("este es el contador con el bucle for: ");
        for (int i = 200; i >= 0; i= i-5) {
            System.out.println(i);
        }

        System.out.println("¡Despegue!");
        System.out.println("este es el contador con el bucle while ");
        int contador =200;
        while (contador >= 0) {
            System.out.println(contador);
            contador -= 5;
        }
    }
}
