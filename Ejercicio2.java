import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        double precio100Gramos = 5.95; 
        

    System.out.println("El precio del Pernil Iberic D'Engreix Llen por cada 100gr es de : " + precio100Gramos);
    System.out.print( "¿Cúantos kilos necesita?:");
    Scanner leer = new Scanner(System.in);
    double kilos = leer.nextDouble();

    var resultado = ( precio100Gramos*10)*kilos;

    System.out.println("El precio de su producto es de: " + resultado );


    leer.close();

    }

}