public class Clyde extends Hero {
    
    private String name;
    private int damage;
    private int level;
    private int health;
    private int cost;

    public Clyde() {
	name = "Clyde the Bride";
	damage = 500;
	level = 1;
	health = 5000;
	cost = 10000;
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
	    damage += 600;
	    health += 1000;
	    cost += 5000;
	}
	if (10 < level & level < 25) {
	    damage += 1200;
	    health += 3000;
	    cost += 15000;
	}
	if (25 < level & level < 50) {
	    damage += 3000;
	    health += 8000;
	    cost += 30000;
	}
	else {
	    damage += 9000;
	    health += 12000;
	    cost += 60000;	    
	}
    }

    public void lowerHealth(int dmg) {
	health -= dmg;
    }

    public String toString() {
	return name;
    }
}
