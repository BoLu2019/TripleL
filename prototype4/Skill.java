<<<<<<< HEAD
public class Skill{

    private String name;
    private int cooldown;
    private int unlockLevel;
    private final int COST;
    public boolean isDown;

    public Skill(){

	name = "Skill";
	cooldown = 10;
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
    
    public void activate(Player p){
    }

    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

}
=======
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
>>>>>>> e3807850490aec98e24a01f7b1265d3403460af0
