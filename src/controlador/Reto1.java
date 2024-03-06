
package controlador;

import vista.*;
import java.util.ArrayList;
import modelo.estudiante;


public class Reto1 {

    public static ArrayList<estudiante> estudiantes;
    
    public static void main(String[] args) {
     //principalCtrl.mostrar(); 
     estudiantes = new ArrayList<>();
     ventDatosCtrl.mostrar();
    }
    
}
