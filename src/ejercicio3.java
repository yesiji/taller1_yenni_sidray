import java.util.Scanner; //al importar la clase scanner me permite pedir datos al usuario por consola


public class ejercicio3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el numero que quieres elevar: ");
        int num = input.nextInt();

        int resultado = num * num;

        //método para imprimir por consola
        // concatené con el signo + las string con variables
        System.out.println("el resultado de elevar " + num + " es " + resultado);
    }
}