
public class OperadoresCondicionales {

    public static void main(String args[]) {
        var a = -1;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= valorMinimo && a <= valorMaximo;

        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera de rango");
        }

        //Operador or
        var vacaciones = false;
        var diaDescanso = true;
        
        if (vacaciones || diaDescanso) {
            System.out.println("Padre puede asistir al juego de su hijo");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
}
