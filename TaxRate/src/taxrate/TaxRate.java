/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrate;

import java.util.Scanner;
public class TaxRate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your income :");
        double income = input.nextDouble();
        
        System.out.println("Are you Married ? (Y/N)");
        String inputStr = input.next();
        int status = 0;
        if(inputStr.equals("Y"))
        {
            status = taxes.MARRIED;
        }
        else
        {
            status = taxes.SINGLE;
        }
        taxes C1 = new taxes(income,status);
        System.out.println("Tax : " + C1.getTax());
    }
    
}
