package utilities;

import exceptions.DuplicateKeyException;

/**
* DictionaryADT.java
*
* @author Ian Stoesz
* @version 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab.
* Type K the key used to identify the corresponding value
* Type V the value
* 
*/

public interface DictionaryADT<K,V>
{
    /**
     * Checks the set of keys to determine of the dictionary contains the given key
     * @param key
     * @return true if dictionary contains the specified key
     */
    boolean hasKey(K key);
    
    /**
     * Checks the set of values to determine of the dictionary contains the given value
     * @param value
     * @return true if the dictionary contains the specified value
     */
    boolean hasValue(V value);
    
    /**
     * Returns the value for the given key
     * @param key
     * @return V the value referenced by the specified key
     */
    V get(K key);
    
    /**
     * Checks the length of the list. If length == 0 returns true.
     * @return true if the list is empty
     */
    boolean isEmpty();
    
    /**
     * Attempts to adds the key value pair to the dictionary
     * @param key
     * @param value
     * @return true if add operation is successful
     * @throws DuplicateKeyException if the key already exists in the dictionary
     */
    boolean add(K key, V value) throws DuplicateKeyException;
    
    /**
     * Removes and returns the value with the specified key
     * @param key
     * @return V the removed value
     */
    V remove(K key);
    
    /**
     * Returns the number of entries in the dictionary
     * @return int the length of the dictionary
     */
    int size();
    
    /**
     * Changes K key to the new provided key given K newKey
     * @param key
     * @param newKey
     * @return true if the operation is successful
     */
    boolean updateKey(K key, K  newKey);
}
