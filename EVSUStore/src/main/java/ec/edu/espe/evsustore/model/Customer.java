
package ec.edu.espe.evsustore.model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class Customer implements Mapeable{
    private int id;
    private String name;
    private String lastName;
    private int phoneNumber;
    private int idCardNumber;
    private ArrayList<Sale> sales;
    
    private HashMap<Object, Object> data;

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", idCardNumber=" + idCardNumber + ", sales=" + sales + ", data=" + data + '}';
    }

    public Customer(int id, String name, String lastName, int phoneNumber, int idCardNumber, ArrayList<Sale> sales) {
        data = new HashMap<>();
        data.put("id", id);
        data.put("name", name);
        data.put("lastName", lastName);
        data.put("phoneNumber", phoneNumber);
        data.put("idCardNumber", idCardNumber);
        data.put("sales", sales);
        
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.idCardNumber = idCardNumber;
        this.sales = sales;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(int idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void setSales(ArrayList<Sale> sales) {
        this.sales = sales;
    }


    @Override
    public HashMap<Object, Object> getData() {
       return data;
    }
}
