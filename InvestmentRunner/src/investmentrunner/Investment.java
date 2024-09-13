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
public class Investment {
    private  int years ;
    private double balance , RATE ;
    
    
    /**
     * Constructor that accept Balance And rate of interest 
     * @param incomeBalance that Customer income every year
     * @param interestRate of interest that increase Employee income every Year
     */
    public Investment(double incomeBalance , double interestRate )
    {
        balance = incomeBalance ;
        RATE = interestRate;
        years = 0;
    }
    /**
     * waitForBalance Method that Calculate Years that Employee reach to Target balance he/she want and interest Rate he/she increase
     * @param targetBalance Number of income Employee want to reach it in some years
     */
    public void waitForBalance(double targetBalance)
    {
        while(balance < targetBalance)
        {
            years++;
            double interest = balance * RATE / 100;
            balance += interest;
        }
    }
    /**
     * getYears Method for Return Number of Years that Employee Reach to his Target Balance in specific number of years
     * @return No.Years
     */
    public int getYears(){
        return years;
    }
    /**
     * Method that Get the current investment Balance
     * @return the current balance
     */
    public double getBalance(){
        return balance;
    }
}
