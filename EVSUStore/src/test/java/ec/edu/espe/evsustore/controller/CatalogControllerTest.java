
package ec.edu.espe.evsustore.controller;

import ec.edu.espe.evsustore.model.Catalog;
import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Joan Cobeña, KillChain, DCCO-ESPE
 */
public class CatalogControllerTest {
    
    public CatalogControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }


    /**
     * Test of convertIntoCatalog method, of class CatalogController.
     */
    @Test
    public void testConvertIntoCatalog() {
        System.out.println("convertIntoCatalog");
        HashMap<Object, Object> component = new HashMap<>();
        component.put("id", 1);
        component.put("quantity", 2);
        component.put("cost", 23.4);
        component.put("price", 26.89);
         component.put("name", "lel");
        component.put("model", "XD");
        
        CatalogController instance = CatalogController.getInstance();
        Catalog expResult = new Catalog("lel XD", 2, 26.89);
        System.out.println(expResult.toString());
        Catalog result = instance.convertIntoCatalog(component);
        System.out.println(result.toString());
        assertEquals(expResult.toString(), result.toString());
    }
    
}
