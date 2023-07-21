
package ec.edu.espe.evsustore.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Sale implements Mapeable{
    private int id;
    private ArrayList <HardwareComponent> soldComponents;
    private ArrayList <Clothing> soldClothing;
    private int saleId;
    private Customer customer;
    private double salePrice;
    private Date date;

    private HashMap<Object, Object> data;
    
    public Sale(int id, ArrayList<HardwareComponent> soldComponents, 
        ArrayList<Clothing> soldClothing, Customer customer, double salePrice, Date date) {
        data = new HashMap<>();
        data.put("id", id);
        data.put("soldComponents", soldComponents);
        data.put("soldClothing", soldClothing);
        data.put("customer", customer);
        data.put("salePrice", salePrice);
        data.put("date", date);
        
        this.soldComponents = soldComponents;
        this.soldClothing = soldClothing;
        this.customer = customer;
        this.salePrice = salePrice;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
    
    public ArrayList<Clothing> getSoldClothing() {
        return soldClothing;
    }

    public void setSoldClothing(ArrayList<Clothing> soldClothing) {
        this.soldClothing = soldClothing;
    }

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public ArrayList<HardwareComponent> getSoldComponents() {
        return soldComponents;
    }

    public void setSoldComponents(ArrayList<HardwareComponent> soldComponents) {
        this.soldComponents = soldComponents;
    }

    @Override
    public HashMap<Object, Object> getData() {
        return data;
    }
    
    
}
