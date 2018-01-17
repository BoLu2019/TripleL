public class Titan{

    private String name;
    private int damage;
    private double attackChance; 
    private int health; //how much hitpoints does this titan have
    private int prize; //how much gold will the titan give you after you slay it
    private int stage; // current stage

    //some scalings are borrowed from the game
    public Titan(){

        name = "Titan";
        damage = 20;
        attackChance = 0.01;
        health = (int)( 17.5 *  (int)Math.pow(1.39,min(stage,115)) * (int)Math.pow(1.13,max(stage-115,0)));
        prize = 100;
	stage = 1;
    }

    //for updating Titan stats
    public Titan( int stage ){
	stage = stage;
        health = (int)( 17.5 *  (int)Math.pow(1.39,min(stage,115)) * (int)Math.pow(1.13,max(stage-115,0))) ;
        prize = (int)(health * 0.008 + 0.002 * min(stage,150 ))+ 10 ;
	
    }
	//helper method for computing titan health and prize scalings
    public int max(int x, int y){
	if(x>y){
	    return x;
	}
	return y;
    }
	//helper method for computing titan health and prize scalings
    public int min(int x, int y){
	if(x<0)
	    return y;
	if(x<y){	   
	    return x;
	}
	return y;
    }
	//boolean for is Titan dead/alive
    public boolean isAlive(){
        return health > 0;
    }
	//accessor for getting titan's name
    public String getName(){
        return name;
    }
  	//accessor for getting titan's health  
    public int getHealth(){
        return health;
    }

	//accessor for getting gold reward from killing titan
    public int getPrize(){
	return prize;
    }
	//mutator to kill the titan
    public void lowerHealth(int dmg){
        health -= dmg;
    }

    public String toString(){
        return "This is a Titan.";
    }

}
