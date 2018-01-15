import java.util.ArrayList;

public class Player {

    private String name; 
    private int damage;
    private int gold;
    private int relics;
    private int level;
    private int prestige;
    private ArrayList<Artifact> artifacts;
    private ArrayList<Skill> skills;
    private ArrayList<Hero> heroes;

    public Player() {
        name = "Destroyer of World";
        damage = 1;
        gold = 0;
        relics = 0;
        level = 1;
        prestige = 0;
        artifacts = new ArrayList<Artifact>();
        skills = new ArrayList<Skill>();
        heroes = new ArrayList<Hero>();
    }

    public Player(String givenName){
        this();
        name = givenName;
    }

    public String getName(){
        return name;
    }

    public int getGold(){
        return gold;
    }

    public int getRelics(){
        return relics;
    }

    public int getDamage(){
        return damage;
    }

    public void levelUp(){
        level ++;
    }

    public void addGold(int amt){
        gold += amt;
    }

    public void addRelics(int amt){
        relics += amt;
    }

    public void buyArtifact(Artifact a){
        if (gold >= a.getCost()){
            gold -= a.getCost();
            artifacts.add(a);
            System.out.println("You have purchased " + a.getName());
        } else {
            System.out.println("Purchase failed: you need " + (a.getCost() - relics) + " more relics.");
        }
    }

    public void buyHero(Hero h){
        if (gold >= h.getCost()){
            gold -= h.getCost();
            heroes.add(h);
            System.out.println("You have purchased " + h.getName());
        } else {
            System.out.println("Purchase failed: Need " + (h.getCost() - gold) + " more gold.");
        }
    }

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
    
    public int attack(Titan t) {
	
        t.lowerHealth(damage);
        return damage;
    }
    
    public void getAttacked(int dmg){
        if (! heroes.isEmpty()){
            heroes.get((int) (Math.random() * heroes.size())).lowerHealth(dmg);
        }
    }

    public String toString(){
        return getName();
    }
    
}
