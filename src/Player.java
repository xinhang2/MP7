import java.util.*;
public class Player {
	public static int id = 0;
	public int n;//player order
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
	int score;//current score for this player
	boolean s;
	public enum key{
		a,w,s,d
	}
	public Player(){
		id++;
		n = id;
		name = "unknown";
		hp = D_HP;
		atk = D_ATK;
		def = D_DEF;
		x = D_X;
		y = D_Y;
	}
	public Player(Player p){
		id++;
		n = id;
		name = p.name;
		hp = p.hp;
		
	}
	public void setToken(String t){
		token = t;
	}
	public Player(final int x, final int y){
		id++;
		s = false;
		n = id;
		name = "unknown";
		hp = D_HP;
		atk = D_ATK;
		def = D_DEF;
		this.x = x;
		this.y = y;
	}
	public Player(final String name, final double hp, final double atk, 
			final double def, final int x, final int y){
		id++;
		n = id;
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.x = x;
		this.y = y;
	}
	public void setName(String name){
		this.name = name;
	}
	/**
	 * initialize the player's name
	 */
	public void nameIni(){
		boolean set = false;
		while(!set){
			System.out.println("Please set your name Player "+n);
			Scanner s = new Scanner(System.in);
			String newName = s.nextLine();
			if(newName.contains(" ")){
				System.out.println("Space is not allowed!");
			}else{
				set = true;
				setName(newName);
			}
		}
		
	}
	public void tokenIni(){
		boolean set = false;
	
		while(!set){
			System.out.println("Please set your Token Player"+n);
			Scanner s = new Scanner(System.in);
			String newToken = s.nextLine();
			if( newToken.length()>1){
				System.out.println("Stirng lenght must be equal to 1");
			}else{
				set = true;
				setToken(newToken);
			}
		}
	}
	/**
	 * let the current player attack another player
	 * 
	 * @param p
	 */
	public void attack(Player p){
		
	}
	/**
	 * increase or decrease the data of the player when a
	 * player get a buff
	 * @param b
	 */
	public void getBuff(Buff b){
		
	}
	/** move one step
	 * m = 3 move up
	 * m = 4 move down
	 * m = 1 move right
	 * m = 2 move left
	 * @param m
	 */
	public void move(String m) {
		
		int oldx = x;
		int oldy = y;
		switch (m) {
		case "gg"://surrender
			s = true;
			System.out.println(name+" surrenders!! GG!!");
			return;
		case "d":// move right
			if(x<Map.WIDTH) {
			if(map.playerGrid[x+1][y]!=null) {
				System.out.println("You can not eat another player!");
				return;
			}
			}
			x++;
			break;
		case "a":// move left
		    if(x>0) {
			if(map.playerGrid[x-1][y]!=null) {
				System.out.println("You can not eat another player!");
				return;
			}
		    }
				x--;

			break;
		case "w":// move up
			if(y<Map.HEIGHT) {
			if(map.playerGrid[x][y+1]!=null) {
				System.out.println("You can not eat another player!");
				return;
			}
			}
			y++;
			break;
		case "s":// move down
			if(y>0) {
			if(map.playerGrid[x][y-1]!=null) {
				System.out.println("You can not eat another player!");
				return;
			}
			}
			y--;
			break;
		}
		
		if(x>=Map.WIDTH)
			x = Map.WIDTH-1;
		if(x<0)
			x = 0;
		if(y>=Map.HEIGHT)
			y = Map.HEIGHT-1;
		if(y<0)
			y = 0;
		
		//in case that the position is beyond the border
		//System.out.println(oldx);
		//System.out.println(oldy);
		if(x!=oldx||y!=oldy){
		map.playerGrid[x][y] = map.playerGrid[oldx][oldy];
		map.playerGrid[oldx][oldy] = null;
		
		}
		if (map.buffGrid[x][y] != null) {
			System.out.println(name+" find a buff!!!");
			getBuff(map.buffGrid[x][y]);
			map.buffGrid[x][y] = null;
			score++;//for getting a buff
		}
	}
	public void showScore(){
		System.out.println(name+" current score:"+score);
	}

	/**
	 * ask the person to make move scanner class needed
	 */
	public void makeMove() {
         boolean move = false;
         while(!move){
        	 System.out.println(name+" Please make a move:"+"\n"+"d.move right"+"\n"+"a.move left"+
         "\n"+"w.move up"+"\n"+"s.move down");
        	Scanner s = new Scanner(System.in);
        	String code = s.next();
        	if(!code.equals("a")&&!code.equals("s")&&!code.equals("d")&&!code.equals("w")&&!code.equals("gg")){
        		System.out.println("you must enter valid move!");
        	}else{
        	move = true;
        	move(code);
        	map.print();
        	}
         }
	}

}
