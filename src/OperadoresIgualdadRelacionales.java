
public class OperadoresIgualdadRelacionales {

    public static void main(String args[]) {
        var a = 3;
        var b = 2;

        //operador de igualdad ==
        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        var cadena = "hola";
        var cadena2 = "hola";
        var e = cadena == cadena2; //Compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena.equals(cadena2); //Compara contenido de cadenas
        System.out.println("f = " + f);

        var g = a >= b; //mayor que > o el mayor o igual >=
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        var edad = 10;
        var adulto = 18;

        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
    }

}
