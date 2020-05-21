package 13_Manejo_de_Eventos;
// Demostración de los eventos de ratón.
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MarcoRastreadorRaton extends JFrame{
    private JPanel panelRaton; // panel en el que ocurrirán los eventos de ratón
    private JLabel barraEstado; // etiqueta que muestra información de los eventos

    // El constructor de MarcoRastreadorRaton establece la GUI y
    // registra los manejadores de eventos de ratón
    public MarcoRastreadorRaton(){
        super( "Demostracion de los eventos de raton" );

        panelRaton = new JPanel(); // crea el panel
        panelRaton.setBackground( Color.WHITE ); // establece el color de fondo
        add( panelRaton, BorderLayout.CENTER ); // agrega el panel a JFrame

        barraEstado = new JLabel( "Raton fuera de JPanel" );
        add( barraEstado, BorderLayout.SOUTH ); // agrega etiqueta a JFrame

        // crea y registra un componente de escucha para los eventos de ratón y de su movimiento
        ManejadorRaton manejador = new ManejadorRaton();
        panelRaton.addMouseListener( manejador );
        panelRaton.addMouseMotionListener( manejador );
        } // fin del constructor de MarcoRastreadorRaton

    private class ManejadorRaton implements MouseListener,MouseMotionListener{

        // Los manejadores de eventos de MouseListener
        // manejan el evento cuando se suelta el ratón justo después de oprimir el botón
        public void mouseClicked( MouseEvent evento ){
            barraEstado.setText( String.format( "Se hizo clic en [%d, %d]",
            evento.getX(), evento.getY() ) );
        } // fin del método mouseClicked

        // maneja evento cuando se oprime el ratón
        public void mousePressed( MouseEvent evento ){
            barraEstado.setText( String.format( "Se oprimio en [%d, %d]",
            evento.getX(), evento.getY() ) );
            } // fin del método mousePressed

        // maneja evento cuando se suelta el botón del ratón después de arrastrarlo
        public void mouseReleased( MouseEvent evento ){
            barraEstado.setText( String.format( "Se solto en [%d, %d]",
            evento.getX(), evento.getY() ) );
        } // fin del método mouseReleased

        // maneja evento cuando el ratón entra al área
        public void mouseEntered( MouseEvent evento ){
            barraEstado.setText( String.format( "Raton entro en [%d, %d]",
            evento.getX(), evento.getY() ) );
            panelRaton.setBackground( Color.GREEN );
        } // fin del método mouseEntered

// maneja evento cuando el ratón sale del área
public void mouseExited( MouseEvent evento )
{
barraEstado.setText( "Raton fuera de JPanel" );
panelRaton.setBackground( Color.WHITE );
} // fin del método mouseExited

// Los manejadores de eventos de MouseMotionListener manejan
// el evento cuando el usuario arrastra el ratón con el botón oprimido
public void mouseDragged( MouseEvent evento )
{
barraEstado.setText( String.format( "Se arrastro en [%d, %d]",
evento.getX(), evento.getY() ) );
} // fin del método mouseDragged

// maneja evento cuando el usuario mueve el ratón
public void mouseMoved( MouseEvent evento )
{
barraEstado.setText( String.format( "Se movio en [%d, %d]",
evento.getX(), evento.getY() ) );
} // fin del método mouseMoved
} // fin de la clase interna ManejadorRaton
} // fin de la clase MarcoRastreadorRaton