/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package galtolit;

/**
 *
 * @author henrydiazlds
 */
public class GalToLit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double galones; //hold the number of gallons
        double litros; //hold convertion to liters
        
        galones = 10; //start with 10 gallons
        litros = galones * 3.7854; //convert to liters
        
        System.out.println(galones +" gallons is " + litros +" liters.");
    }
}