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
 //accessor for skill name
    public String getName(){
	return name;
    }
	//accessor for cost of skill
    public int getCost(){
	return COST;
    }
	//accessor for unlock level of skill
    public int getUnlockLevel(){
	return unlockLevel;
    }
	//accessor for if skill is down or not
    public boolean getDown(){
	return isDown;
    }
    //activates skill
    public void activate(Player p){
    }
	//deactivates skill
    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }

}
