import java.util.Timer;
import java.util.TimerTask;

public class ShadowClone extends Skill {


    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;

    public ShadowClone(){
	name = "Shadow Clone";
	cooldown = 20;
	unlockLevel = 10;
	COST = 150;
	isDown = false;
    }


    public String getName(){
	return name;
    }

    public int getCost(){
	return COST;
    }

    public int getUnlockLevel(){
	return unlockLevel;
    }
    
    public boolean getDown(){
	return isDown;
    }
    
    public void activate(Player p, Titan t){
		Timer time = new Timer();
		time.scheduleAtFixedRate(
			new TimerTask()
			{
				public void run()
				{
					System.out.println("SHANK: YOUR CLONE DEALT AN EXTRA HIT!" );
					t.lowerHealth(p.getDamage());
			}
		},
		0,
		5000);
	}
/*
    public static void activate(Player p, Titan t){
        p.attack(t);
    }
*/

    public void deactivate(Player p){
    }

    public String toString(){
        return "This is a Skill.";
    }

    public static void main(String[] args) {
    }
}
