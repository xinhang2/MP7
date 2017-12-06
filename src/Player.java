import java.util.*;
public class Player {
	public static final int D_HP = 10;//default hp
	public static final int D_ATK = 5;//default atk
	public static final int D_DEF = 5;//default def
	public static final int D_X = 0;//default x
	public static final int D_Y = 0;//default y
	String name;//players name
	String token;//x,o,*,$
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
	public Player(Player p){
		name = p.name;
		hp = p.hp;
		
	}
	public void setToken(String t){
		token = t;
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
	/** move one step
	 * m = 3 move up
	 * m = 4 move down
	 * m = 1 move right
	 * m = 2 move left
	 * @param m
	 */
	public void move(int m) {
		int oldx = x;
		int oldy = y;
		switch (m) {
		case 1:// move right
			x++;
			break;
		case 2:// move left
			x--;

			break;
		case 3:// move up
			y++;
			break;
		case 4:// move down
			y--;
			break;
		}
		map.playerGrid[x][y] = map.playerGrid[oldx][oldy];
		map.playerGrid[oldx][oldy] = null;
		if (map.buffGrid[x][y] != null) {
			buffList.add(map.buffGrid[x][y]);
			map.buffGrid[x][y] = null;
		}
	}

	/**
	 * ask the person to make move scanner class needed
	 */
	public void makeMove() {
          
	}

}
