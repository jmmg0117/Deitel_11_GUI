package 9_Botones_de_Estado.9_2_JRadioButton;
// Prueba de MarcoBotonOpcion.
import javax.swing.JFrame;

public class PruebaBotonOpcion{
    public static void main( String args[] ){
        MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
        marcoBotonOpcion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBotonOpcion.setSize( 350, 100 ); // establece el tamaño del marco
        marcoBotonOpcion.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaBotonOpcion