
package ec.edu.espe.evsustore.controller;

import net.suuft.libretranslate.Translator;
import ec.edu.espe.evsustore.utils.HashMapManger;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.suuft.libretranslate.Language;

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
        
        ArrayList<Object> mapKeys = HashMapManger.getKeys(referenceMap);
        int initialIdIndex = HashMapManger.getIdIndex(referenceMap);
        HashMapManger.reorderkeys(mapKeys);
        
        for(Object key: mapKeys){
            header.add(translateText(key.toString()).toUpperCase());
        }
        
        tableModel.setColumnIdentifiers(header.toArray());
        
        Object[] tableData = new Object[header.size()];
        
        for(HashMap<Object, Object> mapedData: mapedsData){
            int i = 0;
            ArrayList<Object> values = HashMapManger.getValues(mapedData);
            HashMapManger.reorderValues(values, initialIdIndex);
            for(Object value: values){
                tableData[i] = value;
                i++;
            }
            
            tableModel.addRow(tableData);
            
        }
        
        return tableModel;
    }
    
    public static String translateText(String text){
        String translatedTex = Translator.translate(Language.ENGLISH, Language.SPANISH, text);
        return translatedTex;
    }

    
}
