package clases;

public class Persona { //Para acceder a una clase desde otro archivo esta debe ser public, nombre de la clase debe iniciar en mayuscula
    //Atributos al inicio
    //Atributo es una caracteristica que vamos a asociar a nuestra clase

    String nombre;
    String apellido;

    //Despues los metodos
    //Metodo es una parte de codigo que vamos a poder reutilizar
    //se puede mandar llamar tantas veces como se necesitan
    //puede recibir valores (argumentos)
    //puede regresar valores (valor de retorno)
    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}