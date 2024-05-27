import java.util.ArrayList;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameLogic implements MouseListener
{
	private boolean gameOver = false;
	private int bomb_number;
	JLabel statusLabel;
	ArrayList<Tile> tiles;
	
	public GameLogic(ArrayList<Tile> tiles, JLabel statusLabel)
	{
		this.tiles = tiles;
		this.statusLabel = statusLabel;
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}