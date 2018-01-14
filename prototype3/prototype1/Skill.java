public class Skill{

    private String name;
    private int cooldown;
    private int unlockLevel;
    private int level;
    private int COST;

    public Skill(){

	name = "Skill";
	cooldown = 10;
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

    public void activate(Player p){
    }

    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

}
