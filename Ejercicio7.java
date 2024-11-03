import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

       var scanner = new Scanner(System.in);

       System.out.println("-----CALCULADORA-----");
        
       System.out.println();

        System.out.println("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: "); 
        double num2 = scanner.nextDouble();

        System.out.println();

        double resultado = num1 + num2;
        double resultado1 = num1 - num2;
        double resultado2 = num1 * num2;
        double resultado3 = num1 / num2;


        System.out.println("El resultado de la suma es " + resultado );
        System.out.println("El resultado de la resta es: " + resultado1);
        System.out.println("El resultado de la multiplicación es: " + resultado2);
        System.out.println("El resultado de la division es: " + resultado3 );
        
        scanner.close();
    }
}
