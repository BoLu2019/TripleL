public class Titan{

    private String name;
    private int dmg;
    private double attackPeriod;
    private int health;
    
    public Titan(){

	name = "Titan";
	dmg = 20;
	attackPeriod = 2.5;
	health = 1000;
	
    }

    public boolean isAlive(){
	return health > 0;
    }

    public String getName(){
	return name;
    }

    public int attack(Hero h){
	h.lowerHealth(damage);
	return damage;
    }

    public void lowerHealth(int dmg){
	health -= dmg;
    }

    public String toString(){
	return "This is a Titan.";
    }

}
