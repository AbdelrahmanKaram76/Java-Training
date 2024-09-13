/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxrate;

/**
 *
 * @author abdel
 */
public class taxes {
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;
    
    public static final double RATE1 = 0.10;
    public static final double RATE2 = 0.25;
    
    public static final int SINGLE_LIMIT = 32000;
    public static final int MARRIED_LIMIT = 64000;
    
    private double income = 0  ;
    private int status = 0 ;
    
    public taxes(double anIncome , int martialStatus)
    {
        income = anIncome ;
        status = martialStatus ; 
    }
    
    public double getTax()
    {
        double tax1 = 0;
        double tax2 = 0;
        if (status == SINGLE)
        {
            if (income  <= SINGLE_LIMIT)
            {
                tax1 = income * RATE1;
            }
            else
            {
                tax1 = RATE1 * SINGLE_LIMIT ;
                tax2 = RATE2 * (income - SINGLE_LIMIT);               
            }
        }
        else
        {
            if (income <= MARRIED_LIMIT)
            {
                tax1 = income * RATE1;
            }
            else
            {
                tax1 = RATE1 * MARRIED_LIMIT ;
                tax2 = RATE2 * (income - MARRIED_LIMIT);
            }
            
        }
        return tax1 + tax2;
    }
}
