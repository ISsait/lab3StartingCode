package implementations;

import java.util.ArrayList;
import java.lang.NullPointerException;
import exceptions.*;
import utilities.DictionaryADT;
/**
 * 
 * @author Ian
 * @param <K>
 * @param <V>
 * precondition: a list of keys and a list of values of equal length.
 * postcondition: a mapped dictionary of key value pairs
 */
public class Dictionary<K,V> implements DictionaryADT<K,V>
{
    // constant
    private static final int DEFAULT_SIZE = 10;
    // index indicates pairing, e.g. keys[1] is stored at values[1]
    private ArrayList<K> keys;
    private ArrayList<V> values;
    private int size = 0;

    /**
     * Constructor for Dictionary object
     * @throws InvalidArgumentException 
     */
    public Dictionary() throws InvalidArgumentException {
        this.keys = new ArrayList<>();
        this.values = new ArrayList<>();
        size = this.keys.size();       
    }

        
    /**
     * Inserts a new key value pair at the end of the dictionary
     * @param key
     * @param value
     * @return
     * @throws DuplicateKeyException
     * @throws NullPointerException 
     */
    @Override
    public boolean insert(K key, V value) throws DuplicateKeyException, NullPointerException{
        if (key == null || value == null){
                throw new NullPointerException("null");
        }           
        for (int i = 0; i < size; i++){
            if (this.keys.get(i).equals(key)){
                throw new DuplicateKeyException("duplicate");
            }
        }
        this.keys.add(key);
        this.values.add(value);
        this.size++;
        return true;
    }       
    
    /**
     * Removes the key value pair from the dictionary.
     * @param key
     * @return
     * @throws NullPointerException 
     */
    @Override
    public boolean remove(K key)throws NullPointerException {
        if (key == null){
            throw new NullPointerException("null");
        }
        
        for (int i = 0; i < size; i++){
            if (this.keys.get(i) == key){
                // V removed = this.values.get(i);
                for (int j = i; j < size - 1; j++){
                    this.keys.set(j, this.keys.get(j+1));
                    this.values.set(j, this.values.get(j+1));
                }
                size--;
                // System.out.println(removed);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean update(K key, V newValue) throws NullPointerException, KeyNotFoundException{
        if (newValue == null){ // Check if new value is null
            // if so - throw exception.
            throw new NullPointerException("null");
        }
        // Iterate through keyArray for the key
        for (int i = 0; i < this.keys.size(); i++){
            if (this.keys.get(i).equals(key)){
                // Update valueArray to the new value 
                this.values.set(i, newValue);
                return true; // Inform caller of success
            }
        }
        // Otherwise if key is not found, throw exception
        throw new KeyNotFoundException("Invalid key");
        
    }
    @Override
    public V lookup(K key) throws KeyNotFoundException{
        //Iterate through KeyArray for the key
        for (int i = 0; i < this.keys.size(); i++){
            if (this.keys.get(i).equals(key)){
                // return matching value to caller
                return this.values.get(i);
            }
        }
        // If key is not found - throw exception
        throw new KeyNotFoundException("Invalid key");
    }
}
