public class Hero  {

    public String name;
    public int damage;
    public int level;
    public int health;
    public int cost;
    public int levelUpCost;

    public Hero() {
       name = "Hero";
       damage = 1;
       level = 1;
       health = 200;
       cost = 50;
       levelUpCost = 20;
    }
 //accessor for hero name
    public String getName() {
       return name;
    }
	//accessor for cost of hero
    public int getCost(){
	return cost;
    }
	//accessor for get hero's level up cost
    public int getLevelUpCost(){
	return levelUpCost;
    }
	//accessor for getting hero's level
    public int getLevel() {
	return level;
    }
    //tells hero to attack, returns damage dealt
    public int attack(Titan t) {
       t.lowerHealth(damage);
       return damage;
    }
	//levels up the hero
    public void levelUp() {
       level ++;
    }
    
	//not used for our version anymore	
    public void lowerHealth(int dmg) {
       health -= dmg;
    }

    public String toString(){
	String s = name;
	s += "\nHealth: " + health;
	s += "\nLevel: " + level;
	s += "\ndamage: " + damage;
    s += "\nneed " + levelUpCost + " gold to level up";
	return s;
    }

    /*
    public int compareTo(Hero h){
	return this.getName() - h.getName();	
    }
    */


}
