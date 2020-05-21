package 18_Esquemas_Complejos;
// Prueba de MarcoPanel.
import javax.swing.JFrame;

public class DemoPanel extends JFrame{

    public static void main( String args[] ){

        MarcoPanel marcoPanel = new MarcoPanel();
        marcoPanel.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoPanel.setSize( 450, 200 ); // establece el tamaño del marco
        marcoPanel.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase DemoPanel