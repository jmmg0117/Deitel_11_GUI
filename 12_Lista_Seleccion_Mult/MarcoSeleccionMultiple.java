package 12_Lista_Seleccion_Mult;
// Copiar elementos de un objeto List a otro.
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MarcoSeleccionMultiple extends JFrame{
    private JList listaJListColores; // lista para guardar los nombres de los colores
    private JList listaJListCopia; // lista en la que se van a copiar los nombres de los colores
    private JButton botonJButtonCopiar; // botón para copiar los nombres seleccionados
    private final String nombresColores[] = { "Negro", "Azul", "Cyan",
        "Gris oscuro", "Gris", "Verde", "Gris claro", "Magenta", "Naranja",
        "Rosa", "Rojo", "Blanco", "Amarillo"};

// Constructor de MarcoSeleccionMultiple
    public MarcoSeleccionMultiple(){
        super( "Listas de seleccion multiple" );
        setLayout( new FlowLayout() ); // establece el esquema del marco

        JList listaJListColores = new JList( nombresColores ); // contiene nombres de todos los colores
        listaJListColores.setVisibleRowCount( 5 ); // muestra cinco filas
        listaJListColores.setSelectionMode(
        ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
        add( new JScrollPane( listaJListColores ) ); // agrega lista con panel de desplazamiento

        botonJButtonCopiar = new JButton( "Copiar >>>" ); // crea botón para copiar
        botonJButtonCopiar.addActionListener(

        new ActionListener() // clase interna anónima
        {
// maneja evento de botón
            public void actionPerformed( ActionEvent evento )
            {
            // coloca los valores seleccionados en listaJListCopia
                listaJListCopia.setListData( listaJListColores.getSelectedValues() );
            } // fin del método actionPerformed
        } // fin de la clase interna anónima
        ); // fin de la llamada a addActionListener

    add( botonJButtonCopiar ); // agrega el botón copiar a JFrame
    listaJListCopia = new JList(); // crea lista para guardar nombres de colores copiados
    listaJListCopia.setVisibleRowCount( 5 ); // muestra 5 filas
    listaJListCopia.setFixedCellWidth( 100 ); // establece la anchura
    listaJListCopia.setFixedCellHeight( 15 ); // establece la altura
    listaJListCopia.setSelectionMode(
    ListSelectionModel.SINGLE_INTERVAL_SELECTION );
    add( new JScrollPane( listaJListCopia ) ); // agrega lista con panel de desplazamiento
    } // fin del constructor de MarcoSeleccionMultiple
} // fin de la clase MarcoSeleccionMultiple