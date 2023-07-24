package ec.edu.espe.evsustore.controller;

import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class TransactionsController {
    public static Double calcTotal(HashMap<Object, Object> product) {
        Double price = Double.valueOf(product.get("price").toString());
        int quantity = Integer.parseInt(product.get("quantity").toString());
        return price * quantity;
    }
}
