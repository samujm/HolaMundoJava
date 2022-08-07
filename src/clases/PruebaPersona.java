
package clases;


public class PruebaPersona {
    public static void main(String[] args) {
        //definir una variable del tipo de la variable persona
        Persona persona1; //Declarando una variable de tipo persona
        persona1 = new Persona(); //Constructor de persona, crear un nuevo objeto de tipo Persona, ya se puede acceder a los atributos y metodos
        
        
        persona1.nombre = "Juan"; //Accediento al atributo nombre y asignando valor
        persona1.apellido = "Perez";
        persona1.despegarInformacion();
        
    }
}

