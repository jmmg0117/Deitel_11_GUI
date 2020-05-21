package 10_JComboBox;

// Prueba de MarcoCuadroCombinado.
import javax.swing.JFrame;

public class PruebaCuadroCombinado{

    public static void main( String args[] ){
        MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado();
        marcoCuadroCombinado.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoCuadroCombinado.setSize( 350, 150 ); // establece el tamaño del marco
        marcoCuadroCombinado.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase PruebaCuadroCombinado