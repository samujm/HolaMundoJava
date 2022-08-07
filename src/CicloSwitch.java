
public class CicloSwitch {

    public static void main(String args[]) {
        //Recomendada para menus
        var numero = 2;
        var numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
