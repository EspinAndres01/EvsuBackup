
package ec.edu.espe.evsustore.utils;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class DecimalsControl {
    public static double roundToTwoTenths(Double amountToRound){
        double amountRounded;
        int dollars = (int) (amountToRound/1) ;
        double cents = (amountToRound%1)*100;
        
        if(cents == 0){
            amountRounded = amountToRound;
        }
        else {
            cents = (double) Math.round(cents);
            amountRounded = dollars + (cents/100);
        }
        
        return amountRounded;
    }
}
