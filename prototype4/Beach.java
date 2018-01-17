public class Beach extends Hero {

    public Beach() {
        name = "Beach the Enthusiast";
        damage = 30;
        level = 1;
        health = 305;
        cost = 800;
        levelUpCost = 150
    }

    public void levelUp() {
	level ++;
	if (level <= 10) {
	    damage += 60;
	    health += 120;
	    levelUpCost += 80;
	} else if (level < 25) {
	    damage += 100;
	    health += 130;
	    levelUpCost += 180;
	} else if (level < 50) {
	    damage += 275;
	    health += 300;
	    levelUpCost += 240;
	} else {
	    damage += 500;
	    health += 700;
	    levelUpCost += 300;	    
	}
    }
}
