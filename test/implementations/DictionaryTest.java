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
import implementations.Dictionary;
import exceptions.*;


/**
 *
 * @author istoe
 */
public class DictionaryTest {
    static Dictionary testDictionary;
    Dictionary emptyDictionary;
    public DictionaryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        testDictionary = new Dictionary();
        int key1 = 3;
        String value1 = "cheese";
        
        int key2 = 4;
        String value2 = "yogurt";
        
        int key3 = 5;
        String value3 = "toast";
        
        testDictionary.insert(key1, value1);
        testDictionary.insert(key2, value2);
        testDictionary.insert(key3, value3);
    }
    
    @AfterClass
    public static void tearDownClass() {
        testDictionary = null;
    }
    
    @Before
    public void setUp() {
        emptyDictionary = new Dictionary();
    }
    
    @After
    public void tearDown() {
        emptyDictionary = null;
    }

    /**
     * Test of insert method, of class Dictionary.
     */
//    @Test
//    public void testInsert() {
//        System.out.println("insert");
//        Object key = null;
//        Object value = null;
//        Dictionary instance = new Dictionary();
//        instance.insert(key, value);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testInsertValid() {
        System.out.println("testInsertValid");
        Object key = 6;
        Object value = "tomatoe";
        assertTrue(emptyDictionary.insert(key, value));
        // TODO review the generated test code and remove the default call to fail.
        fail("testInsertValid failed.");
    }
    
    @Test
    public void testInsertInvalid() {
        System.out.println("testInsertInvalid");
        Object key = 70;
        Object value = null;
        Exception ex = assertThrows(NullPointerException.class, ()->{
        emptyDictionary.insert(key, value);
        });
        String expected = "null";
        String actual = ex.getMessage();
        assertTrue(actual.contains(expected));
        // TODO review the generated test code and remove the default call to fail.
        fail("testInsertInvalid failed.");
    }
    
    @Test
    public void testInsertDuplicateKey() {
        System.out.println("testInsertDuplicateKey");
        Object key = 3;
        Object value = "banana";
        Exception ex = assertThrows(DuplicateKeyException.class, ()-> {
        testDictionary.insert(key, value);
        });
        String expected = "duplicate";
        String actual = ex.getMessage();
        assertTrue(actual.contains(expected));
        // TODO review the generated test code and remove the default call to fail.
        fail("testInsertDuplicateKey failed.");
    }

    /**
     * Test of remove method, of class Dictionary.
     */
//    @Test
//    public void testRemove() {
//        System.out.println("remove");
//        Object key = null;
//        Dictionary instance = new Dictionary();
//        boolean expResult = false;
//        boolean result = instance.remove(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testRemoveValid() {
        System.out.println("testRemoveValid");
        int key = 1;
        String value = "apple";
        emptyDictionary.insert(key, value);
        boolean expResult = true;
        boolean result = emptyDictionary.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("testRemoveValid failed.");
    }
    
    @Test
    public void testRemoveInvalid() {
        System.out.println("testRemoveInvalid");
        Object key = 41;
        boolean expResult = false;
        boolean result = testDictionary.remove(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("testRemoveInvalid failed.");
    }

    /**
     * Test of update method, of class Dictionary.
     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        Object key = null;
//        Object Value = null;
//        Dictionary instance = new Dictionary();
//        boolean expResult = false;
//        boolean result = instance.update(key, Valu);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testUpdateValid() {
        System.out.println("testUpdateValid");
        int key = 1;
        String value = "apple";
        String Value2 = "pizza";
        emptyDictionary.insert(key, value);
        boolean expResult = true;
        boolean result = emptyDictionary.update(key, Value2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("testUpdateValid failed.");
    }
    
    @Test
    public void testUpdateInvalid() {
        System.out.println("testUpdateValid");
        int key = 1;
        String value = "apple";
        int key2 = 2;
        String Value2 = "pizza";
        emptyDictionary.insert(key, value);
        boolean expResult = false;
        boolean result = emptyDictionary.update(key2, Value2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("testUpdateInvalid failed.");
    }

    /**
     * Test of lookup method, of class Dictionary.
     */
//    @Test
//    public void testLookup() {
//        System.out.println("lookup");
//        Object key = null;
//        Dictionary instance = new Dictionary();
//        Object expResult = null;
//        Object result = instance.lookup(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
    @Test
    public void testLookupValidKey() {
        System.out.println("testLookupValidKey");
        Object key = 3;
        Object expResult = "cheese";
        Object result = testDictionary.lookup(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("testLookupValidKey failed.");
    }
    
    @Test
    public void testLookupInvalidKey() {
        System.out.println("testLookupInvalidKey");
        Object key = 47;
        Exception ex = assertThrows(KeyNotFoundException.class, ()->{
        testDictionary.lookup(key);
        });
        String expected = "Invalid key";
        String actual = ex.getMessage();
        assertTrue(actual.contains(expected));
        // TODO review the generated test code and remove the default call to fail.
        fail("testLookupInvalidKey failed.");
    }
    
}
