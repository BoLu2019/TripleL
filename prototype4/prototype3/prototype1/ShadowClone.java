import java.util.Timer;
import java.util.TimerTask;

public class ShadowClone extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private int level;
    private final int COST;

    public ShadowClone(){
	name = "Shadow Clone";
	cooldown = 20;
	unlockLevel = 10;
	level = 1;
	COST = 150;
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

    public void levelUp(){
	level ++;
    }

    public static void activate(Player p, Titan t){
	t.lowerHealth(p.damage);
    }

    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

    public static void main() {
        TimerTask task = new TimerTask() {
		public void run() {
		    activate(p, t);
		}
	    };
	Timer timer = new Timer();
	long delay = 0;
	long intervalPeriod = 1000;
	timer.scheduleAtFixedRate(task, delay,  intervalPeriod);
    }
}
