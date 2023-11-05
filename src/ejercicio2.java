import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = input.nextDouble();

        double resultado = num1 + num2;

        System.out.println("La suma de " + num1 + " más " + num2 + " es: " + resultado);
    }
}
