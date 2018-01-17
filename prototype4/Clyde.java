public class Clyde extends Hero {

    public Clyde() {
	name = "Clyde the Bride";
	damage = 500;
	level = 1;
	health = 5000;
	cost = 10000;
    levelUpCost = 500
    }

    public void levelUp() {
	level ++;
	if (level <= 10) {
	    damage += 600;
	    health += 1000;
	    levelUpCost += 200;
	} else if (level < 25) {
	    damage += 1200;
	    health += 3000;
	    levelUpCost += 300;
	} else if (level < 50) {
	    damage += 3000;
	    health += 8000;
	    levelUpCost += 400;
	} else {
	    damage += 9000;
	    health += 12000;
	    levelUpCost += 500;
	}
    }
}
