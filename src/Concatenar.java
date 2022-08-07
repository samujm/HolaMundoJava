
public class Concatenar {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); //Se realiza la suma de numeros
        System.out.println(i + j + usuario); //Evaluacion de izq a der, realiza suma
        System.out.println(usuario + i + j); //Contexto cadena, si primero encuentra una cadena todo lo demas lo va a tomar como una cadena
        System.out.println(usuario + (i + j)); //Se utiliza parentesis para modificar la prioridad, primero se realiza la suma y despues se concatena con la variable
    }
}
