import java.util.Timer;
import java.util.TimerTask;

public class ShadowClone extends Skill {

    public ShadowClone(){
	name = "Shadow Clone";
	cooldown = 20;
	unlockLevel = 10;
	COST = 150;
    }

    public static void activate(Player p, Titan t){
        p.attack(t);
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
