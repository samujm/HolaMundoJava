package palabrathis;

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
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
