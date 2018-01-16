public class Holmes extends Hero {
    
    private String name;
    private int damage;
    private int level;
    private int health;
    private int cost;

    public Holmes() {
	name = "Holmes the Detective";
	damage = 100;
	level = 1;
	health = 975;
	cost = 2500;
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
	    damage += 200;
	    health += 300;
	    cost += 1200;
	}
	if (10 < level & level < 25) {
	    damage += 400;
	    health += 780;
	    cost += 3000;
	}
	if (25 < level & level < 50) {
	    damage += 1000;
	    health += 2000;
	    cost += 9000;
	}
	else {
	    damage += 3000;
	    health += 3000;
	    cost += 15000;	    
	}
    }

    public void lowerHealth(int dmg) {
	health -= dmg;
    }

    public String toString() {
	return name;
    }
}
