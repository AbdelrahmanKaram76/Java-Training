/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;


public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
            BankAccount Customer1  = new BankAccount(1000);
             Customer1.deposit(150);
             Customer1.withdraw(350);
             System.out.println(Customer1.getBalance());
             CashRegister register = new CashRegister();
             register.recordPurchase(29.50);
             register.recordPurchase(9.25);
             register.getItamCount();
             register.recievePayment(50);
             System.out.println(register.giveChange());
             Menu mainMenu = new Menu();
             mainMenu.addOption("Open New Account");
             mainMenu.addOption("LogIn");
             mainMenu.addOption("Help");
             mainMenu.addOption("Quit");
             mainMenu.displayMenu();
           addInterest acc1 = new addInterest(1000,0.10);
          System.out.println(acc1.getBalance()); 
           acc1.addInterest();
          System.out.println(acc1.getBalance()); 
    }
    
}
