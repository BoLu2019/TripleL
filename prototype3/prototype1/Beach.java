public class Beach extends Hero {
    
    private String name;
    private int damage;
    private int level;
    private int health;
    private int cost;

    public Beach() {
	name = "Beach the Enthusiast";
	damage = 30;
	level = 1;
	health = 305;
	cost = 800;
    }

    public String getName() {
	return name;
    }

    public int getCost(){
	return cost;
    }

    public int attack(Titan t) {
	t.lowerHealth(damage);
	return damage;
    }

    public void levelUp() {
	level ++;
	if (level <= 10) {
	    damage += 60;
	    health += 120;
	    cost += 400;
	}
	if (10 < level & level < 25) {
	    damage += 100;
	    health += 130;
	    cost += 1080;
	}
	if (25 < level & level < 50) {
	    damage += 275;
	    health += 300;
	    cost += 2000;
	}
	else {
	    damage += 500;
	    health += 700;
	    cost += 7000;	    
	}
    }

    public void lowerHealth(int dmg) {
	health -= dmg;
    }

    public String toString() {
	return name;
    }
}
