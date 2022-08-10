package palabrathis;

//THIS VA APUNTANDO A LOS OBJETOS SEGUN EL OBJETO QUE SE ESTÁ EJECUTANDO EN ESE MOMENTO
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: = " + persona.nombre);
        System.out.println("persona apellido: = " + persona.apellido);

    }
}

//PAQUETE
//es default o package, solo se puede acceder a ella desde el mismo paquete y utilizar tambien
class Persona { //Las otras clases ya no pueden ser publicas, solo puede existir una en un mismo archivo

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //super(); //constructor de la clase padre, de la clase object, es implicita su llamada
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " + this); //primero se ejecuta el objeto por eso sale primero
        new Imprimir().imprimir(this); //Creando un nuevo objeto que ya regresa una referencia, no es necesario asignarla a una variable
    }
}


class Imprimir{
    
    public Imprimir(){
        super(); //El constructor de la clase objetct (padre) para reservar memoria
    }
    
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir = " + persona);
        System.out.println("impresion del objeto actual (this) = " + this); //IMPRIME EL OBJETO QUE ESTA EJECUTANDO EN ESE MOMENTO, OSEA IMPRMIR
    } 
}