 
import java.util.Scanner;


/**
 * HolaMundo
 */
public class HolaMundo {

    public static void main(String[] args) {

        System.out.println(10 );

        
        System.out.print("Como van las cosas");
        System.out.print(10);
        System.out.print( 10.5 );
        System.out.print('A');
        System.out.println();

        System.out.printf("Aqui va una cadena %s%n", "Esteban");
        System.out.printf("Aqui va un entero %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Esteban Montoya", 19);


        var entrada = new Scanner(System.in);

        System.out.print( "Por favor ingrese su nombre:" );
        var entero = entrada.nextLine();

        System.out.println(entero);

    
    
        entrada.close();
    }
    
}