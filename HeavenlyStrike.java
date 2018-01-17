import java.util.Timer;
import java.util.TimerTask;

public class HeavenlyStrike extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;

    public HeavenlyStrike(){

	name = "Heavenly Strike";
	cooldown = 20;
	unlockLevel = 5;
	COST = 50;
	isDown = false;
	
    }

	//accessor for getting skill name
    public String getName(){
	return name;
    }
	//accessor for getting cost of skill
    public int getCost(){
	return COST;
    }
	//accessor for getting unlock level
    public int getUnlockLevel(){
	return unlockLevel;
    }
	//accessor for whether skill is down
    public boolean getDown(){
	return isDown;
    }
    //activates the skill based on set time intervals
    public void activate(Player p, Titan t){
	Timer time = new Timer();
	time.scheduleAtFixedRate(
		new TimerTask()
		{
			public void run()
			{
					System.out.println("MASSIVE BLOW: DEALT " + (35*(1 + (p.getLevel() / 2))) + " DAMAGE!!" );
					t.lowerHealth(35*(1 + (p.getLevel() / 2)));					
			}
		},
		0,
		20000);
	}
/*
    public void activate(Player p, Titan t){
        for (int i = 0; i < 70 * p.getLevel(); i ++){
            p.attack(t);
        }

    }
*/
	//stops skill
    public void deactivate(Player p){
    }

    public String toString(){
        return "Heavenly Strike: damages a titan by 70 * (1 + skill_level) taps\nUnlocked after Level 5";
    }

    public static void main(String[] args) {
    }
}
