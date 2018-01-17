public class Holmes extends Hero {
    //sets stats for the hero Holmes
    public Holmes() {
	name = "Holmes the Detective";
	damage = 100;
	level = 1;
	health = 975;
	cost = 245;
    levelUpCost = 200;
    }

	//adds conditionals for the levelUp for proper damage scaling
    public void levelUp() {
	level ++;
	if (level <= 10) {
	    damage += 200;
	    health += 300;
        levelUpCost += 50;
	} else if (level < 25) {
	    damage += 400;
	    health += 780;
        levelUpCost += 75;
	} else if (level < 50) {
	    damage += 1000;
	    health += 2000;
        levelUpCost += 100;
	} else {
	    damage += 3000;
	    health += 3000;
        levelUpCost += 125;
	}
    }
}
