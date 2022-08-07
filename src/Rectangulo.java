
import java.util.Scanner;

public class Rectangulo {

    public static void main(String args[]) {
        var solicitar = new Scanner(System.in);

        System.out.println("Ingrese la altura:");
        var alto = Integer.parseInt(solicitar.nextLine());
        System.out.println("Ingrese el ancho:");
        var ancho = Integer.parseInt(solicitar.nextLine());

        var area = alto * ancho;
        var perimetro = (alto * ancho) * 2;

        System.out.println("El area del rectangulo es = " + area);
        System.out.println("El perimetro del rectangulo es = " + perimetro);
    }
}
