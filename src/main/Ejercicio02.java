import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String password = "Hola1234";
        int intentos = 3;
        do {
            System.out.print("Introduce la contraseña (mínimo 8 caracteres, al menos una mayúscula, una minúscula y un dígito): ");
            String passUsuario = entrada.nextLine();
            intentos--;
            
            if (passUsuario.equals(password)) {
                System.out.println("Contraseña correcta. Acceso concedido.");
                break;
            } else {
                System.out.println("Contraseña incorrecta. Te quedan " + intentos + " intentos.");
            }
        } while (intentos > 0);
    }
}
