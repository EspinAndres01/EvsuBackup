
package ec.edu.espe.evsustore.controller;

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
public class HardwareComponentControllerTest {
    
    public HardwareComponentControllerTest() {
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
     * Test of generateId method, of class HardwareComponentController.
     */
    @Test
    public void testGenerateId() {
        System.out.println("generateId");
        int expResult = DatabaseController.getInstance().obtainAllComponents().size()+1;
        int result = HardwareComponentController.generateId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of calculatePrice method, of class HardwareComponentController.
     */
    @Test
    public void testCalculatePrice() {
        System.out.println("calculatePrice");
        Double componentCost = 5.0;
        Double gainPercentage = 10.0;
        Double expResult = 5.50;
        Double result = HardwareComponentController.calculatePrice(componentCost, gainPercentage);
        assertEquals(expResult, result);
    }
    
}
