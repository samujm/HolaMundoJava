
public class OperadoresAritmeticos {

    public static void main(String args[]) {

        int a = 3, b = 2; //Si se ocupa var no se puede definir varias variables
        var resultado = a + b;
        System.out.println("Resultado de la suma = " + resultado);

        resultado = a - b;
        System.out.println("Resultado de la resta = " + resultado);

        resultado = a * b;
        System.out.println("Resultado de la multiplicación = " + resultado);

        var resultado2 = 3D / b; //debido a que las dos son enteros, el resultado es entero, LITERAL D CONVIERTE
        System.out.println("Resultado de la division = " + resultado2);

        resultado = a % b;
        System.out.println("Residuo de la división (modulo) = " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es un número par");
        } else {
            System.out.println("Es un número impar");
        }

    }
}
