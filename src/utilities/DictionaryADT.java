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
     * Attempts to adds the key value pair to the dictionary
     * @param key
     * @param value
     * @return true if add operation is successful
     * @throws DuplicateKeyException if the key already exists in the dictionary
     */
    boolean insert(K key, V value) throws DuplicateKeyException;
    
    /**
     * Removes and returns the value with the specified key
     * @param key
     * @return V the removed value
     */
    V remove(K key);
    
    /**
     * Changes the value paired with the given key to the value passed
     * @param key
     * @param value
     * @return true if the operation is successful
     */
    boolean updateValue(K key, V value);
    
    /**
     * Returns the value for the given key
     * @param key
     * @return V the value referenced by the specified key
     */
    V lookUp(K key);
}
