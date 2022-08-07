
public class OperadoresUnarios {

    public static void main(String args[]) {
        var a = 3;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //1. preincremento (simbolo de la variable)
        var e = 3;
        var f = ++e; //Primero se debe incrementar la variable y despues utilizar
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        //2. postincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++; //Primero se utiliza el valor de la varaible y despues se incrementa
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //1. predecremento
        var i = 2;
        var j = --i;
        System.out.println("i = " + i); //ya esta decrementado, primero se decrementa y despues se asigna el valor de la variable
        System.out.println("j = " + j);
        //2. posdecremento
        var k = 4;
        var l = k--;
        System.out.println("k = " + k); //primero se usa el valor de la variable y queda pendiente un decremento
        System.out.println("l = " + l); //tenia pendiente un decremento

        
    }
}
