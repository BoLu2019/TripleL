import java.util.Timer;
import java.util.TimerTask;

public class HeavenlyStrike extends Skill {

<<<<<<< HEAD
    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;

    public int secondsPassed = 0;

    public HeavenlyStrike(){

	name = "Heavenly Strike";
	cooldown = 20;
	unlockLevel = 5;
	COST = 50;
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
	t.lowerHealth(35*(1 + (p.getLevel() / 2)));
	HeavenlyStrike timer = new HeavenlyStrike();
	timer.start();
	while (secondsPassed < cooldown) {
	    isDown = true;
	}

    public void activate(Player p, Titan t){
        for (int i = 0; i < 70 * p.getLevel(); i ++){
            p.attack(t);
        }

    }

    public void deactivate(Player p){
    }

    public String toString(){
        return "Heavenly Strike: damages a titan by 70 * (1 + skill_level) taps\nUnlocked after Level 5";
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
