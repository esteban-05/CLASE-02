import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

System.out.println("----- MEDIA ARITMÉICA -----");

System.out.print("Digite los números que quiere sumar: ");
double num1 = scanner.nextDouble();

System.out.print("Digite los números que quiere sumar: ");
double num2 = scanner.nextDouble();

System.out.print("Digite los números que quiere sumar: ");
double num3 = scanner.nextDouble();


double result = (num1 + num2 + num3) /3;


System.out.print("La media aritmética entre los 3 números es:  " +  result);


        scanner.close();
    }
}
