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
public class CashRegister {
    
    private double purchase = 0;
    private double payment = 0;
    private int itemCount = 0;
    /**
     * Single Empty Constructor For CashRegister
     */
    public CashRegister(){
        
    }
    /**
     * Record a sale of an item 
     * @param amount the price of item
     */
    public void recordPurchase(double amount){
        purchase += amount;
        itemCount++;
    }
    /**
     * Processes a payment received from the customer.
     * @param amount the amount of payment
     */
    public void recievePayment(double amount){
        payment += amount;
    }
    /**
     * Computes the change due and resets the machine for the next customer.
     * @return the change due to the customer
     */
    public double giveChange(){
        double change = payment - purchase ;
        purchase = 0;
        payment = 0;
        return change;
    }
    public void getItamCount(){
        System.out.println(itemCount);
    }
}
