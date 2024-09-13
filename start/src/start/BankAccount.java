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
//BankAccount class that specify Account balance for someone and withdraw and deposit
public class BankAccount {
    private double balance = 0;
    
    /**
     * Constructor with inital Value with out any deposit money
     */
    public BankAccount(){
        balance = 0 ;
    }
    /**
     * Constructor BankAccount with given balance
     * @param initalBalance 
     */
    public BankAccount(double initalBalance){
        balance = initalBalance ;
    }
    /**
    * deposit amount of money into bankAccount
    * @param amount 
    */
    public void deposit(double amount){
        balance += amount;
    }
    /**
     * Client want to withdraw some cash from his account
     * @param amount 
     */
    public void withdraw(double amount){
       balance -= amount; 
    }
    /**
     * Customr ask to amount of money in his account 
     * @return 
     */
    public double getBalance(){
        return balance;
    }
    
}
