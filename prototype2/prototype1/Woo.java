import cs1.Keyboard;

public class Woo {

    /*
      For displaying the screen that the player sees after running Woo.
      It will contain the commands for playing the game as well(for a friendly
      reminder).
    */
    
    private Player p;
    private Titan t;
    
    public Woo(){
        newGame();
    }
    
 /*    public void gameMenu(){
	String display = "";

	//Insert code for titan drawings later. Include titan health as well.

	
	display += "---- Commands: type appropriate letter and click enter ----\n";
	display += "[a: Attack]  [s: Skills]  [h: Heroes]  [i: Inventory]";
	//Code for displaying player's current gold, damage, and level

	System.out.println(display);
		    

    }//ends gameMenu */

    //Keylistener stuff
<<<<<<< HEAD
=======
    
    public void newGame(){
        
        System.out.println("Welcome to Type Titans.\nHow do you call yourself, adventurer?");
        p = new Player(Keyboard.readString());
        t = new Titan();
    }
    
    public void tap(){
        p.attack(t);
        t.attack(p);
    }
    
    public static void main(String[] args){

        Woo w = new Woo();
        
        
    }
>>>>>>> f8eed387cdbd5705387f940fba90267a8d70fa77




    
}//end class
