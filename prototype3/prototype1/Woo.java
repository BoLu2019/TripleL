import cs1.Keyboard;
import java.util.Scanner;
import java.util.ArrayList;

public class Woo{

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
	Brown brown = new Brown();
	AAron aaron = new AAron();
	Beach beach = new Beach();
	Holmes holmes = new Holmes();
	Clyde clyde = new Clyde();

	
	String display = "---- Commands: type appropriate letter for desired command. ----\n" +
	    "[a: Attack]  [s: Skills]  [h: Heroes]  [i: Inventory]";
	String heroesDisplay = "------- Heroes ------------------ Cost ------ Key\n" + 
	    "*** " + brown.getName() + ": " + "          " + brown.getCost() + " G " + "       <1> ***\n" +
	    "*** " + aaron.getName() + ": " + "            " + aaron.getCost() + " G " + "       <2> ***\n" +
	    "*** " + beach.getName() + ": " + "       " + beach.getCost() + " G " + "       <3> ***\n" +
	    "*** " + holmes.getName() + ": " + "      " + holmes.getCost() + " G " + "       <4> ***\n" +
	    "*** " + clyde.getName() + ": " + "          " + clyde.getCost() + " G " + "       <5> ***\n";
	t = new Titan(stage);

	//for fighting a titan
	while( t.isAlive() ){
	    
	    System.out.println("[Stage] : " + stage + "\n");
	    System.out.println("[Titan Health] : " +  t.getHealth() + "\n");
	    System.out.println("[Gold] : " + p.getGold() + "\n");
	    System.out.println(display+"\n");

	    String command = Keyboard.readString();
	    if(command.equals("a")){
		System.out.println("\n\n\nDealt " + p.attack(t)+ " Damage!" + "\n");
	    }
	    if(command.equals("h")){
	    	System.out.println(heroesDisplay);
		System.out.println("Press the Number Key For the Hero you want to Hire:");
		int purchase = Keyboard.readInt();
		if(purchase == 1) {
		    p.buyHero(brown);
		    System.out.println("\n");
		}
		if(purchase == 2) {
		    p.buyHero(aaron);
		    System.out.println("\n");
		}
		if(purchase == 3) {
		    p.buyHero(beach);
		    System.out.println("\n");
		}
		if(purchase == 4) {
		    p.buyHero(holmes);
		    System.out.println("\n");
		}
		if(purchase == 5) {
		    p.buyHero(clyde);
		    System.out.println("\n");
		}
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
	    while(titans<6){
		if(! w.playGame()){
		    titans++;
		    System.out.println(titans + "/5 Titans Left");
		}
	    }
	    w.advanceStage();
	}

        
    }





    
}//end class
