
public class BreakContinue {

    public static void main(String args[]) {
        
        inicio: //viene a la linea de codigo que dice continue
        for (var contador = 0; contador < 3; contador++) {
            //Contador ya no puede ser utilizada fuera del ciclo for
            if (contador % 2 != 0) {
                continue inicio; //Omite las siguientes lineas y continua a la siguiente iteración del ciclo for (en este caso ya no imprime el contador)
            }
            System.out.println("contador = " + contador);
        }
        
//        for (var contador = 0; contador < 3; contador++) {
//            //Contador ya no puede ser utilizada fuera del ciclo for
//            if (contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break; //Rompe el ciclo que se está ejecutando
//            }
//        }
    }
}

