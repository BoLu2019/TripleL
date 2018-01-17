public class Prestige extends Skill {

    private String name;
    private int unlockLevel;
    public boolean isDown;

    public Prestige(){
	name = "Prestige";
	unlockLevel = 25;
    }
 //accessor for skill name
    public String getName(){
	return name;
    }
	//accessor for skill's unlock level
    public int getUnlockLevel(){
	return unlockLevel;
    }
	//accessor for boolean isDown
    public boolean getDown(){
	return isDown;
    }
    //activates prestige, "restarts" the game, but with increased stats for player.
    public void activate(Woo w){
		Woo.prestige();
		Woo.newGame(w)
    }
	
    public void deactivate(Player p){
    }

    public String toString(){
	return "This is a Skill.";
    }
    
    public static void main(String[] args) {
    }
}