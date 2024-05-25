package vista;

import modelo.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel para el dibujo del avi�n.
 */
@SuppressWarnings("serial")
public class MapaAsientos extends JPanel
{   

     
  

    /**
     * Interfaz principal.
     */
    private InterfazAvion ventana;

    //private Nave nave;
    private Nave avion; 
    private ImageIcon imagen; 

    

    

    JButton asiento1 = new JButton();
    JButton asiento2 = new JButton();
    JButton asiento3 = new JButton();
    JButton asiento4 = new JButton();
    JButton asiento5 = new JButton();
    JButton asiento6 = new JButton();
    JButton asiento7 = new JButton();
    JButton asiento8 = new JButton();
    JButton asiento9 = new JButton();
    JButton asiento10 = new JButton();
    JButton asiento11 = new JButton();
    JButton asiento12 = new JButton();
    JButton asiento13 = new JButton();
    JButton asiento14 = new JButton();

   // Nave nave = new Nave();
    

    
    
    //DialogoAsignacion dialogo = new DialogoAsignacion( ventana, nave);

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel del avi�n. <br>
     * <b>post: <b> Se dibujan el avi�n y todas las sillas.
     * @param pAvion Avi�n que se va a dibujar. pAvion != null.
     */
    public MapaAsientos( Nave pAvion )
    {
        
        super( new BorderLayout() );

            avion = pAvion;


            imagen = new ImageIcon( "./Imagenes/mapa_asientos_def.png" );
            setPreferredSize( new Dimension( imagen.getIconWidth( ), imagen.getIconHeight( ) ) );
            setOpaque( false );  

            dibujarSillas();
    }

    

     /**
     * Dibuja la gr�fica del avi�n.
     * @param pGrafica Gr�ficos del avi�n. pGrafica != null
     */
    public void paint( Graphics pGrafica )
    {
        pGrafica.drawImage( imagen.getImage( ), 57, 0, null, null );
        super.paint( pGrafica );
    }


