package BattleShips;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args)
	{
		Player player1 = new Player();
		initialisePlayer1(player1);
		createGrid(player1.getShips());
		  
	}
	
	public static void initialisePlayer1(Player player1)
	{
		
		List<Ship> ships = new ArrayList();

		Battleship battleship1 = new Battleship();
		PatrolBoat patrolboat = new PatrolBoat();
		
		ships.add(battleship1);
		ships.add(patrolboat);
		
		player1.setShips(ships);
	}
	
	
	public static void createGrid(List<Ship> ships){
		
		
			String[][] board = new String [5][5];
			
		for (int r = 0; r<board.length;r++){
			   for (int c = 0; c <board.length;c++){
				   
				   board[r][c] = "_" ;
				   
				   for (Ship ship : ships)
				   {
				   
				  // board[ship.getLength()][ship.getWidth()] = "*" ;  // Initialize the cell
				   }
				   
				   System.out.print("[" +board[r][c] + "]"); // Display the content of cell board
			       }
			   
			   System.out.println();  // go to next line
					}
			   }
	
	
	
	
}
