import java.util.ArrayList;

public class Player {

    private String name; 
    private int damage;
    public int gold;
    private int relics;
    private int level;
    private int prestige;
    private ArrayList<Artifact> artifacts;
    private ArrayList<Skill> skills;
    private ArrayList<Hero> heroes;

    public Player() {
        name = "Destroyer of World";
        damage = 1 + ;
        gold = 0;
        relics = 0;
        level = 1;
        prestige = 0;
        artifacts = new ArrayList<Artifact>();
        skills = new ArrayList<Skill>();
        heroes = new ArrayList<Hero>();
    }

    //Instantiates new player with updated player's name
    public Player(String givenName){
        this();
        name = givenName;
    }
    
    //Instantiates new player with updated player's stats -- for prestige usage.
    public Player(String givenName, int damage, int relics, int prestige){
        this();
        name = givenName;
	damage = damage;
	relics = relics;
	prestige = prestige;
	
    }

    //accessor for getting name
    public String getName(){
        return name;
    }

    //accessor get getting gold #
    public int getGold(){
        return gold;
    }

    //accessor for getting # relics
    public int getRelics(){
        return relics;
    }

    //accessor for getting dmg of player
    public int getDamage(){
        return damage;
    }

    //accessor for getting level of player
    public int getLevel(){
	return level;
    }
    
    //accessor for getting prestige of player
    public int getPrestige(){
	return prestige;
    }

    

    //levels up our player and increases damage
    public void levelUp(){
        level ++;
	if(level<10){
	    damage+=5;
	}
	else{
	    damage = (int)(damage*1.1);
	}
    }

    //increases player's gold count
    public void addGold(int amt){
        gold += amt;
    }

    //increases player's relic count
    public void addRelics(int amt){
        relics += amt;
    }

  
    //allows player to buy artifacts given he/she has enough relics
    public void buyArtifact(Artifact a){
        if (relics >= a.getCost()){
            relics -= a.getCost();
            artifacts.add(a);
            System.out.println("You have purchased " + a.getName());
        } else {
            System.out.println("Purchase failed: you need " + (a.getCost() - relics) + " more relics.");
        }
    }






    
    //allows player to buy heroes if they have enough gold
    public void buyHero(Hero h){
	if(heroes.size()>0){
	    for(Hero S: heroes){
		System.out.println(S.equals(h));
		System.out.println(S==h);
		if(S.getName()==h.getName()){
		    if(gold>=S.getLevelUpCost()){
			gold-= S.getLevelUpCost();
			S.levelUp();
			System.out.println("Level up!");
		    }
		}
	    }
	}
		
	else{
	    if(gold >= h.getCost()){
		gold -= h.getCost();
		heroes.add(h);
		System.out.println("You have purchased " + h.getName());
	    }
	    else {
		System.out.println("Purchase failed: Need " + (h.getCost() - gold) + " more gold.");
	    }
	}
    }

    //allows player to unlock skills if they have enough gold
    public void buySkill(Skill s){
        if (level >= s.getUnlockLevel()){
            if (gold >= s.getCost()){ 
                gold -= s.getCost();
                skills.add(s);
                System.out.println("You have purchased " + s.getName());
            } else {
                System.out.println("Purchase Failed: Need " + (s.getCost() - gold) + " more gold.");
            }
        } else {
            System.out.println("Purchase failed: Need to reach Level " + s.getUnlockLevel() + ".");
        }
    }

    //makes player attack, as well as checking the arraylist of heroes to see if they(if any) can attack as well.
    public int attack(Titan t) {
	int dmg = damage;
        t.lowerHealth(damage);

	if(heroes.size() > 0){
	    for(Hero h: heroes){
		dmg += h.attack(t);			    
	    }
	}
	
        return dmg;
    }

    
    /*   
	 public void getAttacked(int dmg){
	 if (! heroes.isEmpty()){
	 heroes.get((int) (Math.random() * heroes.size())).lowerHealth(dmg);
	 }
	 }
    */
    
    public String toString(){
        return getName();
    }
    
}
