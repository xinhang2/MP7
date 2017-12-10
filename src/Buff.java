import java.util.Random;

public class Buff {
	 public static final int MAX_DU = 10;
     public enum buffType{
    	 ATK_B, ATK_DB, DEF_B, DEF_DB
     }
     buffType bt;
     //int duration;//after number of steps disappear
     public Buff(){
    	 int pick = new Random().nextInt(buffType.values().length);
    	 bt = buffType.values()[pick];
    	 //duration = new Random().nextInt(MAX_DU);
     }
     
}
