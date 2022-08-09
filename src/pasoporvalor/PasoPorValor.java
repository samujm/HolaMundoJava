package pasoporvalor;

public class PasoPorValor {

    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);

        cambioValor(x);//Se pasa una copia al metodo que se esta llamando

        System.out.println("x nuevo valor= " + x);

    }

    public static void cambioValor(int arg1) {
        System.out.println("arg1 = " + arg1); 
        arg1 = 15; //No cambia el valor desde otro metodo, alcance de variables
    }

}