    private void dibujarSillas()
    {


        int anchoBoton = 20; 
        int altoBoton = 25; 

        

       // Configura propiedades visuales
       setLayout( new GridLayout( 8, 2, 5, 5 ));
       setBorder( new EmptyBorder( 130, 260, 100, 260 ) );

       ImageIcon asientoCEIcon = new ImageIcon("./Imagenes/asiento_clase_economica.jpg");
       ImageIcon asientoPCIcon = new ImageIcon("./Imagenes/asiento_primera_clase.jpg");


        
        asiento1.setBounds(0, 0, anchoBoton, altoBoton);
        asiento1.setEnabled(avion.obtenerEstadoAsientoPC(1));
        asiento1.setIcon(new ImageIcon(asientoPCIcon.getImage().getScaledInstance(asiento1.getWidth(), asiento1.getHeight(), Image.SCALE_SMOOTH)));
        //asiento1.setIcon(new ImageIcon(asientoPCIcon.getImage().getScaledInstance(asiento1.getWidth(), asiento1.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento1);

        
        asiento2.setEnabled(avion.obtenerEstadoAsientoPC(2));
        asiento2.setBounds(0, 0, anchoBoton, altoBoton);
        asiento2.setIcon(new ImageIcon(asientoPCIcon.getImage().getScaledInstance(asiento2.getWidth(), asiento2.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento2);
        
        
        asiento3.setEnabled(avion.obtenerEstadoAsientoPC(3));
        asiento3.setBounds(0, 0, anchoBoton, altoBoton);
        asiento3.setIcon(new ImageIcon(asientoPCIcon.getImage().getScaledInstance(asiento3.getWidth(), asiento3.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento3); 

        
        asiento4.setEnabled(avion.obtenerEstadoAsientoPC(4));
        asiento4.setBounds(0, 0, anchoBoton, altoBoton);
        asiento4.setIcon(new ImageIcon(asientoPCIcon.getImage().getScaledInstance(asiento4.getWidth(), asiento4.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento4); 

        
        asiento5.setEnabled(avion.obtenerEstadoAsientoPC(5));
        asiento5.setBounds(0, 0, anchoBoton, altoBoton);
        asiento5.setIcon(new ImageIcon(asientoPCIcon.getImage().getScaledInstance(asiento5.getWidth(), asiento5.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento5); 

        
        asiento6.setEnabled(avion.obtenerEstadoAsientoPC(6));
        asiento6.setBounds(0, 0, anchoBoton, altoBoton);
        asiento6.setIcon(new ImageIcon(asientoPCIcon.getImage().getScaledInstance(asiento6.getWidth(), asiento6.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento6); 

        JButton espacio1 = new JButton();
        espacio1.setEnabled(false);
        add(espacio1); 

        JButton espacio2 = new JButton(); 
        espacio2.setEnabled(false);
        add(espacio2);

        
        asiento7.setEnabled(avion.obternerEstadoAsiencosCE(7));
        asiento7.setBounds(0, 0, anchoBoton, altoBoton);
        asiento7.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento7.getWidth(), asiento7.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento7);

        
        asiento8.setEnabled(avion.obternerEstadoAsiencosCE(8));
        asiento8.setBounds(0, 0, anchoBoton, altoBoton);
        asiento8.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento8.getWidth(), asiento8.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento8);
        
        
        asiento9.setEnabled(avion.obternerEstadoAsiencosCE(9));
        asiento9.setBounds(0, 0, anchoBoton, altoBoton);
        asiento9.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento9.getWidth(), asiento9.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento9); 

        
        asiento10.setEnabled(avion.obternerEstadoAsiencosCE(10));
        asiento10.setBounds(0, 0, anchoBoton, altoBoton);
        asiento10.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento10.getWidth(), asiento10.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento10); 

        
        asiento11.setEnabled(avion.obternerEstadoAsiencosCE(11));
        asiento11.setBounds(0, 0, anchoBoton, altoBoton);
        asiento11.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento11.getWidth(), asiento11.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento11); 

        
        asiento12.setEnabled(avion.obternerEstadoAsiencosCE(12));
        asiento12.setBounds(0, 0, anchoBoton, altoBoton);
        asiento12.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento12.getWidth(), asiento12.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento12); 

        
        asiento13.setEnabled(avion.obternerEstadoAsiencosCE(13));
        asiento13.setBounds(0, 0, anchoBoton, altoBoton);
        asiento13.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento13.getWidth(), asiento13.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento13);
        
        
        asiento14.setEnabled(avion.obternerEstadoAsiencosCE(14));
        asiento14.setBounds(0, 0, anchoBoton, altoBoton);
        asiento14.setIcon(new ImageIcon(asientoCEIcon.getImage().getScaledInstance(asiento14.getWidth(), asiento14.getHeight(), Image.SCALE_SMOOTH)));
        add(asiento14); 


        

    }



      //_______________________________________________________
    //SETTERS Y GETTERS
    //--------------------------------------------------------



    public InterfazAvion getVentana() {
        return ventana;
    }

    public void setVentana(InterfazAvion ventana) {
        this.ventana = ventana;
    }



    public JButton getAsiento1() {
        return asiento1;
    }



    public void setAsiento1(JButton asiento1) {
        this.asiento1 = asiento1;
    }



    public JButton getAsiento2() {
        return asiento2;
    }



    public void setAsiento2(JButton asiento2) {
        this.asiento2 = asiento2;
    }



    public JButton getAsiento3() {
        return asiento3;
    }



    public void setAsiento3(JButton asiento3) {
        this.asiento3 = asiento3;
    }



    public JButton getAsiento4() {
        return asiento4;
    }



    public void setAsiento4(JButton asiento4) {
        this.asiento4 = asiento4;
    }



    public JButton getAsiento5() {
        return asiento5;
    }



    public void setAsiento5(JButton asiento5) {
        this.asiento5 = asiento5;
    }



    public JButton getAsiento6() {
        return asiento6;
    }



    public void setAsiento6(JButton asiento6) {
        this.asiento6 = asiento6;
    }



    public JButton getAsiento7() {
        return asiento7;
    }



    public void setAsiento7(JButton asiento7) {
        this.asiento7 = asiento7;
    }



    public JButton getAsiento8() {
        return asiento8;
    }



    public void setAsiento8(JButton asiento8) {
        this.asiento8 = asiento8;
    }



    public JButton getAsiento9() {
        return asiento9;
    }



    public void setAsiento9(JButton asiento9) {
        this.asiento9 = asiento9;
    }



    public JButton getAsiento10() {
        return asiento10;
    }



    public void setAsiento10(JButton asiento10) {
        this.asiento10 = asiento10;
    }



    public JButton getAsiento11() {
        return asiento11;
    }



    public void setAsiento11(JButton asiento11) {
        this.asiento11 = asiento11;
    }



    public JButton getAsiento12() {
        return asiento12;
    }



    public void setAsiento12(JButton asiento12) {
        this.asiento12 = asiento12;
    }



    public JButton getAsiento13() {
        return asiento13;
    }



    public void setAsiento13(JButton asiento13) {
        this.asiento13 = asiento13;
    }



    public JButton getAsiento14() {
        return asiento14;
    }



    public void setAsiento14(JButton asiento14) {
        this.asiento14 = asiento14;
    }


  /* 
    public DialogoAsignacion getDialogo() {
        return dialogo;
    }


    public void setDialogo(DialogoAsignacion dialogo) {
        this.dialogo = dialogo;
    }

*/





}

