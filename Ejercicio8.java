import java.util.Scanner; 

public class Ejercicio8 {
    public static void main(String[] args) {
    var scanner = new Scanner (System.in);

        System.out.println("Ingrese la longitud del rectangulo: ");
        double longitud = scanner.nextDouble();



        System.out.println("Ingrese el ancho del rectangulo: ");
        double ancho = scanner.nextDouble();



var perímetro = longitud * ancho;

        System.out.println("El perímetro del rectangulo es de: " +  perímetro);

        scanner.close();
        
    }

}
