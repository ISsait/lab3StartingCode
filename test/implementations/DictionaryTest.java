/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package implementations;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author istoe
 */
public class DictionaryTest {
    
    public DictionaryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class Dictionary.
     */
    @Test
    public void testInsert() throws Exception {
        System.out.println("insert");
        Object key = null;
        Object value = null;
        Dictionary instance = null;
        boolean expResult = false;
        boolean result = instance.insert(key, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class Dictionary.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Object key = null;
        Dictionary instance = null;
        Object expResult = null;
        Object result = instance.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateValue method, of class Dictionary.
     */
    @Test
    public void testUpdateValue() {
        System.out.println("updateValue");
        Object key = null;
        Object value = null;
        Dictionary instance = null;
        boolean expResult = false;
        boolean result = instance.updateValue(key, value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lookUp method, of class Dictionary.
     */
    @Test
    public void testLookUp() {
        System.out.println("lookUp");
        Object key = null;
        Dictionary instance = null;
        Object expResult = null;
        Object result = instance.lookUp(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
