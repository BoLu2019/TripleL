public class Artifact{
    
    private String name;
    private int level;
    private final int COST;
    private final int UPGRADECOST;
    
    public Artifact(){
        
        name = "Artifact";
        level = 1;
        COST = 30;
        UPGRADECOST = 20;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return COST;
    }
    
    public void upgrade(){
        level ++;
    }
    
/*     public void equip(Player p){
        p.increaseDamage(1)
    } */
    
    public String toString(){
        return "This is an Artifat.";
    }
    
}