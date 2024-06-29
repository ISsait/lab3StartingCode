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

import java.util.ArrayList;

import implementations.Dictionary;

/**
 *
 * @author istoe
 */
public class DictionaryTest {
    public DictionaryTest() {
    }
    
    /**
     * 
     */
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
     * Test of hasKey method, of class Dictionary.
     */
    @Test
    public void testHasKey() {
        System.out.println("hasKey");
        Object key = null;
        Dictionary instance = null;
        boolean expResult = false;
        boolean result = instance.hasKey(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasValue method, of class Dictionary.
     */
    @Test
    public void testHasValue() {
        System.out.println("hasValue");
        Object value = null;
        Dictionary instance = null;
        boolean expResult = false;
        boolean result = instance.hasValue(value);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class Dictionary.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        Object key = null;
        Dictionary instance = null;
        Object expResult = null;
        Object result = instance.get(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class Dictionary.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Dictionary instance = null;
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Dictionary.
     */
    @Test
    public void testAdd() throws Exception {
        System.out.println("add");
        Object key = null;
        Object value = null;
        Dictionary instance = null;
        boolean expResult = false;
        boolean result = instance.add(key, value);
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
     * Test of size method, of class Dictionary.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Dictionary instance = null;
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateKey method, of class Dictionary.
     */
    @Test
    public void testUpdateKey() {
        System.out.println("updateKey");
        Object key = null;
        Object newKey = null;
        Dictionary instance = null;
        boolean expResult = false;
        boolean result = instance.updateKey(key, newKey);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
