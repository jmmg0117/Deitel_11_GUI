package 15_Dibujar_con_raton;
// Prueba de PanelDibujo.
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Pintor
{
public static void main( String args[] )
{
// crea objeto JFrame
JFrame aplicacion = new JFrame( "Un programa simple de dibujo" );

PanelDibujo panelDibujo = new PanelDibujo(); // crea panel de dibujo
aplicacion.add( panelDibujo, BorderLayout.CENTER ); // en el centro

// crea una etiqueta y la coloca en la región SOUTH de BorderLayout
aplicacion.add( new JLabel( "Arrastre el raton para dibujar" ),
BorderLayout.SOUTH );

aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
aplicacion.setSize( 400, 200 ); // establece el tamaño del marco
aplicacion.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase Pintor