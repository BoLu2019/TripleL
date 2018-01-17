public class Brown extends Hero {
    
	//setting proper stats for the hero Brown
    public Brown() {
	name = "Brown the Wanderer";
	damage = 3;
	level = 1;
	health = 50;
	cost = 25;
	levelUpCost = 25;
    }
    //adding conditionals for proper scaling of damage.
    public void levelUp() {
	level ++;
	if (level <= 10) {
	    damage += 5;
	    health += 10;
        levelUpCost += 15;
	} else if (level < 25) {
	    damage += 13;
	    health += 15;
    	levelUpCost += 20;
	} else if (level < 50) {
	    damage += 30;
	    health += 30;
        levelUpCost += 25;
	} else {
	    damage += 50;
	    health += 60;
        levelUpCost += 30;	    
	}
    }
}
