package 17_Administradores_de_Esquemas.17_3_GridLayout;
// Demostración de GridLayout.
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoGridLayout extends JFrame implements ActionListener
{
private JButton botones[]; // arreglo de botones
private final String nombres[] =
{ "uno", "dos", "tres", "cuatro", "cinco", "seis" };
private boolean alternar = true; // alterna entre dos esquemas
private Container contenedor; // contenedor del marco
private GridLayout cuadricula1; // primer objeto GridLayout
private GridLayout cuadricula2; // segundo objeto GridLayout

// constructor sin argumentos
public MarcoGridLayout()
{
super( "Demostracion de GridLayout" );
cuadricula1 = new GridLayout( 2, 3, 5, 5 ); // 2 por 3; espacios de 5
cuadricula2 = new GridLayout( 3, 2 ); // 3 por 2; sin espacios
contenedor = getContentPane(); // obtiene el panel de contenido
setLayout( cuadricula1 ); // establece esquema de objeto JFrame
botones = new JButton[ nombres.length ]; // crea arreglo de objetos JButton

for ( int cuenta = 0; cuenta < nombres.length; cuenta++ )
{
botones[ cuenta ] = new JButton( nombres[ cuenta ] );
botones[ cuenta ].addActionListener( this ); // registra componente de escucha
add( botones[ cuenta ] ); // agrega boton a objeto JFrame
} // fin de for
} // fin del constructor de MarcoGridLayout

// maneja eventos de boton, alternando entre los esquemas
public void actionPerformed( ActionEvent evento )
{
if ( alternar )
contenedor.setLayout( cuadricula2 ); // establece esquema al primero
else
contenedor.setLayout( cuadricula1 ); // establece esquema al segundo

alternar = !alternar; // establece alternar a su valor opuesto
contenedor.validate(); // redistribuye el contenedor
} // fin del método actionPerformed
} // fin de la clase MarcoGridLayout