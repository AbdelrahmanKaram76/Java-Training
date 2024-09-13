/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomandsimulations;


/**
 *
 * @author abdel
 */
public class RandomAndSimulations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Die d = new Die(6);
        final int TRIES = 10 ;
        for(int i = 1 ; i <= TRIES ; i++)
        {
            int n = d.cast();
            System.out.println(n + " ");
        }
        System.out.println();
    }
    
}
