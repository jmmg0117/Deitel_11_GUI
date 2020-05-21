package 5_Textos_y_Eventos;

2 // Prueba de CampoTextoMarco.
3 import javax.swing.JFrame;
4
5 public class PruebaCampoTexto
6 {
7 public static void main( String args[] )
8 {
9 CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
10 campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
11 campoTextoMarco.setSize( 350, 100 ); // establece el tamaño del marco
12 campoTextoMarco.setVisible( true ); // muestra el marco
13 } // fin de main
14 } // fin de la clase PruebaCampoTexto