
package ec.edu.espe.evsustore.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class ViewController {

    
    
    public static void displayTable(JTable table, ArrayList<HashMap<Object, Object>> mapedsData){
        
        DefaultTableModel inventoryTableModel = writeTable(table, mapedsData);
        table.setModel(inventoryTableModel);
        table.setDefaultEditor(Object.class, null);
    }
    
    public static DefaultTableModel writeTable(JTable table, ArrayList<HashMap<Object, Object>> mapedsData) {
        DefaultTableModel tableModel = new DefaultTableModel();
        
        HashMap<Object, Object> referenceMap = mapedsData.get(0);
        
        ArrayList<String> header = new ArrayList<>();
        
        for(Map.Entry<Object,Object> keyValues: referenceMap.entrySet()){
            header.add((String) keyValues.getKey());
        }
        
        tableModel.setColumnIdentifiers(header.toArray());
        
        Object[] tableData = new Object[header.size()];
        
        for(HashMap<Object, Object> mapedData: mapedsData){
            int i = 0;
            for(Map.Entry<Object,Object> keyValues: mapedData.entrySet()){
                tableData[i] = keyValues.getValue();
                i++;
            }
            
            tableModel.addRow(tableData);
            
        }
        
        return tableModel;
    }
    
    

    
}
