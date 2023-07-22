
package ec.edu.espe.evsustore.model;

import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Catalog implements Mapeable{
    String productDescription;
    int quantity;
    Double price;
    HashMap<Object, Object> data;

    @Override
    public String toString() {
        return "Catalog{" + "productDescription=" + productDescription + ", quantity=" + quantity + ", price=" + price + ", data=" + data + '}';
    }

    
    
    public Catalog( String productDescription, int quantity, Double price) {
        data = new HashMap<>();
        data.put("productDescription", productDescription);
        data.put("quantity", quantity);
        data.put("price", price);
        
        this.productDescription = productDescription;
        this.quantity = quantity;
        this.price = price;
    }

    

    @Override
    public HashMap<Object, Object> getData() {
        return data;
    }
}
