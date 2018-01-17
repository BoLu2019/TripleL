import java.util.Timer;
import java.util.TimerTask;

public class HandsOfMidas extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;

	//stats for this skill
    public HandsOfMidas(){
	name = "Hands of Midas";
	cooldown = 40;
	unlockLevel = 20;
	COST = 300;
    }
	//accessor for skill's name
    public String getName(){
	return name;
    }
	//accessor for cost of skill
    public int getCost(){
	return COST;
    }
	//accessor for skil's unlock level
    public int getUnlockLevel(){
	return unlockLevel;
    }
	// is skill down?
    public boolean getDown(){
	return isDown;
    }
    //activates skill based on time intervals set 
    public void activate(Player p, Titan t){
		Timer time = new Timer();
		time.scheduleAtFixedRate(
			new TimerTask()
			{
				public void run()
				{
					System.out.println("$$__$$ I'M RICH!");
					p.gold += (t.getPrize() * 2);
			}
		},
		0,
		8000);
    }
	//stops the skill
    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

    public static void main(String[] args) {
    }
}
