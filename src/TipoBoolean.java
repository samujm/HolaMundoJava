
import java.util.Scanner;

public class TipoBoolean {

    public static void main(String args[]) {
        //Almacena falso o verdadero
        //Valores de tipo bandera
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if (varBoolean == true) {
            System.out.println("La bandera es verdadera");
        } else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        //var esAdulto = edad >= 18; //Regresa true o false
        
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
