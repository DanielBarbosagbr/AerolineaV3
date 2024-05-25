package vista;


import java.awt.*;
import java.text.*;
import javax.swing.*;

import modelo.Nave;



/**
 * Ventana principal del avi�n.
 */
@SuppressWarnings("serial")
public class InterfazAvion extends JFrame
{
    
    private Nave nave; 
    private Banner banner; 
    private PanelBotones panelBotones;
    private MapaAsientos mapaAsientos;
    
    //private DialogoDatosPasajero datosPasajero; 
    



    public InterfazAvion (){


        setTitle( "POO AIRLINE" );
        setSize( 580, 700 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        //crea la nave
        nave = new Nave();


        // Configura la interfaz
        setLayout( new BorderLayout( ) );

        // Panel del banner
        banner = new Banner( );
        panelBotones = new PanelBotones();
        mapaAsientos = new MapaAsientos( nave );
        

        add( banner, BorderLayout.NORTH );
        add( mapaAsientos, BorderLayout.CENTER);
        add( panelBotones, BorderLayout.SOUTH );

        setResizable( false);
        setLocationRelativeTo( null );
    }

    


    public Banner getBanner() {
        return banner;
    }


    public void setBanner(Banner banner) {
        this.banner = banner;
    }


    public PanelBotones getPanelBotones() {
        return panelBotones;
    }


    public void setPanelBotones(PanelBotones panelBotones) {
        this.panelBotones = panelBotones;
    }

    
    public MapaAsientos getMapaAsientos() {
        return mapaAsientos;
    }


    public void setMapaAsientos(MapaAsientos mapaAsientos) {
        this.mapaAsientos = mapaAsientos;
    }

    

    public void actualizar( Nave avion)
    {
        remove( mapaAsientos );

        // Panel del avi�n
        mapaAsientos = new MapaAsientos( avion );
        add( mapaAsientos, BorderLayout.CENTER );
        validate( );
    }
    
    public void mostrarPorcentaje (double porcentaje){
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "###.##" );
        JOptionPane.showMessageDialog( this, "El porcentaje de ocupaci�n es " + df.format( porcentaje ) + "%", "Ocupaci�n del avi�n", JOptionPane.INFORMATION_MESSAGE );

        
    }

    /**
     * pregunta por la cedula del pasajero. 
     * @return retorna el numero de cedula.
     */
    public String preguntarCedula (){

        String cedula = JOptionPane.showInputDialog( this, "Ingrese el n�mero de c�dula", "Eliminar pasajero", JOptionPane.QUESTION_MESSAGE );

        return cedula;

    }

    /**
     * muestra un mensaje en el que informa que el pasajero no esta registrado en ninguna silla. 
     */
    public void pasajeroNulo (){

        JOptionPane.showMessageDialog( this, "El pasajero no se encuentra registrado", "Busqueda de pasajero", JOptionPane.ERROR_MESSAGE );

    }
     /**
     * Muestra mensaje que cuenta la eliminacion satisfactoria de pasajero. 
     */
    public void pasajeroEliminado (){

        JOptionPane.showMessageDialog( this, "Pasajero eliminado.", "Eliminar pasajero", JOptionPane.INFORMATION_MESSAGE );

    }
    /**
     * pide el numero de silla deseada. 
     * @return retorna el numero de silla a la que se asignara el pasajero. 
     */
    public int preguntarSilla (){

        int numSilla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de silla deseada: ")); 

        return numSilla;
    }
    /**
     * Muestra mensaje de error.
     */
    public void mostrarInputmitmach(){
        JOptionPane.showMessageDialog(null, "Ingrese una opcion valida!!!","Error",JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Muestra menu para acceder al programa.
     * @return retorna la opcion escogida por el usuario
     */
    public String mostrarMenu(){

        String opc = (JOptionPane.showInputDialog(null,"Seleccione una opción ","Selección de opción",
                        JOptionPane.QUESTION_MESSAGE,null,new Object[]{"Ingresar.","Registrar nuevo funcionario."},
                        "Seleccionar")).toString();
        return opc;

    }
    /**
     * Pregunta el nombre de usuario que va a tener el funcionario que controla eel programa.
     * @return nombre del funcionario para ser guardado en el archivo txt.
     */
    public String preguntarNombreFuncionario(){

        String nombre = JOptionPane.showInputDialog(null,"Ingrese Nombre de Usuario: ");

        return nombre;
    }
    /**
     * Pregunta el nombre de usuario que va a tener el funcionario que controla eel programa.
     * @return nombre del funcionario para ser guardado en el archivo txt.
     */
    public String preguntarContraseñaFuncionario(){

        String contraseña = JOptionPane.showInputDialog(null,"Ingrese Contraseña de Usuario: ");

        return contraseña;
    }
    /**
     * Muestra mensaje de error al ingresar contraseña.
     */
    public void contraseñaErrada(){
        JOptionPane.showMessageDialog(null, "El nombre de usuario y/o contraseña son incorrectos!","Error",JOptionPane.ERROR_MESSAGE);
    }
    public void mostrarRegistroExitoso (){
        JOptionPane.showMessageDialog(null, "Registro de funcionario exitoso","Registro",JOptionPane.INFORMATION_MESSAGE);
    }
}




   

    
    



