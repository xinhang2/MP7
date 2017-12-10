
public class Client {
	Player p1;
	Player p2;
	Map m;
	//boolean p1turn;
	//boolean p2turn;
	/**
	 * let the game run
	 */
	public Client(Player p1,Player p2, Map map){
		this.p1 = p1;
		this.p2 = p2;
		this.m = map;
	}
	public boolean end(){
		for(Buff []b:m.buffGrid){
			for(Buff a :b){
				if(a!=null)
					return false;
			}
		}
		return true;
	}
	
public void launch(){	
	p1.nameIni();
	p1.tokenIni();
	p2.nameIni();
	p2.tokenIni();
	while(!end()){
		p1.makeMove();
		if(!end())
		p2.makeMove();
	}
	if(p1.score>p2.score)
		System.out.println(p1.name + "WINS!!");
	else if(p1.score<p2.score)
		System.out.println(p2.name+" WINS!!");
	else
		System.out.print("DRAW");
}
/**
 * ask the player1 or player2 to make move
 */
public static void main(String[]args){
	//for testing method
	
	Player p1 = new Player(1,1);
	Player p2 = new Player(1,3);
	p1.setToken("1");
	p2.setToken("2");
	Map m = new Map(p1,p2);
	Client c = new Client(p1,p2,m);
	p1.setName("Player 1");
	c.m.print();
	//System.out.print("xxxxx");
	/*p1.move(1);//player 1 move right
	p2.move(3);//player 2 move up
	p2.move(3);
	p2.move(3);
	p2.move(3);
	p2.move(3);
	p2.move(3);
	p2.move(3);
	System.out.println(p2.y);
	c.m.print();*/
	c.launch();
}
}
