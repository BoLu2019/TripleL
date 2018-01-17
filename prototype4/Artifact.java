public class Artifact{
    
    private String name;
    private int level;
    private final int COST;

    
    public Artifact(){
        
        name = "Artifact";
        level = 999;
        COST = 30;
        
    }
    
    public String getName(){
        return name;
    }
    
    public int getCost(){
        return COST;
    }
    
    
    public String toString(){
        return "This is an Artifact.";
    }
    
}
