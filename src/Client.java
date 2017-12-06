
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
	public Client(Player p1,Player p2, Map map){
		end = false;
		this.p1 = p1;
		this.p2 = p2;
		this.m = map;
	}
public void launch(){	
	while(!end){
		p1.makeMove();
	}
}
/**
 * ask the player1 or player2 to make move
 */
public static void main(String[]args){
	
	Player p2 = new Player(1,3);
	Player p1 = new Player(1,1);
	p1.setToken("1");
	p2.setToken("2");
	Map m = new Map(p1,p2);
	Client c = new Client(p1,p2,m);
	c.m.print();
	//System.out.print("xxxxx");
	p1.move(1);//player 1 move up
	p2.move(3);
	System.out.println();
	c.m.print();
}
}
