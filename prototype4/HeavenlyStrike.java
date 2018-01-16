public class HeavenlyStrike extends Skill {

    private String name;
    private int cooldown;
    private int unlockLevel;
    private int level;
    private final int COST;

    public HeavenlyStrike(){

	name = "Heavenly Strike";
	cooldown = 20;
	unlockLevel = 5;
	level = 1;
	COST = 50;

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

    public void activate(Titan t){
	t.lowerHealth(35*(1 + level));
    }

    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

}
