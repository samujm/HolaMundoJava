package pasoporreferencia;

import clases.Persona;

//paso por valor por referencia
//El valor que recibe es la referencia, a donde apunta
//OBJETOS SE PUEDEN ACCEDER POR OTROS METODOS
public class PasoPorReferencia {

    public static void main(String[] args) {
        //Persona persona1 = new Persona();
//        persona1.nombre = "Juan"; //no se puede acceder desde otro paquete, los atributos deben tener public
//        System.out.println("persona1 nombre: " + persona1.nombre);
        Persona persona1 = null;
        persona1 = cambiarValor(persona1); //3.- Regresa en la variable
       // System.out.println("persona1 cambio nombre: " + persona1.nombre);
    }

    //definir un metodo
    public static Persona cambiarValor(Persona persona) { //1.- Regresa el metodo persona
        if (persona == null) { //Si no esta apuntando a una 
            System.out.println("valor de persona invalido: null");
            return persona;
        }
        persona.nombre = "Karla"; //No se necesita regresar
        return persona; //2.- se agrega el return, la referencia del objeto que ya fue cambiada en memoria en la linea anterior
    }

    /* public static void cambiarValor(Persona persona){ //OTRA FORMA: Si es void solo con agregar el return ; que se manda llamar al final del metodo para regresar a la linea de control que hizo la llamada
        persona.nombre = "Karla"; //No se necesita regresar
        return ; //No es necesario ponerla, el compilador lo hace 
    }*/
    //SI SE AGREGA RETURN ANTES YA NO SE EJECUTAN LAS SIGUIENTES LINEAS YA QUE REGRESA AL METODO QUE HIZO LA LLAMADA
}
