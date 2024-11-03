import java.util.Scanner; 

public class Ejercicio6 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

       System.out.println("Ingrese el precio del pantalon: ");
       int precioPantalon = scanner.nextInt(); 



       System.out.println("Ingrese el porcentaje del descuento: ");
       double porcentajeDes = scanner.nextDouble(); 

       double precioTotal = precioPantalon / (1 - (porcentajeDes / 100.0));
      
       System.out.println("El precio total sin el descuento del producto es de: " + precioTotal);


       scanner.close();
}


}


