package vista;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import modelo.*;


/**
 * Formulario para la asignaci�n de sillas.
 */
@SuppressWarnings("serial")
public class DialogoAsignacion extends JDialog implements ActionListener {

    
    
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Opci�n Aceptar.
     */
    public final static String ACEPTAR = "ACEPTAR";

    /**
     * Opci�n Cancelar.
     */
    public final static String CANCELAR = "CANCELAR";

    /**
     * Avi�n.
     */
    private Nave avion;

    // -----------------------------------------------------------------
    // Atributos de interfaz
    // -----------------------------------------------------------------

    /**
     * Interfaz principal.
     */
    private InterfazAvion principal;

    /**
     * Panel con los botones.
     */
    private JPanel panelBotones;

    /**
     * Panel con los datos.
     */
    private JPanel panelDatos;

    /**
     * Bot�n aceptar.
     */
    private JButton botonAceptar;

    /**
     * Bot�n cancelar.
     */
    private JButton botonCancelar;

    /**
     * Texto de ingreso de c�dula.
     */
    private JTextField txtCedula;

    /**
     * Texto de ingreso de c�dula.
     */
    private JTextField txtNombre;


    int numeroSilla ;

    /**
     * Crea el formulario de asignaci�n de pasajeros.
     * @param pPrincipal Ventana o frame padre del di�logo. pPrincipal != null.
     * @param pAvion Avi�n sobre el que se har� la asignaci�n. pAvion != null.
     */
    public DialogoAsignacion( InterfazAvion pPrincipal, Nave pAvion, int numero )
    {

        numeroSilla = numero;

        // Guarda la referencia a la ventana padre
        principal = pPrincipal;

        // Guarda la referencia al avi�n
        avion = pAvion;

        setTitle( "Registro de pasajero" );
        setSize( 300, 230 );
        setDefaultCloseOperation( JDialog.DISPOSE_ON_CLOSE );

        setLayout( new BorderLayout( ) );

        JPanel panelAux = new JPanel( );
        panelAux.setBorder( new EmptyBorder( 10, 10, 10, 10 ) );
        panelAux.setLayout( new BorderLayout( ) );
        add( panelAux, BorderLayout.CENTER );

        // Crea el panel de datos
        inicializarPanelDatos( );
        panelAux.add( panelDatos, BorderLayout.CENTER );

        // Crea el panel de botones
        inicializarPanelBotones( );
        panelAux.add( panelBotones, BorderLayout.SOUTH );

        setModal( true );
        setLocationRelativeTo( principal );
        setResizable( false );
    }

    public void registrar( int nSilla)
    {

        String nombre;
        String cedula;
        Pasajero pasajero;

        nombre = txtNombre.getText( );
        cedula = txtCedula.getText( );

        if( cedula == null || cedula.equals( "" ) )
        {
            JOptionPane.showMessageDialog( this, "La c�dula es requerida", "Registro", JOptionPane.ERROR_MESSAGE );
        }
        else
        {
           
                if( nombre == null || nombre.equals( "" ) )
                {
                    JOptionPane.showMessageDialog( this, "El nombre es requerido", "Registro", JOptionPane.ERROR_MESSAGE );
                }
                else
                {
                    // Crea al pasajero
                    pasajero = new Pasajero( cedula, nombre );

                    // Verifica que no este ya el pasajero registrado
                    Asiento silla = avion.buscarPasajero( pasajero );

                    if( silla != null )
                    {
                      JOptionPane.showMessageDialog( this, "El pasajero ya tiene una silla asignada", "Registro", JOptionPane.ERROR_MESSAGE );
                    }
                    else
                    {

                            avion.asignarSilla( pasajero , nSilla );

                            //principal.actualizar( );
                            dispose( );
                        }
                    }

                }

            

        }

        /**
     * Inicializa el panel con los datos del pasajero.
     */
    public void inicializarPanelDatos( )
    {
        panelDatos = new JPanel( );
        panelDatos.setLayout( new GridLayout( 4, 1, 1, 6 ) );
        panelDatos.setBorder( BorderFactory.createTitledBorder( "Datos del pasajero" ) );

        // C�dula
        JPanel panelCedula = new JPanel( );
        panelCedula.setLayout( new FlowLayout( FlowLayout.RIGHT, 5, 0 ) );
        JLabel etiquetaCedula = new JLabel( "C�dula " );
        txtCedula = new JTextField( );
        txtCedula.setColumns( 15 );
        panelCedula.add( etiquetaCedula );
        panelCedula.add( txtCedula );
        panelDatos.add( panelCedula );

        // Nombre
        JPanel panelNombre = new JPanel( );
        panelNombre.setLayout( new FlowLayout( FlowLayout.RIGHT, 5, 0 ) );
        JLabel etiquetaNombre = new JLabel( "Nombre " );
        txtNombre = new JTextField( );
        txtNombre.setColumns( 15 );
        panelNombre.add( etiquetaNombre );
        panelNombre.add( txtNombre );
        panelDatos.add( panelNombre );


       
    }


    /**
     * Inicializa el panel con los botones.
     */
    public void inicializarPanelBotones( )
    {
        panelBotones = new JPanel( );
        panelBotones.setLayout( new GridLayout( 1, 2, 8, 1 ) );

        // Aceptar
        botonAceptar = new JButton( );
        botonAceptar.setText( "Aceptar" );
        //botonAceptar.setActionCommand( ACEPTAR );
        botonAceptar.addActionListener( this );
        panelBotones.add( botonAceptar );

        // Cancelar
        botonCancelar = new JButton( );
        botonCancelar.setText( "Cancelar" );
        //botonCancelar.setActionCommand( CANCELAR );
        botonCancelar.addActionListener( this );
        panelBotones.add( botonCancelar );
    }

    //________________________________________
    //setters y getters de botones cancelar y aceptar
    //------------------------------------------



    public JButton getBotonAceptar() {
        return botonAceptar;
    }

    public void setBotonAceptar(JButton botonAceptar) {
        this.botonAceptar = botonAceptar;
    }

    public JButton getBotonCancelar() {
        return botonCancelar;
    }

    public void setBotonCancelar(JButton botonCancelar) {
        this.botonCancelar = botonCancelar;
    }

    
    //ACTION LISTENER

    
    public void actionPerformed(ActionEvent evento) {
        // TODO Auto-generated method stub

        if(evento.getSource() == botonAceptar){
            registrar(numeroSilla);
            principal.actualizar(avion);
            dispose();
            System.out.println("boton aceptar");
        }else if (evento.getSource() == botonCancelar){
            principal.actualizar(avion);
            dispose();
            System.out.println("boton cancelar");
        }



    }


}


    
