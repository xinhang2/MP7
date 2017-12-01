
public class Client {
public static void main(String[]args){
	Player p1 = new Player(1,1);
	Player p2 = new Player(1,3);
	Map m = new Map();
	m.add(p1);
	m.add(p2);
	p1.moveRight();
	p1.moveDown();
	
}
}
