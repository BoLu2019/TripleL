import cs1.Keyboard;
import java.awt.event.*;

public class Woo implements KeyListener{

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
    
    public String gameMenu(){
        String display = "";

        //Insert code for titan drawings later. Include titan health as well.

	
        display += "----------- Commands: hit appropriate key -----------\n";
        display += "[a: Attack]  [s: Skills]  [h: Heroes]  [i: Inventory]";
        //Code for displaying player's current gold, damage, and level

        return display;
		    
    }//ends gameMenu */

    //Keylistener stuff
    
    public void newGame(){
        
        System.out.println("Welcome to Type Titans.\nHow do you call yourself, adventurer?");
        p = new Player(Keyboard.readString());
        System.out.println(gameMenu());
        playTurn();
    }
    
    public void tap(){
        p.attack(t);
        t.attack(p);
    }
    
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_A){
            tap();
            System.out.println(t);
        }
        if (key == KeyEvent.VK_S){
        
        }
        if (key == KeyEvent.VK_H){
            
        }
        if (key == KeyEvent.VK_I){
            
        }
    }
    
    public void keyReleased(KeyEvent e){
    }
    
    public void keyTyped(KeyEvent e){
    }
    
    public void playTurn(){
        t = new Titan();
        String input;
        /* while (t.isAlive()){
            input = Keyboard.readString();
            if (input == "a"){
                tap();
                System.out.println(t);
            }
        } */
    }
    
    public static void main(String[] args){

        Woo w = new Woo();
        
        
    }




    
}//end class
