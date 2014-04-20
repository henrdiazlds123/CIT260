/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package galtolittable;

/**
 *
 * @author henrydiazlds
 */
public class GalToLitTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double galones, litros;
        int counter;
        
        counter = 0;
        
        for(galones = 1; galones <= 100; galones++) {
            litros = galones * 3.7854; //convert to liters
            System.out.println(galones + " gallons is " + litros + " liters.");
            
            counter++;
            if(counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
