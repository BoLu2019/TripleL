public class Brown extends Hero {
    
    private String name;
    private int damage;
    private int level;
    private int health;
    private int cost;

    public Brown() {
	name = "Brown the Wanderer";
	damage = 3;
	level = 1;
	health = 50;
	cost = 25;
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
	    damage += 5;
	    health += 10;
	    cost += 25;
	}
	if (10 < level & level < 25) {
	    damage += 13;
	    health += 15;
	    cost += 50;
	}
	if (25 < level & level < 50) {
	    damage += 30;
	    health += 30;
	    cost += 200;
	}
	else {
	    damage += 50;
	    health += 60;
	    cost += 800;	    
	}
    }

    public void lowerHealth(int dmg) {
	health -= dmg;
    }

    public String toString() {
	return name;
    }
}
