public class AAron extends Hero {
    
    private String name;
    private int damage;
    private int level;
    private int health;
    private int cost;

    public AAron() {
	name = "AAron the Thief";
	damage = 10;
	level = 1;
	health = 105;
	cost = 100;
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
	    damage += 15;
	    health += 30;
	    cost += 100;
	}
	if (10 < level & level < 25) {
	    damage += 40;
	    health += 55;
	    cost += 300;
	}
	if (25 < level & level < 50) {
	    damage += 30;
	    health += 30;
	    cost += 1000;
	}
	else {
	    damage += 50;
	    health += 60;
	    cost += 3000;	    
	}
    }

    public void lowerHealth(int dmg) {
	health -= dmg;
    }

    public String toString() {
	return name;
    }
}
