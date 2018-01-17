public class Hero {

    private String name;
    private int damage;
    private int level;
    private int health;
    private int cost;
    private int levelUpCost;

    public Hero() {
       name = "Hero";
       damage = 1;
       level = 1;
       health = 200;
       cost = 50;
       levelUpCost = 20;
    }

    public String getName() {
       return name;
    }

    public int getCost(){
	return cost;
    }

    public int getLevelUpCost(){
	return levelUpCost;
    }

    public int getLevel() {
	return level;
    }
    
    public int attack(Titan t) {
       t.lowerHealth(damage);
       return damage;
    }

    public void levelUp(Player p) {
       level ++;
    }

    public void lowerHealth(int dmg) {
       health -= dmg;
    }

    public String toString(){
	String s = name;
	s += "\nHealth: " + health;
	s += "\nLevel: " + level;
	s += "\ndamage: " + damage;
    s += "\nneed " + levelUpCost + " gold to level up";
	return s;
    }
}
