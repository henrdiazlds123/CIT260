package fourinline;

import java.util.Scanner;


/**
 *
 * @author henrydiazlds
 */
public class Game {
    String playerName;
    String instructions = "Este es el fabuloso juego \"Cuatro en Linea\".\n\n"
            + "Usted estara jugando contra la computadora o contra otro jugador.\n"
            + "El objetivo de este juego es colocar cuatro de tus fichas en una\n"
            + "linea, bien sea horizontal, vertical o diagonalmente.\n"
            + "Buena Suerte!!! y disfruta de este entretenido y retante juego.\n";
    
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
       

