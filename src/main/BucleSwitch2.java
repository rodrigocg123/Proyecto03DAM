package main;

public class BucleSwitch2 {
    public static void main(String[] args) {
        String dia = args[0].toLowerCase();
        switch (dia) {
            case "Lunes":
                System.out.println("Es un dia laborable, A trabajar!!");
                break;
            case "Martes":
                System.out.println("Es un dia laborable, A trabajar!!");
                break;
            case "Miercoles":
                System.out.println("Es un dia laborable, A trabajar!!");    
                break;
            case "Jueves":
                System.out.println("Es un dia laborable, A trabajar!!");
                break;
            case "Viernes":
                System.out.println("Es un dia laborable, A trabajar!!");    
                break;
            case "Sabado":
                System.out.println("No es dia laborable, A descansar!!");
                break;
            case "Domingo":
                System.out.println("No es dia laborable, A descansar!!");
                break;
            default:
                System.out.println("No es un dia valido");
        }
    }
}
