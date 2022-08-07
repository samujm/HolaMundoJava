
import java.util.Scanner;

public class NumeroMayor {

    public static void main(String args[]) {
        var solicitar = new Scanner(System.in);

        System.out.println("Ingrese primer numero:");
        var n1 = Integer.parseInt(solicitar.nextLine());
        System.out.println("Ingrese segundo numero:");
        var n2 = Integer.parseInt(solicitar.nextLine());

        System.out.println("El numero mayor es: ");
        System.out.println(n1 > n2 ? n1 : n2);

    }
}
