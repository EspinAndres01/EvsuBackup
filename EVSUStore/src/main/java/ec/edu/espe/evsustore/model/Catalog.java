
package ec.edu.espe.evsustore.model;

import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Catalog implements Mapeable{
    int id;
    String productDescription;
    int quantity;
    Double pvp;
    HashMap<Object, Object> data;

    public Catalog(int id, String productDescription, int quantity, Double pvp) {
        data = new HashMap<>();
        data.put("id", id);
        data.put("productDescription", productDescription);
        data.put("quantity", quantity);
        data.put("pvp", pvp);
        
        
        this.id = id;
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.pvp = pvp;
    }

    

    @Override
    public HashMap<Object, Object> getData() {
        return data;
    }
}
