
package pasoporreferencia;

import clases.Persona;

//paso por valor por referencia
//El valor que recibe es la referencia, a donde apunta
//OBJETOS SE PUEDEN ACCEDER POR OTROS METODOS

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan"; //no se puede acceder desde otro paquete, los atributos deben tener public
        System.out.println("persona1 nombre: " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("persona1 cambio nombre: " + persona1.nombre);
    }
    
    //definir un metodo
    public static void cambiarValor(Persona persona){
        persona.nombre = "Karla"; //No se necesita regresar
    }
}
