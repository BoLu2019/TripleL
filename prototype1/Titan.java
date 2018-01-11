public class Titan{

    private String name;
    private int damage;
    private double attackChance;
    private int health;
    
    public Titan(){

        name = "Titan";
        damage = 20;
        attackChance = 0.1;
        health = 1000;
	
    }

    public boolean isAlive(){
        return health > 0;
    }

    public String getName(){
        return name;
    }

    public int attack(Hero h){
        if (Math.random() < attackChance){
            h.lowerHealth(damage);
            return damage;
        }
        return 0;
    }

    public void lowerHealth(int dmg){
        health -= dmg;
    }

    public String toString(){
        return "This is a Titan.";
    }

}
