
public class CicloFor {

    public static void main(String args[]) {
        for (var contador = 0; contador < 3; contador++) {
            //Contador ya no puede ser utilizada fuera del ciclo for
            System.out.println("contador = " + contador);
        }
    }
}
