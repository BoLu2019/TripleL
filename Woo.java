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
    private int prestige;
    
	//sets beginning to stage 1
    public Woo(){
	// newGame();
	stage = 1;
    }

		//accessor for  getting current
    public int getStage(){
	return stage;
    }

	//advances the player to the next stage
    public void advanceStage(){
	stage++;	
    }
	//increase prestige count
    public void prestige(){
	prestige++;
    }


	//method for beginning a new game of Type Titans, instantiates player based off prestige count. Makes game 
	progress through stages.
    int counter = 1;
    public void newGame(Woo woo){
        System.out.println("Welcome to Type Titans.\nHow do you call yourself, adventurer?");
	String name = Keyboard.readString();
	if(prestige>0){
		counter *= 2;
	    p = new Player(name, counter, prestige);
	}
	else{
	    p = new Player(name);
	}
	
	while(woo.getStage() < 1000){
	    int titans = 0;	
	    while(titans<6){
		if(! woo.playGame()){
		    titans++;
		    System.out.println(titans + "/5 Titans Left");
		}
	    }
	    woo.advanceStage();
		p.levelUp();
	}
       
        
		    
    }//ends newGame()

	//method for displaying text to interact with user as they play the game, to guide them. Allows user
	interaction with our game.
    public boolean playGame(){
	Brown brown = new Brown();
	AAron aaron = new AAron();
	Beach beach = new Beach();
	Holmes holmes = new Holmes();
	Clyde clyde = new Clyde();
	HeavenlyStrike hs = new HeavenlyStrike();
	ShadowClone sc = new ShadowClone();
	BerserkerRage br = new BerserkerRage();
	HandsOfMidas hom = new HandsOfMidas();
	
	String display = "---- Commands: type appropriate letter for desired command. ----\n" +
	    "[a: Attack]  [s: Skills]  [h: Heroes]";
	String heroesDisplay = "------- Heroes ------------------ Cost ------ Key\n" + 
	    "*** " + brown.getName() + ": Lv" + brown.getLevel() + "          " + brown.getCost() + " G " + "       <1> ***\n" +
	    "*** " + aaron.getName() + ": Lv" + aaron.getLevel() + "            " + aaron.getCost() + " G " + "       <2> ***\n" +
	    "*** " + beach.getName() + ": Lv" + beach.getLevel() + "       " + beach.getCost() + " G " + "       <3> ***\n" +
	    "*** " + holmes.getName() + ": Lv" + holmes.getLevel() + "      " + holmes.getCost() + " G " + "       <4> ***\n" +
	    "*** " + clyde.getName() + ": Lv" + clyde.getLevel() + "          " + clyde.getCost() + " G " + "       <5> ***\n";
		
	String skillsDisplay = "------- Skills --------- Cost -------- Key\n" + 
	    "*** " + hs.getName() + "      " + hs.getCost() + " G " + "       <1> ***\n" +
	    "*** " + sc.getName() + "        " + sc.getCost() + " G " + "       <2> ***\n" +
	    "*** " + br.getName() + "      " + br.getCost() + " G " + "       <3> ***\n" +
	    "*** " + hom.getName() + "      " + hom.getCost() + " G " + "       <4> ***\n";
		
	t = new Titan(stage);
	//for fighting a titan
	while( t.isAlive() ){
	    
	    System.out.println("[Stage] : " + stage + "\n");
	    System.out.println("[Titan Health] : " +  t.getHealth() + "\n");
	    System.out.println("[Gold] : " + p.getGold() + "\n");
		System.out.println("[Level] : " + p.getLevel() + "\n");
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
		
		if (command.equals("s")) {
			System.out.println(skillsDisplay);
			System.out.println("Press the Number Key for the Skill you want to Keep:");
		int purchase = Keyboard.readInt();
		if(purchase == 1) {
		    p.buySkill(hs);
		    System.out.println("\n");
			hs.activate(p, t);
		}
		if(purchase == 2) {
		    p.buySkill(sc);
		    System.out.println("\n");
		}
		if(purchase == 3) {
		    p.buySkill(br);
		    System.out.println("\n");
		}
		if(purchase == 4) {
		    p.buySkill(hom);
		    System.out.println("\n");
		}
		}
	}

	System.out.println("GJ, he ded");
	System.out.println(t.getPrize());
	p.addGold(t.getPrize());//receives reward from killing titan

	return false;

    }//end playGame()

    
    //one tap is one attack on the titan
    public void tap(){
        p.attack(t);
    }
    
    public static void main(String[] args){

	
        Woo w = new Woo();
	w.newGame(w);
	//for making the game run
	/*	
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
	*/
        
    }





    
}//end class
