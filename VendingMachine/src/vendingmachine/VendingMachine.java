/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.Scanner;
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int PENNIS_PER_DOLLAR = 100;
        final int PENNIS_PER_QUARTER = 25;
        
        System.out.println("Enter bill Value : ");
        int billValue = in.nextInt();
        System.out.println("Enter item price in Pennis :");
        int itemPrice = in.nextInt();
        
        int changeDue = PENNIS_PER_DOLLAR * billValue - itemPrice ;
        int dollarCoin = changeDue / PENNIS_PER_DOLLAR ;
            changeDue = changeDue % PENNIS_PER_DOLLAR;
        int quarterCoin = changeDue / PENNIS_PER_QUARTER;
            System.out.printf("Dollar coins: %6d", dollarCoin);
            System.out.println();
            System.out.printf("Quarters: %6d", quarterCoin);
            System.out.println();   
    }
    
}
