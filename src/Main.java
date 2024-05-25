import vista.*;
import modelo.*;
import controlador.*;

public class Main {
    public static void main(String[] args) {

        InterfazAvion vista;
        Nave modelo; 
        Controlador controlador;

        modelo = new Nave();
        vista = new InterfazAvion(); 
    
        
        
        controlador = new Controlador(modelo,vista);
    }


}