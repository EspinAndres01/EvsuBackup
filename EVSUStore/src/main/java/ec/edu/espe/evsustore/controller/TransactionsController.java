package ec.edu.espe.evsustore.controller;

import ec.edu.espe.evsustore.utils.DecimalsControl;
import ec.edu.espe.evsustore.utils.Tax;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class TransactionsController {
    static double IVAPercentage = 12.0;
    
    public static Double calcTotal(HashMap<Object, Object> product) {
        Double price = Double.valueOf(product.get("price").toString());
        int quantity = Integer.parseInt(product.get("quantity").toString());
        return DecimalsControl.roundToTwoTenths(price * quantity);
    }
    
    public static Double calcExchange(Double price, Double moneyReceived) {
        return DecimalsControl.roundToTwoTenths(moneyReceived - price);
    }
    
    public static Double calcIVA(Double priceWithoutTax){
        Double IVA = Tax.computeIVA(priceWithoutTax, IVAPercentage);
        return DecimalsControl.roundToTwoTenths(IVA);
    }
}
