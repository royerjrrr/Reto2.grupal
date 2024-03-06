
package controlador;

import vista.*;

public class principalCtrl {
    public static vistaPrincipal ventana = new vistaPrincipal();
    //Metodos para la ventana principal
    public static void mostrar() {ventana.setVisible(true);}
    public static void ocultar() {ventana.setVisible(false);}
    
}
