/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomandsimulations;
import java.util.Random;


public class Die {
    private Random generator ;
    private int sides;
    /**
     * Constructor a die with a given number of sides
     * @param s the number of sides
     */
    public Die(int s){
        sides = s;
        generator = new Random();
    }
    /**
     * Simulate a throw of a die
     * @return the face of the die
     */
    public int cast()
    {
        return 1+generator.nextInt(6);
    }
    
    
}
