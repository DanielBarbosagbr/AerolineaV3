package vista;

import java.awt.*;


import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel de botones de interacci�n con el programa del avi�n.
 */
@SuppressWarnings("serial")
public class PanelBotones extends JPanel 
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Opci�n registrar.
     */
    public final static String REGISTRAR = "REGISTRAR_PASAJERO";

    /**
     * Opci�n anular.
     */
    public final static String ANULAR = "ANULAR_PASAJERO";

    /**
     * Opci�n buscar.
     */
    public final static String BUSCAR = "BUSCAR_PASAJERO";

    /**
     * Opci�n porcentaje de ocupaci�n.
     */
    public final static String PORCENTAJE = "PORCENTAJE_OCUPACION";

    /**
     * Opci�n extensi�n 1.
     */
    private final static String OPCION_1 = "OPCION_1";

    /**
     * Opci�n extensi�n 2.
     */
    private final static String OPCION_2 = "OPCION_2";

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Bot�n Registro de nuevo pasajero.
     */
    private JButton bRegistro;

    /**
     * Bot�n Anular.
     */
    private JButton bAnular;

    /**
     * Bot�n de b�squeda.
     */
    private JButton bBuscarPasajero;

    /**
     * Bot�n porcentaje de ocupaci�n.
     */
    private JButton bPorcOcupacion;

    /**
     * Bot�n de extensi�n 1.
     */
    private JButton botonOpcion1;

    /**
     * Bot�n de extensi�n 2.
     */
    private JButton botonOpcion2;

    /**
     * Interfaz principal.
     */
    private InterfazAvion ventana;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel de botones. <br>
     * <b>post: </b> Se crean y alistan los botones de la interfaz.
     * @param pVentana Ventana o frame padre. pVentana != null.
     */
    public PanelBotones( )
    {


        // Configura propiedades visuales
        setLayout( new GridLayout( 2, 3, 8, 2 ) );
        setBorder( new EmptyBorder( 5, 5, 5, 5 ) );

        // Bot�n registrar
        bRegistro = new JButton( "Registrar Pasajero" );
        bRegistro.setActionCommand( REGISTRAR );
       
        bRegistro.setPreferredSize( new Dimension( 40, 10 ) );
        add( bRegistro );

        // Bot�n anular registro
        bAnular = new JButton( "Eliminar Pasajero" );
        bAnular.setActionCommand( ANULAR );
       
        add( bAnular );

        // Bot�n buscar pasajero
        bBuscarPasajero = new JButton( "Buscar Pasajero" );
        //bBuscarPasajero.setActionCommand( BUSCAR );
        
        add( bBuscarPasajero );

        // Bot�n porcentaje de ocupaci�n
        bPorcOcupacion = new JButton( "Porcentaje Ocupaci�n" );
        bPorcOcupacion.setActionCommand( PORCENTAJE );
        
        add( bPorcOcupacion );

        // Botones de opciones adicionales
        botonOpcion1 = new JButton( "Opci�n 1" );
        botonOpcion1.setActionCommand( OPCION_1 );
       
        add( botonOpcion1 );
        botonOpcion2 = new JButton( "Opci�n 2" );
        botonOpcion2.setActionCommand( OPCION_2 );
       
        add( botonOpcion2 );
    }

    public static String getRegistrar() {
        return REGISTRAR;
    }

    public static String getAnular() {
        return ANULAR;
    }

    public static String getBuscar() {
        return BUSCAR;
    }

    public static String getPorcentaje() {
        return PORCENTAJE;
    }

    public static String getOpcion1() {
        return OPCION_1;
    }

    public static String getOpcion2() {
        return OPCION_2;
    }

    public JButton getbRegistro() {
        return bRegistro;
    }

    public void setbRegistro(JButton bRegistro) {
        this.bRegistro = bRegistro;
    }

    public JButton getbAnular() {
        return bAnular;
    }

    public void setbAnular(JButton bAnular) {
        this.bAnular = bAnular;
    }

    public JButton getbBuscarPasajero() {
        return bBuscarPasajero;
    }

    public void setbBuscarPasajero(JButton bBuscarPasajero) {
        this.bBuscarPasajero = bBuscarPasajero;
    }

    public JButton getbPorcOcupacion() {
        return bPorcOcupacion;
    }

    public void setbPorcOcupacion(JButton bPorcOcupacion) {
        this.bPorcOcupacion = bPorcOcupacion;
    }

    public JButton getBotonOpcion1() {
        return botonOpcion1;
    }

    public void setBotonOpcion1(JButton botonOpcion1) {
        this.botonOpcion1 = botonOpcion1;
    }

    public JButton getBotonOpcion2() {
        return botonOpcion2;
    }

    public void setBotonOpcion2(JButton botonOpcion2) {
        this.botonOpcion2 = botonOpcion2;
    }

    public InterfazAvion getVentana() {
        return ventana;
    }

    public void setVentana(InterfazAvion ventana) {
        this.ventana = ventana;
    }

   
}