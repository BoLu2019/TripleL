import java.util.Timer;
import java.util.TimerTask;

public class HandsOfMidas extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;

    public HandsOfMidas(){
	name = "Hands of Midas";
	cooldown = 40;
	unlockLevel = 20;
	COST = 300;
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
					System.out.println("$$__$$ I'M RICH!");
					p.gold += (t.getPrize() * 2);
			}
		},
		0,
		8000);
    }

    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

    public static void main(String[] args) {
    }
}
