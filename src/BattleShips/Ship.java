package BattleShips;

public class Ship {
	
	private int[] front = null;
	public int[] getFront() {
		return front;
	}
	public void setFront(int[] front) {
		this.front = front;
	}
	public int[] getRear() {
		return rear;
	}
	public void setRear(int[] rear) {
		this.rear = rear;
	}
	private int[] rear = null;
	
	private int tiles;
	public int getTiles() {
		return tiles;
	}
	public void setTiles(int tiles) {
		this.tiles = tiles;
	}

	
	
}
