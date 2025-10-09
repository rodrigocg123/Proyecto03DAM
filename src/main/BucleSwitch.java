

public class BucleSwitch {
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(args[0]);
        char operacion = args[1].charAt(0);
        int numero2 = Integer.parseInt(args[2]);
        int resultado = 0;
        if (operacion == '+'){
           System.out.println(numero1 + numero2); 
        }

        switch (operacion) {
            case '+':
                resultado = numero1 + numero2;
                System.out.println("La suma es: " + resultado);
                break;
            case '-':
                resultado = numero1 - numero2;
                System.out.println("La resta es: " + resultado);
                break;
            case '*':
                resultado = numero1 * numero2;
                System.out.println("La multiplicacion es: " + resultado);
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("La division es: " + resultado);
                } else {
                    System.out.println("Error: Division por cero no es permitida.");
                }
                break;
            default:
                System.out.println("Operacion no valida. Use +, -, * o /.");
        }
    }
}