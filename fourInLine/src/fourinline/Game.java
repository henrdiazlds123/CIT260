package fourinline;

import java.util.Scanner;


/**
 *
 * @author henrydiazlds
 */
public class Game {
    String playerName;
    String instructions = "This is the fabulous game \"Four in a Line\".\n\n"
            + "You will be playing against the computer or against another player.\n"
            + "The objective of this game is to place four of your chips in a \n"
            + "line, either horizontally, vertically or diagonally.\n"
            + "Good Luck! and enjoy this fun and challenging game.\n";
    
    //Sound.BACK.loop();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Game myGame = new Game();   //Construye un objeto
        myGame.getName();                       //Llama a la funcion getName
        myGame.displayHelp();                   //Llama a la funcion displayHelp
    }
        public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");//Pregunta el nombre del jugador
        this.playerName = input.nextLine();     //Asigna la entrada a la variable playerName
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + 
                this.playerName +"!\n");        //Msj de Bienvenida
        System.out.println(this.instructions);  //Instrucciones
    }
}
       

