package utilities;

import exceptions.*;

/**
* DictionaryADT.java
*
* @author Chloe Nibali
*
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
* 
*/

public interface DictionaryADT<K,V>
{
    /**
     * Inserts a new Key/Value pair into the dictionary
     * If the key already exists, DuplicateKeyException is thrown
     * If the key OR value is NULL, NullPointerException is thrown
     * 
     * @param key -the key being inserted, but me UNIQUE and NOT NULL
     * @param value - the value associated with the key, must NOT be NULL
     * @return True if operation was successful, false if not.
     * @throws DuplicateKeyException When inputted key already exists
     * @throws NullPointerException When either key OR value inputted is NULL
     */
    public boolean insert(K key, V value)throws DuplicateKeyException, NullPointerException;
    
    /**
     * Removes the Key/Value pair associated with the inputted key from the dictionary.
     * 
     * @param key the key belonging to the Key/Value pair that the user wishes to remove
     * @throws NullPointerException if the key IS NULL
     * @return true if pair is successfully removed, False if not.
     */
    public boolean remove(K key) throws NullPointerException;
    
    /**
     * Updates a Key/Value pair in the dictionary. Finds pair with key matching the inputted key
     * and replaces the associated value with the new inputted value
     * 
     * @param key The key belonging to the key/Value pair to be updated
     * @param value The new value the user wishes to assign to the Key/Value pair
     * @throws NullPointerException if the Key OR Value inputted are NULL
     * @throws KeyNotFoundException if the key does not exist in the dictionary
     * @return True if update was successfully completed, False if not.
     */
    public boolean update(K key, V value) throws NullPointerException, KeyNotFoundException;
    
    /**
     * Retrieves the Value associated with and inputted Key
     * 
     * @param key the key of the pair the user wishes to see the value for
     * @throws KeyNotFoundException if the inputted key is NULL or does not exist in dictionary
     * @retun the value associated with the inputted key
     */
    public V lookup(K key) throws KeyNotFoundException;
    
}
