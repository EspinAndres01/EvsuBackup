
package ec.edu.espe.evsustore.controller;

import ec.edu.espe.evsustore.model.Catalog;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class CatalogController {
    DatabaseController database;
    HardwareComponentController componentController;
    
    private static CatalogController instance;
    
    private CatalogController() {
        this.database = DatabaseController.getInstance();
        this.componentController = HardwareComponentController.getInstance();
    }
    
    public synchronized static CatalogController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new CatalogController();
        }
        
        return instance;
    }
    
    public ArrayList<HashMap<Object, Object>> obtainAll() {
        ArrayList<HashMap<Object, Object>> catalog = new ArrayList<>();
        Catalog catalogProduct;
        ArrayList<HashMap<Object, Object>> components = componentController.obtainAllFromDb();
        for(HashMap<Object, Object> component : components){
            
            catalogProduct = convertIntoCatalog(component);
            catalog.add(catalogProduct.getData());
        }
        return catalog;
    }
    
    public Catalog convertIntoCatalog(HashMap<Object, Object> component) {
    
        int quantity = Integer.parseInt(component.get("quantity").toString());
        Double price = Double.valueOf(component.get("price").toString());
        String description1 = component.get("name").toString();
        String description2 = component.get("model").toString();
        String description = description1 + " " +description2;
    
        Catalog catalog = new Catalog(description, quantity, price);
        return catalog;
    }
}
