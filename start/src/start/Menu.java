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
public class Menu {
    private String menuText;
    private int optionCount;
    /**
     * Empty Constructor to initialize empty list
     */
    public Menu(){
        menuText = "";
        optionCount = 0;
    }
    /**
     * Constructor to initialize a list with one item 
     * @param firstOption 
     */
    public Menu(String firstOption){
        
        menuText = firstOption ;
        optionCount = 0 ;
    }
    /**
     * display all menu item in screen 
     */
    public void displayMenu(){
        System.out.println(menuText);
    }
    /*
    add item to the menu list
    */
    public void addOption(String option){
        optionCount++;
//        menuText = menuText + optionCount + ")" + option + "\n" ;
        menuText = menuText.concat(option)+"\n";
    }
}
