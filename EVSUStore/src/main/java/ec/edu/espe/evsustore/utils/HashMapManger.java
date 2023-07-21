
package ec.edu.espe.evsustore.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class HashMapManger {
    public static ArrayList<String> getKeys(HashMap<Object, Object> map){
        ArrayList<String> keys = new ArrayList<>();
        
        for(Map.Entry<Object,Object> keyValues: map.entrySet()){
            keys.add((String) keyValues.getKey());
        }
        
        return keys;
    }
    
    public static ArrayList<String> getValues(HashMap<Object, Object> map){
        ArrayList<String> keys = new ArrayList<>();
        
        for(Map.Entry<Object,Object> keyValues: map.entrySet()){
            keys.add((String) keyValues.getValue());
        }
        
        return keys;
    }
    
    
    
}
