/*
 * Evan Robertson
 * October 2nd
 * 
 */

package shopping;

import java.util.Scanner;

import java.text.*;

/**
 *
 * @author evrob0095
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Variables
        DecimalFormat x = new DecimalFormat("$#,###,###.00");
        Scanner keyedInput = new Scanner(System.in);
        double usbPrice = 19.99;
        double keyboardPrice = 49.99;
        double mousePrice = 25.99;
        double tax = 1.13;
        int usbQuantity;
        int keyboardQuantity;
        int mouseQuantity;
        double subtotal;
        double total;
        
        //Prompt User
        System.out.println("How many USB storage devices would you like to purchase? One USB costs $19.99!");
        usbQuantity = keyedInput.nextInt();
        System.out.println("How many keyboards would you like to purchase? One keyboard costs $49.99");
        keyboardQuantity = keyedInput.nextInt();
        System.out.println("How many computer mice would you like to purchase? One mouse costs $25.99");
        mouseQuantity = keyedInput.nextInt();
        
        //Calculations
        subtotal = (usbQuantity*usbPrice) + (keyboardQuantity*keyboardPrice) + (mouseQuantity*mousePrice);
        total = subtotal*tax;
        
        //Display Bill
        System.out.println("***************************************");
        System.out.println("USB storage devices: " + usbQuantity);
        System.out.println("Keyboards:           " + keyboardQuantity);
        System.out.println("Mice:                " + mouseQuantity);
        
        System.out.println("\nSubtotal:            " + x.format(subtotal));
        System.out.println("Tax:                 $0.13");
        System.out.println("Total:               " + x.format(total));
        System.out.println("****************************************");
                
    }
    
}
