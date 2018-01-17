public abstract class Skill{

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;

    public Skill(){

	name = "Skill";
	cooldown = 10;
	unlockLevel = 5;
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

    public abstract void activate(Player p);

    public abstract void deactivate(Player p);

    public String toString(){
	return "This is a Skill.";
    }

}
