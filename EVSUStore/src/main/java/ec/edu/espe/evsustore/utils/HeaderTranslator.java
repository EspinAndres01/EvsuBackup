
package ec.edu.espe.evsustore.utils;

import java.util.HashMap;
/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class HeaderTranslator {
    
    public static HashMap<String, String> possibleTranslationsEN_ES() {
        HashMap<String, String> transalations = new HashMap<>();
        
        transalations.put("id" , "id");
        transalations.put("name" , "nombre");
        transalations.put("model" , "modelo");
        transalations.put("productDescription" , "Descripción del producto");
        transalations.put("quantity" , "cantidad");
        transalations.put("cost" , "$ costo");
        transalations.put("price" , "$ precio");
        transalations.put("phoneNumber" , "No. de Tlf.");
        transalations.put("idCardNumber" , "No. de Cedula");
        transalations.put("location" , "direccion");
        transalations.put("lastName" , "apellido");
        
        return transalations;
    }
    
    public static String translateEN_ES(String textToTranslate) {
        HashMap<String, String> translations = possibleTranslationsEN_ES();
        String translation = translations.get(textToTranslate);
        
        if(translation == null){
            return textToTranslate;
        } else {
            return translation;
        }
    }
}
