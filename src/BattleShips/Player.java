package BattleShips;

import java.util.List;

public class Player {
	
	private int turn;
	public int getTurn() {
		return turn;
	}
	public void setTurn(int turn) {
		this.turn = turn;
	}
	public List<Ship> getShips() {
		return ships;
	}
	public void setShips(List<Ship> ships) {
		this.ships = ships;
	}
	private List<Ship> ships;
	
	public void addToFleet(Ship ship)
	{
		ships.add(ship);
	}

}
