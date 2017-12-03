
public class Client {
	Player p1;
	Player p2;
	Map m;
	boolean p1turn;
	boolean p2turn;
	boolean end;
	/**
	 * let the game run
	 */
	public Client(){
		end = false;
	}
public void launch(){	
	while(!end){
		makeMove();
	}
}
/**
 * ask the player1 or player2 to make move
 */
public void makeMove(){
	
}
public static void main(String[]args){
	Client c = new Client();
	c.p1 = new Player(1,1);
	c.p2 = new Player(1,3);
	c.m = new Map(c.p1,c.p2);
	c.launch();
	
}
}
