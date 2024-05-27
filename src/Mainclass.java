import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Mainclass 
{
	static int righe = 10;
	static int colonne = 10;
	static int bomb_prob = 10;
	static int bomb_num = 0;
	static final int button_num = righe * colonne;
	
	static Random g = new Random();
	static JFrame frame = new JFrame("Campo minato");
	static ArrayList<Tile> tiles = new ArrayList<Tile>(button_num);
	static JPanel buttonsPanel;
	static JLabel statusLabel;


	public static void main(String args[])
	{
		// AGGIUNGERE IL CODICE SENZA MODIFICARE GLI ATTRIBUTI
	}
}
