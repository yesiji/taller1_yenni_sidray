import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        // Definir el valor de pi
        final double pi = 3.14;

        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio del cilindro
        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();

        // Solicitar al usuario que ingrese la altura del cilindro
        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el área del cilindro
        double areaCilindro = 2 * pi * radio * altura;

        // Calcular el volumen del cilindro
        double volumenCilindro = pi * Math.pow(radio, 2) * altura;

        // Imprimir el área del cilindro
        System.out.println("Área del cilindro: " + areaCilindro);

        // Imprimir el volumen del cilindro
        System.out.println("Volumen del cilindro: " + volumenCilindro);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
