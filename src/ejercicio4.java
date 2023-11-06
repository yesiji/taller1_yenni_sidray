import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        double dolar = 1.0;
        double euro = dolar * 1.07;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de Euros: ");
        double numeroIngresado = scanner.nextDouble();

        double conversion = numeroIngresado * euro;

        System.out.println("El valor de " + numeroIngresado + " Euros es: " + conversion + " Dólares");
    }
}
