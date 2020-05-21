package 13_Manejo_de_Eventos;
// Prueba de MarcoRastreadorRaton.
import javax.swing.JFrame;

public class RastreadorRaton{
public static void main( String args[] ){

    MarcoRastreadorRaton marcoRastreadorRaton = new MarcoRastreadorRaton();
    marcoRastreadorRaton.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    marcoRastreadorRaton.setSize( 300, 100 ); // establece el tamaño del marco
    marcoRastreadorRaton.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase RastreadorRaton