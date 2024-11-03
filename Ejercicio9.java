import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("-------- Conversión de Temperaturas --------");

        
        System.out.print("Ingrese la temperatura en Celsius que quiere convertir: ");
        double celsius = scanner.nextDouble(); 

      
        double gradosF = celsius * 9/5 + 32;
        double gradosK = celsius + 273.15;

        System.out.println("La temperatura en grados Fahrenheit es: " + gradosF);
        System.out.println("La temperatura en grados Kelvin es: " + gradosK);

        scanner.close();
    }

 }

