
public class Map {
   static final int HEIGHT = 100;
   static final int WIDTH = 100;
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
   }
   
   /**
    * print out the map
    * "x" represent player1 on it
    * "o" represent player2 on it
    * "#" represent no players on it
    */
   public void print(){
	   
   }
}
