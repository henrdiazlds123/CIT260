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
    int gamesPlayed;
    int gamesWon;
    int gamesLost;
    int gamesTies;
    double gamePercent;
    
    /*
     * @param args the command line arguments
     */

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
    
    public void computeScore(){
        gamesWon = 0;
        gamesLost = 3;
        gamesTies = 2;
        gamesPlayed = gamesWon + gamesLost + gamesTies;
        
        if (gamesPlayed == 0)
        {
            System.out.println(this.playerName +", You Need to play first.");
        }
        else 
        {
            gamePercent = (double) (gamesWon) * 100 / (gamesPlayed); 
            gamePercent = Math.round(gamePercent *100) / 100.0d;    //Redondea a dos decimales
            System.out.println("Game Statics");
            System.out.println("\tGames Played: " + gamesPlayed);
            System.out.println("\tGames Won: " + gamesWon);
            System.out.println("\tGames Lost:" + gamesLost);
            System.out.println("\tGames Ties:" + gamesTies);
            System.out.println("\tPercent: " + gamePercent +"%");
        }
    }
    
      
    public static void main(String[] args) {   
        Game myGame = new Game();   //Construye un objeto
        myGame.getName();           //Llama a la funcion getName
        //myGame.displayHelp();       //Llama a la funcion displayHelp
        myGame.computeScore();      //Llama a la funcion que muestra estadistica del juego
    }
}
