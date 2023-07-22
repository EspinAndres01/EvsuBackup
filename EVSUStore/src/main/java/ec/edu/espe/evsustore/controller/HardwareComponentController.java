package ec.edu.espe.evsustore.controller;

import com.mongodb.client.MongoCollection;
import ec.edu.espe.evsustore.model.HardwareComponent;
import ec.edu.espe.evsustore.utils.DatabaseManager;
import ec.edu.espe.evsustore.utils.DecimalsControl;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class HardwareComponentController {
    DatabaseController database;
    MongoCollection collection;
    
    private static HardwareComponentController instance;
    
    private HardwareComponentController() {
        this.database = DatabaseController.getInstance();
        this.collection = this.database.changeCollection("HardwareComponents");
    }
    
    public synchronized static HardwareComponentController getInstance (){
        if (instance != null){
        
        } 
        else {
            instance = new HardwareComponentController();
        }
        
        return instance;
    }
    
    public int generateId(){
        return obtainAllFromDb().size()+1;
    }
    
    public boolean isInDB(HardwareComponent component){
        boolean isInDB;
        isInDB = DatabaseManager.existsDocument(collection, "id", component.getId());
        return isInDB;
    }
    
    public boolean save(HardwareComponent component){
        boolean verification;
        verification = DatabaseManager.insertDocument(collection, component.getData());
        return verification;
    }
    
    public boolean update(HashMap<Object, Object> componentData){
        boolean verification;
        verification = DatabaseManager.updateDocument(collection, componentData);
        return verification;
    }
    
    public boolean update(HardwareComponent component){
        boolean verification;
        verification = DatabaseManager.updateDocument(collection, component.getData());
        return verification;
    }
    
    public boolean delete(HardwareComponent component){
        boolean verification;
        verification = DatabaseManager.deleteDocument(collection, component.getData());
        return verification;
    }
    
    public boolean delete(HashMap<Object, Object> componentData){
        boolean verification;
        verification = DatabaseManager.deleteDocument(collection, componentData);
        return verification;
    }
    
    public HashMap<Object, Object> obtainFromDb(int id){
        
        return DatabaseManager.obtain(collection, id);
    }
    
    public ArrayList<HashMap<Object, Object>> obtainAllFromDb(){
        
        return DatabaseManager.obtainAll(collection);
    }
    
    public Double calculatePrice(Double cost, Double gainPercentage){
        Double price = (1+(gainPercentage/100.0))*cost;
        
        return DecimalsControl.roundToTwoTenths(price);
    }
    
}
