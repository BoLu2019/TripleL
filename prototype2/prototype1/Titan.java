public class Titan{

    private String name;
    private int damage;
    private double attackChance;
    private int health;
    private int prize;
    
    public Titan(){

        name = "Titan";
        damage = 20;
        attackChance = 0.1;
        health = 1000;
        prize = 100;
	
    }

    public boolean isAlive(){
        return health > 0;
    }

    public String getName(){
        return name;
    }

    public int getPrize(){
	return prize;
    }

    public int attack(Player p){
        if (Math.random() < attackChance){
            p.getAttacked(damage);
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
