import java.util.Timer;
import java.util.TimerTask;

public class BerserkerRage extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;

    public int secondsPassed = 0;
    
    public BerserkerRage(){
	name = "Berserker Rage";
	cooldown = 40;
	unlockLevel = 15;
	COST = 400;
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
        WarCry timer = new WarCry();
	timer.start();
	while (secondsPassed <= 15) {
	    isDown = false;
	    t.lowerHealth(p.getDamage() * 2);
	    if (secondsPassed == 15) {
		isDown = true;
		try {
		    Thread.sleep(cooldown * 1000);
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		secondsPassed = 0;
	    }
	}
    }

    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

    Timer myTimer = new Timer();
    TimerTask task = new TimerTask() {
	    public void run() {
		secondsPassed++;
	    }
	};
    public void start() {
	myTimer.scheduleAtFixedRate(task,1000,1000);
    }
    
    public static void main(String[] args) {
    }
}
