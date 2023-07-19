
package ec.edu.espe.evsustore.controller;

import ec.edu.espe.evsustore.model.HardwareComponent;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class ViewController {
    
    
    public static HardwareComponent obtainComponent(int id){
        DatabaseController databaseController = DatabaseController.getInstance();
        
        HardwareComponent selectedComponent = databaseController.obtainComponent(id);
        
        return selectedComponent;
    }
    
    public static ArrayList<HardwareComponent> obtainAllComponents(){
        DatabaseController databaseController = DatabaseController.getInstance();
        
        ArrayList<HardwareComponent> components = databaseController.obtainAllComponents();
        
        return components;
    }
    
    public static ArrayList<HardwareComponent> obtainComponentsCoincidences(String field){
        DatabaseController databaseController = DatabaseController.getInstance();
        
        ArrayList<HardwareComponent> components = databaseController.obtainComponentsCoincidence(field);
        
        return components;
    }

    public static DefaultTableModel writeTable(ArrayList<HardwareComponent> components, JTable tblComponents) {
        DefaultTableModel inventoryTableModel = new DefaultTableModel();
        
        Object[] componentData = new Object[tblComponents.getColumnCount()];
        
        String[] header = {"ID","Cantidad","Nombre","Modelo","Costo","Precio"};
        
        inventoryTableModel.setColumnIdentifiers(header);
        
        for(HardwareComponent component: components){
            
            componentData[0] = component.getId();
            componentData[1] = component.getQuantity();
            componentData[2] = component.getName();
            componentData[3]= component.getModel();
            componentData[4] = component.getCost();
            componentData[5] = component.getPrice();
            
            inventoryTableModel.addRow(componentData);
            
        }
        
        return inventoryTableModel;
    }
    
    public static DefaultTableModel writeCatalog(ArrayList<HardwareComponent> components, JTable catalogComponents) {
        DefaultTableModel catalogTableModel = new DefaultTableModel();
        
        Object[] componentData = new Object[catalogComponents.getColumnCount()];
        
        String[] header = {"Producto","Cantidad","Precio"};
        
        catalogTableModel.setColumnIdentifiers(header);
        
        for(HardwareComponent component: components){
            
            componentData[0] = component.getName() + " " + component.getModel();
            componentData[1] = component.getQuantity();
            componentData[2] = component.getPrice();
            
            catalogTableModel.addRow(componentData);
            
        }
        
        return catalogTableModel;
    }
    
    
    public static DefaultTableModel writeBillTable(ArrayList<HardwareComponent> components, JTable tblComponents) {
        DefaultTableModel catlaogTableModel = new DefaultTableModel();
        
        Object[] componentData = new Object[tblComponents.getColumnCount()];
        
        String[] header = {"ID","DESCRIPCIÓN","PRECIO UNIT.","DESCUENTO","PRECIO TOTAL"};
        
        catlaogTableModel.setColumnIdentifiers(header);
        
        for(HardwareComponent component: components){
            
            componentData[0] = component.getName()+component.getModel();
            componentData[1] = component.getPrice();
            componentData[2] = component.getQuantity();
            componentData[4] = component.getPrice() * component.getQuantity();
            
            catlaogTableModel.addRow(componentData);
            
        }
        
        return catlaogTableModel;
    }
    
    public static void deleteComponentInDB(HardwareComponent component) {
        DatabaseController databaseController = DatabaseController.getInstance();
        databaseController.delete(component);
    }
    
    public static void saveComponentInDB(HardwareComponent component) {
        DatabaseController databaseController = DatabaseController.getInstance();
        int id = component.getId();
        if(databaseController.obtainComponent(id)==null){
            databaseController.insertComponent(component);
        }
        else{
            databaseController.update(component);
        }
    }
    
    
    
}
