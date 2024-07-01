package implementations;

import java.util.ArrayList;

import exceptions.DuplicateKeyException;
import utilities.DictionaryADT;

public class Dictionary<K,V> implements DictionaryADT<K,V>
{
	// constant
	private static final int DEFAULT_SIZE = 10;
	
	// index indicates pairing, e.g. keys[1] is stored at values[1]
	private ArrayList<K> keys;
	private ArrayList<V> values;

        public Dictionary() {
            this.keys = new ArrayList<>();
            this.values = new ArrayList<>();
    }

        
        // blank methods to implement ADT and get rid of errors
        @Override
        public boolean insert(K key, V value){
<<<<<<< HEAD
            // check values are valid - possible exception
            this.keys.add(key);
            this.values.add(value);
=======

>>>>>>> main
            return false;
        }
        @Override
        public boolean remove(K key){
            return false;
        }
        @Override
        public boolean update(K key, V Valu){
            return false;
        }
        @Override
        public V lookup(K key) {
            return null;
        }
}
