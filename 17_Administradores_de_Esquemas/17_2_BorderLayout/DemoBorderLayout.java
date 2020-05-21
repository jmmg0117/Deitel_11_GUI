package 17_Administradores_de_Esquemas.17_2_BorderLayout;
// Prueba de MarcoBorderLayout.
import javax.swing.JFrame;

public class DemoBorderLayout{
    public static void main( String args[] ){

        MarcoBorderLayout marcoBorderLayout = new MarcoBorderLayout();
        marcoBorderLayout.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        marcoBorderLayout.setSize( 375, 200 ); // establece el tamaño del marco
        marcoBorderLayout.setVisible( true ); // muestra el marco
    } // fin de main
} // fin de la clase DemoBorderLayout