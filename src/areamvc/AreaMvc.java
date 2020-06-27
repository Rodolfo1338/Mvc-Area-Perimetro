
package areamvc;

import controlador.controller;
import modelo.Model;
import vista.Frmvista;



public class AreaMvc {

    
    
    public static void main(String[] args) {
        
        Model mod= new Model();
        Frmvista vist = new Frmvista();
        
        controller cont = new controller(mod, vist);
        
        cont.iniciar();
        vist.setVisible(true);
    }
    
}
