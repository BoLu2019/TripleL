public class Prestige extends Skill {

    private String name;
    private int unlockLevel;
    public boolean isDown;

    public Prestige(){
	name = "Prestige";
	unlockLevel = 25;
    }

    public String getName(){
	return name;
    }

    public int getUnlockLevel(){
	return unlockLevel;
    }

    public boolean getDown(){
	return isDown;
    }
    
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