import java.util.Timer;
import java.util.TimerTask;

public class BerserkerRage extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;
    
    public BerserkerRage(){
	name = "Berserker Rage";
	cooldown = 30;
	unlockLevel = 15;
	COST = 210;
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
					System.out.println("SO ANGRY!!! TAKE THIS!!");
					t.lowerHealth(p.getDamage() * 2);
			}
		},
		0,
		10000);
	}

    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }
	
    public static void main(String[] args) {
    }
}
