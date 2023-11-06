import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el radio de la circunferencia
        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        // Calcular la longitud de la circunferencia
        double longitudCircunferencia = 2 * Math.PI * radio;

        // Calcular el área del círculo inscrito
        double areaCirculoInscrito = Math.PI * Math.pow(radio, 2);

        // Imprimir la longitud de la circunferencia
        System.out.println("Longitud de la circunferencia: " + longitudCircunferencia);

        // Imprimir el área del círculo inscrito
        System.out.println("Área del círculo inscrito: " + areaCirculoInscrito);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
