/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package investmentrunner;

/**
 *
 * @author abdel
 */
public class InvestmentRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double INITIAL_BALANCE = 10000 ;
        final double RATE = 5;
        Investment invest = new Investment(INITIAL_BALANCE , RATE);
        invest.waitForBalance(2*INITIAL_BALANCE);
        int years = invest.getYears();
        System.out.println("The investment Double After " + years + " Years");
    }
    
}
