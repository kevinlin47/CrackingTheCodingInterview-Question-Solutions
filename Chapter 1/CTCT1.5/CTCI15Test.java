/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci.pkg1.pkg5;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Lin
 */
public class CTCI15Test {
    
    public CTCI15Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }



    /**
     * Test of oneAway method, of class CTCI15.
     */
    @Test
    public void testOneAway() {
        System.out.println("oneAway");
        String a = "Array";
        String b = "bsreez";
        boolean expResult = false;
        boolean result = CTCI15.oneAway(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
  
    }

    /**
     * Test of main method, of class CTCI15.
     */

    
}
