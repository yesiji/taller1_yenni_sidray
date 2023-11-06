import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el lado del cuadrado
        System.out.print("Ingresa el lado del cuadrado: ");
        double ladoDelCuadrado = scanner.nextDouble();

        // Calcular el área del cuadrado
        double area = ladoDelCuadrado * ladoDelCuadrado;

        // Calcular el perímetro del cuadrado
        double perimetro = ladoDelCuadrado * 4;

        // Imprimir los resultados en la consola
        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
