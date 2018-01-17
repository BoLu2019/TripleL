public class AAron extends Hero {
    
    public AAron() {
	name = "AAron the Thief";
	damage = 10;
	level = 1;
	health = 105;
	cost = 100;
	levelUpCost = 50;
    }

    public void levelUp() {
	level ++;
	if (level <= 10) {
	    damage += 15;
	    health += 30;
	    levelUpCost += 50;
	} else if (level < 25) {
	    damage += 40;
	    health += 55;
	    levelUpCost += 75;
	} else if (level < 50) {
	    damage += 30;
	    health += 30;
	    levelUpCost += 100;
	} else {
	    damage += 50;
	    health += 60;
	    levelUpCost += 125;
	}
    }
}
