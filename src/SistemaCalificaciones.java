
import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String args[]) {
        var pedirNum = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10:");
        var numero = Integer.parseInt(pedirNum.nextLine());
        var calificacion = "Valor desconocido";

        if (numero >= 9 && numero <= 10) {
            calificacion = "A";
        } else if (numero >= 8 && numero < 9) {
            calificacion = "B";
        } else if (numero >= 7 && numero < 8) {
            calificacion = "C";
        } else if (numero >= 6 && numero < 7) {
            calificacion = "D";
        } else if (numero >= 0 && numero < 6) {
            calificacion = "F";
        } else {
            calificacion = "Valor no valido";
        }
        System.out.println("Calificación = " + calificacion);
    }
}
