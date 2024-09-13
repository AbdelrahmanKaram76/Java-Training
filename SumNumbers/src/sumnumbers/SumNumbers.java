/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumnumbers;

import java.util.Scanner;
public class SumNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* int totalEven = 0 ;
        int totalSquare = 0 ;
        for(int i=2 ; i<=100 ; i++)
        {
            if( i % 2 == 0){
                totalEven += i;
            }
            
        }
        System.out.println(totalEven);
        for(int x = 1 ; x <=100 ; x++)
        {
            
            totalSquare +=x*x;
        }
        System.out.println(totalSquare);
        
        for( int j = 0 ; j <=20 ; j++ ){
            System.out.println(Math.pow(2, j));
        }*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to add all odd digit :");
        int Number  = input.nextInt();
        int digit = 0;
        while(Number > 0)
        {
            int x = Number % 10;
            if ( x % 2 != 0){
                digit += x;
            }
            Number /= 10;
        }
        
        System.out.println(digit);
        
        
    }
    
}
