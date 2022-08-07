
public class OperadorTernario {

    public static void main(String args[]) {
        //Tiene tres partes y dependiendo regresa un valor
        //Simplificación de if-else
        //Solo para expresiones sencillas
        var resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
    }
}
