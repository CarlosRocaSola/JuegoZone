/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package conecta4;

/**
 *
 * @author sistemas inteligentes
 */
public class Main {

    //Tama�o del tablero
	static final int m_columnas=7;
	static final int m_filas=6;
	
	//Tiempo de espera m�ximo para una jugada
	static final int m_tiempoMaximo=2000000;
	
	/**
	 * @param args the command line arguments
	 * 
	 */
	 public static void main (String []args){
		//crea el juego
		 Juego m_juego=new Juego(m_columnas,m_filas,m_tiempoMaximo,0,1);
		 
		 //crea e inicia la interfaz del juego
		 Interfaz interfaz=new Interfaz(m_juego);
		 interfaz. setVisible(true);
	 }

 }
   