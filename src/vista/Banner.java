package vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel que contiene el banner con la imagen.
 */
@SuppressWarnings("serial")
public class Banner extends JPanel {
    
     // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Ruta de la imagen del banner.
     */
    public final static String RUTA_IMAGEN = "./Imagenes/banner.jpg";

     // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Etiqueta de la imagen.
     */
    private JLabel labImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Construye el panel con el banner.
     */
    public Banner( )
    {
        labImagen = new JLabel( );
        labImagen.setIcon( new ImageIcon( RUTA_IMAGEN ) );
        add( labImagen );
    }
}
