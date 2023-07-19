package ec.edu.espe.evsustore.controller;

import ec.edu.espe.evsustore.model.HardwareComponent;
import java.util.ArrayList;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class HardwareComponentController {
    public static int generateId(){
        DatabaseController database = DatabaseController.getInstance();
        ArrayList<HardwareComponent> componentsInDB = database.obtainAllComponents();
        return componentsInDB.size()+1;
    }
    
    public static Double calculatePrice (Double componentCost, Double gainPercentage){
        
        return (1+(gainPercentage/100.0F))*(componentCost);
    }
    
}
