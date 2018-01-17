public class HeavenlyStrike extends Skill {

    public HeavenlyStrike(){

	name = "Heavenly Strike";
	cooldown = 20;
	unlockLevel = 5;
	COST = 50;

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

}
