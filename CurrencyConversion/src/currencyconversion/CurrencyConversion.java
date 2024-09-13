/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currencyconversion;

import java.util.Scanner;
public class CurrencyConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double aDollar = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("What is today's price for one dollar in Japanese Yen? ");
        double aDollarInYen = input.nextDouble();
        do
        {
            System.out.printf("%nHow many dollars do you have? ");
            aDollar = input.nextDouble();
            double aYen = aDollarInYen * aDollar;
            System.out.printf("%n%f dollars gives you %f in yen.%n", aDollar, aYen);
        }
        while (aDollar != 0);
        
    }
    
}
