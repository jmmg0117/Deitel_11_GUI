package 19_JTextArea;
// Copia el texto seleccionado de un área de texto a otra.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class MarcoAreaTexto extends JFrame
{
private JTextArea areaTexto1; // muestra cadena de demostración
private JTextArea areaTexto2; // el texto resaltado se copia aquí
private JButton botonCopiar; // inicia el copiado de texto

// constructor sin argumentos
public MarcoAreaTexto()
{
super( "Demostracion de JTextArea" );
Box cuadro = Box.createHorizontalBox(); // crea un cuadro
String demo = "Esta es una cadena de\ndemostracion para\n" +
"ilustrar como copiar texto\nde un area de texto a \n" +
"otra, usando un\nevento externo\n";

areaTexto1 = new JTextArea( demo, 10, 15 ); // crea área de texto 1
cuadro.add( new JScrollPane( areaTexto1 ) ); // agrega panel de desplazamiento

botonCopiar = new JButton( "Copiar >>>" ); // crea botón para copiar
cuadro.add( botonCopiar ); // agrega botón de copia al cuadro
botonCopiar.addActionListener(

new ActionListener() // clase interna anónima
{
// establece el texto en areaTexto2 con el texto seleccionado de areaTexto1
public void actionPerformed( ActionEvent evento )
{
areaTexto2.setText( areaTexto1.getSelectedText() );
} // fin del método actionPerformed
} // fin de la clase interna anónima
); // fin de la llamada a addActionListener

areaTexto2 = new JTextArea( 10, 15 ); // crea segunda área de texto
areaTexto2.setEditable( false ); // deshabilita edición
cuadro.add( new JScrollPane( areaTexto2 ) ); // agrega panel de desplazamiento

add( cuadro ); // agrega cuadro al marco
} // fin del constructor de MarcoAreaTexto
} // fin de la clase MarcoAreaTexto