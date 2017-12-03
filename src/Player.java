import java.util.*;
public class Player {
	public static final int D_HP = 10;//default hp
	public static final int D_ATK = 5;//default atk
	public static final int D_DEF = 5;//default def
	public static final int D_X = 0;//default x
	public static final int D_Y = 0;//default y
	String name;//players name
	double hp;//hit points
	double atk;//attack level
	double def;//defense level
	int x;//x coordinates
	int y;//y coordinates
	Map map;//the map that the player in
	List<Buff> buffList = new ArrayList<>();
	public Player(){
		name = "unknown";
		hp = D_HP;
		atk = D_ATK;
		def = D_DEF;
		x = D_X;
		y = D_Y;
	}
	public Player(final int x, final int y){
		name = "unknown";
		hp = D_HP;
		atk = D_ATK;
		def = D_DEF;
		this.x = x;
		this.y = y;
	}
	public Player(final String name, final double hp, final double atk, 
			final double def, final int x, final int y){
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.x = x;
		this.y = y;
	}
	public void attack(Player p){
		
	}
	public void move(boolean up, boolean down,boolean right,boolean left){
		
	}
	
}
