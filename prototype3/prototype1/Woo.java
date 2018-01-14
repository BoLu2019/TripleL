import cs1.Keyboard;
import java.util.Scanner;

public class Woo {

    /*
      For displaying the screen that the player sees after running Woo.
      It will contain the commands for playing the game as well(for a friendly
      reminder).
    */
    
    private Player p;
    private Titan t;
    private int stage;
    
    public Woo(){
        newGame();
	stage = 1;
    }

    public int getStage(){
	return stage;
    }

    public void advanceStage(){
	stage++;
    }

    
    public void newGame(){

        System.out.println("Welcome to Type Titans.\nHow do you call yourself, adventurer?");
        p = new Player(Keyboard.readString());


	//Insert code for titan drawings later. Include titan health as well.

       

	
	//Code for displaying player's current gold, damage, and level
		    
    }//ends newGame()

    public boolean playGame(){
	String display = "---- Commands: type appropriate letter for desired command. ----\n"+
	                 "[a: Attack]  [s: Skills]  [h: Heroes]  [i: Inventory]";
	t = new Titan(stage);

	//for fighting a titan
	while( t.isAlive() ){
	    
	    System.out.println("[Stage] : "+ stage);
	    System.out.println("[Titan Health] : " +  t.getHealth());
	    System.out.println("[Gold] : " + p.getGold());
	    System.out.println(display+"\n");

	    String command = Keyboard.readString();
	    if(command.equals("a")){
		System.out.println("\n\n\n\n\n\n\n\n\n\nDealt " + p.attack(t)+ "damage!" + "\n");
	    }

	}

	System.out.println("GJ, he ded");
	System.out.println(t.getPrize());
	p.addGold(t.getPrize());//receives reward from killing titan

	return false;

    }//end playGame()

    
    
    public void tap(){
        p.attack(t);
    }
    
    public static void main(String[] args){


        Woo w = new Woo();
	//for making the game run
	
	while(w.getStage() < 1000){
	    int titans = 0;	
	    while(titans<5){
		if(! w.playGame()){
		    titans++;
		    System.out.println(titans+"/5 titans left");
		}
	    }
	    w.advanceStage();
	}

        
    }





    
}//end class
