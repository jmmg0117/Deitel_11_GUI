package 4_Imagen_Texto;

// Fig. 11.7: PruebaLabel.java
// Prueba de LabelFrame.
import javax.swing.JFrame;

public class PruebaLabel
{
public static void main( String args[] )
{
LabelFrame marcoEtiqueta = new LabelFrame(); // crea objeto LabelFrame
marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
marcoEtiqueta.setSize( 275, 180 ); // establece el tamaño del marco
marcoEtiqueta.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase PruebaLabel