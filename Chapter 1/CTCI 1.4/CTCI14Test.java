/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctci.pkg1.pkg4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin Lin
 */
public class CTCI14Test {
    
    public CTCI14Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of palindromePermutation method, of class CTCI14.
     */
    @Test
    public void testPalindromePermutation() {
        System.out.println("palindromePermutation");
        String s = "Tact Coa";
        boolean expResult = true;
        boolean result = CTCI14.palindromePermutation(s);
        assertEquals(expResult, result);

    }

    
}
