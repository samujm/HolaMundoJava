
import java.util.Scanner;

public class TipoChar {

    public static void main(String args[]) {
        char miCaracter = 'a'; //Almacena solo un caracter pero tambien valores decimales
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; //Convierte al tipo char por que es char, representa el valor
        System.out.println("varCharDecimal = " + varCharDecimal);
        //https://en.wikipedia.org/wiki/List_of_Unicode_characters
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //CON VAR

        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal2 = 33; //No se puede asignar char a var pues lo toma como entero
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
  
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        //un char se puede convertir a un entero pero se convierte a su decimal
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
    }
}
