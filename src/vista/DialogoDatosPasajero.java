package vista;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;


import modelo.*;
import modelo.Asiento.Clase;
import modelo.Asiento.Ubicacion;

/**
 * Formulario para presentar los datos y el registro del pasajero.
 */
@SuppressWarnings("serial")
public class DialogoDatosPasajero extends JDialog{
    
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Opci�n Aceptar.
     */
    public final static String ACEPTAR = "ACEPTAR";

    // -----------------------------------------------------------------
    // Atributos de Interfaz
    // -----------------------------------------------------------------

    /**
     * Interfaz principal.
     */
    private InterfazAvion principal;

    /**
     * Texto que contiene la c�dula.
     */
    private JTextField txtCedula;

    /**
     * Texto que contiene el nombre.
     */
    private JTextField txtNombre;

    /**
     * Texto que contiene la clase.
     */
    private JTextField txtClase;

    /**
     * Texto que contiene la ubicaci�n.
     */
    private JTextField txtUbicacion;

    /**
     * Texto que contiene la silla.
     */
    private JTextField txtSilla;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la ventana con los datos del pasajero.
     * @param pPrincipal Ventana o frame padre del di�logo. pPrincipal != null.
     * @param pSilla Silla en la que el pasajero est� ubicado.
     */
    public DialogoDatosPasajero( InterfazAvion pPrincipal, Asiento pSilla )
    {
        principal = pPrincipal;

        setTitle( "Datos del pasajero" );
        setSize( 270, 200 );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );

        Pasajero pasajero = pSilla.darPasajero( );
        setLayout( new BorderLayout( ) );

        // Crea el panel de datos del pasajero
        JPanel panelDatosPasajero = new JPanel( );

        panelDatosPasajero.setBorder( new CompoundBorder( new TitledBorder( "Datos del pasajero" ), new EmptyBorder( 3, 3, 3, 3 ) ) );
        panelDatosPasajero.setLayout( new GridLayout( 5, 2, 1, 1 ) );

        // C�dula
        JLabel etiquetaCedula = new JLabel( "C�dula: " );
        panelDatosPasajero.add( etiquetaCedula );

        txtCedula = new JTextField( pasajero.darCedula( ) + "" );
        txtCedula.setEditable( false );
        panelDatosPasajero.add( txtCedula );

        // Nombre
        JLabel etiquetaNombre = new JLabel( "Nombre: " );
        panelDatosPasajero.add( etiquetaNombre );

        txtNombre = new JTextField( pasajero.darNombre( ) );
        txtNombre.setColumns( 15 );
        txtNombre.setEditable( false );
        panelDatosPasajero.add( txtNombre );

        // Silla
        JLabel etiquetaSilla = new JLabel( "Silla: " );
        panelDatosPasajero.add( etiquetaSilla );

        txtSilla = new JTextField( pSilla.darNumero( ) + "" );
        txtSilla.setEditable( false );
        panelDatosPasajero.add( txtSilla );

        // Clase
        JLabel etiquetaClase = new JLabel( "Clase: " );

        panelDatosPasajero.add( etiquetaClase );
        String sClase;
        if( pSilla.darClase( ) == Clase.ECOCLASE )
        {
            sClase = "Econ�mica";
        }
        else
        {
            sClase = "Ejecutiva";
        }
        txtClase = new JTextField( sClase );
        txtClase.setEditable( false );
        panelDatosPasajero.add( txtClase );

        // Ubicaci�n
        JLabel etiquetaUbicacion = new JLabel( "Ubicaci�n: " );
        panelDatosPasajero.add( etiquetaUbicacion );

        String sUbicacion;
        if( pSilla.darUbicacion( ) == Ubicacion.IZQUIERDA )
        {
            sUbicacion = "Derecha";
        }
        else
        {
            sUbicacion = "Izquierda";
        }
        
        txtUbicacion = new JTextField( sUbicacion );
        txtUbicacion.setEditable( false );
        panelDatosPasajero.add( txtUbicacion );
        add( panelDatosPasajero, BorderLayout.CENTER );

        setModal( true );
        setLocationRelativeTo( principal );
        setResizable( false );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

}




