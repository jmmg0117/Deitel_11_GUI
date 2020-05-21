package 18_Esquemas_Complejos;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MarcoPanel extends JFrame
{
private JPanel panelBotones; // panel que contiene los botones
private JButton botones[]; // arreglo de botones

// constructor sin argumentos
public MarcoPanel()
{
    super( "Demostracion de Panel" );
    botones = new JButton[ 5 ]; // crea el arreglo botones
    panelBotones = new JPanel(); // establece el panel
    panelBotones.setLayout( new GridLayout( 1, botones.length ) );
    
    // crea y agrega los botones
    for ( int cuenta = 0; cuenta < botones.length; cuenta++ )
    {
    botones[ cuenta ] = new JButton( "Boton " + ( cuenta + 1 ) );
    panelBotones.add( botones[ cuenta ] ); // agrega el botón al panel
    } // fin de for
    
    add( panelBotones, BorderLayout.SOUTH ); // agrega el panel a JFrame
    } // fin del constructor de MarcoPanel
} // fin de la clase MarcoPanel