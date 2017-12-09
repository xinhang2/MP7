
public class Map {
   static final int HEIGHT = 10;
   static final int WIDTH = 10;
   static final double P_BUFF = 0.3;//the possibility of a single grid has buff
   Player[][]playerGrid;
   Buff[][]buffGrid;
   Player p1;
   Player p2;
   /**
    * auto generating buffs
    * set playerGrid to height * weight matrix
    * set buffGrid to height * weight matrix
    */
   public Map(Player p1,Player p2){
	   this.p1 = p1;
	   this.p2 = p2;
	   p1.map = this;
	   p2.map = this;
	   playerGrid = new Player[WIDTH][HEIGHT];
	   buffGrid = new Buff[WIDTH][HEIGHT];
	   playerGrid[p1.x][p1.y] = p1;
	   playerGrid[p2.x][p2.y] = p2;
	   for(int i=0;i<WIDTH;i++){
		   for(int j = 0;j<HEIGHT;j++){
			   if(Math.random()<=P_BUFF){
				   buffGrid[i][j] = new Buff();
			   }
		   }
	   }
   }
   
   /**
    * print out the map
    * "x" represent player1 on it
    * "o" represent player2 on it
    * "#" represent no players on it
    * "@" represent buff on it
    */
   public void print(){
	   for(int y = HEIGHT-1;y>=0;y--){
		   for(int x = 0;x<WIDTH;x++){
			   if(playerGrid[x][y]!=null){
				   System.out.print(playerGrid[x][y].token+" ");//with player standing
			   }else if(buffGrid[x][y]!=null){
				   System.out.print("@ ");//has buff
			   }else{
				   System.out.print("# ");//the empty grid
			   }
			   if(x==WIDTH-1){
				   System.out.println();
			   }
		   }
	   }
   }
}
