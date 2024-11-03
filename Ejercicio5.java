import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
 
        var scanner = new Scanner(System.in);

        System.out.println( "Ingrese el valor del PC gamer que desea comprar: " );
        var precio =  scanner.nextDouble();

        System.out.println( "Ingrese el valor del descuento sin signos: ");
        var descuento = scanner.nextDouble();

        var totalaPagar = precio - (precio * descuento / 100 );



        System.out.println("El valor total a pagar es de: " + totalaPagar );

        scanner.close();

    }
}
