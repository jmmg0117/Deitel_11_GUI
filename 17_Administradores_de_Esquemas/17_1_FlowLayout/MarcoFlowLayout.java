package 17_Administradores_de_Esquemas;
// Demostración de las alineaciones de FlowLayout.
import java.awt.FlowLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;

public class MarcoFlowLayout extends JFrame
{
private JButton botonJButtonIzquierda; // botón para establecer la alineación a la izquierda
private JButton botonJButtonCentro; // botón para establecer la alineación al centro
private JButton botonJButtonDerecha; // botón para establecer la alineación a la derecha
private FlowLayout esquema; // objeto esquema
private Container contenedor; // contenedor para establecer el esquema

// establece la GUI y registra los componentes de escucha de botones
public MarcoFlowLayout()
{
super( "Demostracion de FlowLayout" );

esquema = new FlowLayout(); // crea objeto FlowLayout
contenedor = getContentPane(); // obtiene contenedor para esquema
setLayout( esquema ); // establece el esquema del marco

// establece botonJButtonIzquierda y registra componente de escucha
JButton botonJButtonIzquierda = new JButton( "Izquierda" ); // crea botón Izquierda
add( botonJButtonIzquierda ); // agrega botón Izquierda al marco
botonJButtonIzquierda.addActionListener(

new ActionListener() // clase interna anónima
{
// procesa evento de botonJButtonIzquierda
public void actionPerformed( ActionEvent evento )
{
esquema.setAlignment( FlowLayout.LEFT );

// realinea los componentes adjuntos
esquema.layoutContainer( contenedor );
} // fin del método actionPerformed
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener

// establece botonJButtonCentro y registra componente de escucha
botonJButtonCentro = new JButton( "Centro" ); // crea botón Centro
add( botonJButtonCentro ); // agrega botón Centro al marco
botonJButtonCentro.addActionListener(

new ActionListener() // clase interna anónima
{
// procesa evento de botonJButtonCentro
public void actionPerformed( ActionEvent evento )
{
esquema.setAlignment( FlowLayout.CENTER );

// realinea los componentes adjuntos
esquema.layoutContainer( contenedor );
} // fin del método actionPerformed
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener

// establece botonJButtonDerecha y registra componente de escucha
JButton botonJButtonDerecha = new JButton( "Derecha" ); // crea botón Derecha
add( botonJButtonDerecha ); // agrega botón Derecha al marco
botonJButtonDerecha.addActionListener(

new ActionListener() // clase interna anónima
{
// procesa evento de botonJButtonDerecha
public void actionPerformed( ActionEvent evento )
{
esquema.setAlignment( FlowLayout.RIGHT );

// realinea los componentes adjuntos
esquema.layoutContainer( contenedor );
} // fin del método actionPerformed
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener
} // fin del constructor de MarcoFlowLayout
} // fin de la clase MarcoFlowLayout
