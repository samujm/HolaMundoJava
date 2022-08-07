
import java.util.Scanner;

public class ConversionTipos {

    public static void main(String args[]) {
        //Convertir tipo String a un tipo int

        var edad = Integer.parseInt("20");  //Recibe el valor de una cadena y lo convierte en entero
        //var edad = "20";
        System.out.println("Edad = " + (edad + 1));
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        
        //Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("Edad = " + edad);
        
        
        //Convertir int a string
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1); //Solicitar solo un caracter, se convierte en char, solo string contiene charAt
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0); //Recupera el primer caracter
        System.out.println("caracter = " + caracter);
        
    }
}
