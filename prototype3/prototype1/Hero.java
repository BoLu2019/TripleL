public class Hero {

    private String name;
    private int damage;
    private int level;
    private int health;
    private int cost;

    public Hero() {
       name = "Hero";
       damage = 1;
       level = 1;
       health = 200;
       cost = 50;
    }

    public String getName() {
       return name;
    }

    public int getCost(){
	return cost;
    }

    public int getLevel() {
	return level;
    }
    
    public int attack(Titan t) {
       t.lowerHealth(damage);
       return damage;
    }

    public void levelUp() {
       level ++;
    }

    public void lowerHealth(int dmg) {
       health -= dmg;
    }

    public String toString() {
       return "This is a Hero.";
    }
}
