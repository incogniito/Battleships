package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import BattleShips.Battleship;
import BattleShips.PatrolBoat;
import BattleShips.Player;
import BattleShips.Ship;

public class GUI extends JFrame {

	private ShipPlacement sp;
	public int phase =1;
	
	private Container contents;
	
	//Components
	private  JButton[][] squares = new JButton[7][7];
	private Player player1;
	
	//Colours
	private Color colourBlue = Color.BLUE;
	
	//current position
	private int row = 7;
	private int col = 7;
	
	//Images
	private ImageIcon patrolBoatImg;
	private ImageIcon battleshipImg;
	
	private int counter;
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
				//	window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		
		patrolBoatImg = new ImageIcon("C:\\Users\\Administrator\\Pictures\\patrolBoat.png");
		battleshipImg = new ImageIcon("C:\\Users\\Administrator\\Pictures\\battleshipIcon.png");
		
		counter =0;

		 player1 = new Player();
		initialiseGrid();
		initialisePlayer1(player1);

		

		
		

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialiseGrid() {
		
		contents = getContentPane();
		contents.setLayout(new GridLayout(7,7));
		
		//Create Event Handler
		ButtonHandler buttonHandler = new ButtonHandler(squares, this);
		

		
		//create and add board components
		
		for (int i = 0; i < 7; i ++)
		{
			for (int j = 0; j < 7; j++)
			{
				squares[i][j] = new JButton();
//				if ((i + j) % 2 != 0)
//				{
//					squares[i][j].setBackground(colourBlue);
//				}
				contents.add(squares[i][j]);
				squares[i][j].addActionListener(buttonHandler);
			}
		}
		//squares[row][col].setIcon(icon)
		
		//size of window
		
		setSize(500, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
		

	}
	
	
private boolean isValidMove(int i, int j){
		
		
		return false;
	}

public void processClick(int i, int j)
{	   
	   switch (phase)
	   {
	   case 1:
		   
		   
		   
		   squares[i][j].setIcon(patrolBoatImg);

		   
		   break;
		   
	   case 2:
		   
		   break;
	   }
}

public void initialisePlayer1(Player player1)
{
	
	List<Ship> ships = new ArrayList();

	Battleship battleship1 = new Battleship();
	PatrolBoat patrolboat = new PatrolBoat();
	
	sp = new ShipPlacement();
	
	
	ships.add(battleship1);
	ships.add(patrolboat);
	
	player1.setShips(ships);
	
	for (Ship ship : ships)
	{
		sp.shipLabel.setText("Choose the front position for your" + ship.getClass().getSimpleName());
		

	}
}
	
public Ship placeFront(Ship playerShip, int i, int j){
	 
			sp.shipLabel.setText("Choose the front position for your" + playerShip.getClass().getSimpleName());
			int[] coordinates = {i,j};
			playerShip.setFront(coordinates); 
		
			return playerShip;
	
}

public void UserButtonActionPerformed(ActionEvent evt) {
    addMouseListener(new MouseAdapter() {
        public void mouseClicked(MouseEvent evt) {
        	
        	Object source = evt.getSource();
    		
    		for (int i = 0; i < 7; i++){
    			for (int j = 0; j < 7; j++){
    				if (source == squares[i][j])
    				{
    					processClick(i,j);
    				}
        	
            System.out.println("PRINT THIS AFTER MOUSE CLICK");
            removeMouseListener(this);
        }
    }

 }
    });
}

public Ship placeRear(Ship playerShip, int i, int j){
	 
	sp.shipLabel.setText("Choose the rear position for your" + playerShip.getClass().getSimpleName());
	int[] coordinates = {i,j};
	playerShip.setRear(coordinates); 

	return playerShip;
}
	
    }




