import java.util.Timer;
import java.util.TimerTask;

public class BerserkerRage extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown; //is skill active or not
    
    public BerserkerRage(){
	name = "Berserker Rage";
	cooldown = 30;
	unlockLevel = 15;
	COST = 210;
    }

	//accessor for skill's name
    public String getName(){
	return name;
    }
	//accessor for cost of skill
    public int getCost(){
	return COST;
    }
	//accessor for unlockLevel
    public int getUnlockLevel(){
	return unlockLevel;
    }
	//returns where or not skill is down
    public boolean getDown(){
	return isDown;
    }
    
	//activate skill, includes timer for intervals of skill usage
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
	//stops skill
    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }
	
    public static void main(String[] args) {
    }
}
