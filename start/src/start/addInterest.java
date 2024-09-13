/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;

/**
 *
 * @author abdel
 */
public class addInterest {
    private double interest = 0 ;
    private double balance = 0; 
     /**
      Constructs a savings account with a zero balance
    */
    public addInterest()
    {   
       balance = 0;
       interest = 0;
    }
    /*
    Constructor that initialize Balance and Rate of account
    */
    public addInterest(double initalBalance , double interestRate){
        balance = initalBalance;
        interest = interestRate;
    }
    /*
    Method that add interest with specific interest rate to account balance
    */
    public void addInterest(){
        balance = balance + balance*interest;
    }
    /*
    Method that return balance in account of specific cutomer
    */
    public double getBalance(){
        return balance ;
    }
    
    
}
