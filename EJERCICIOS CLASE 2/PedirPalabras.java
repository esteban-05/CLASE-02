import java.util.Scanner;

public class PedirPalabras {

    public static void main(String[] args) {
        
        var entrada = new Scanner(System.in);

        System.out.println(" Por favor Ingrese su nombre: ");
        entrada.nextLine();

        System.out.println(" Ingrese su edad:   ");
        entrada.nextInt();


        System.out.println(" ¿Cúal es su ciudad natal?:  ");
        entrada.nextLine();


        entrada.close();
        
    }

    
}