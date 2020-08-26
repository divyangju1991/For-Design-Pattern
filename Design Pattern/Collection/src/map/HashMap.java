package map;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap<K,V> implements Map<K, V> {

	//entry bucket create
	private Entry<K,V>[] table;
	private int capacity = 4;
	
	//create Entry class to maintain key and value
	static class Entry<K,V> {
		
		K key;
		V value;
		Entry<K,V> next;
		
		public Entry(K key, V value, Entry<K,V> next){
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public HashMap(){
		table = new Entry[capacity];
	}
	
	public HashMap(int cap){
		table = new Entry[cap];
		capacity = cap;
	}
	
	private int hash(K key){
		return Math.abs(key.hashCode()) % capacity;
	}
	
	public V put(K newKey, V data){
		if(newKey == null)
			return null;
		
		int hash = hash(newKey);
		
		Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);
		
		if(table[hash] == null){
			table[hash] = newEntry;
		} else {
			Entry<K,V> prev = null;
			Entry<K,V> curr = table[hash];
			
			while(curr != null){
				
				if(curr.key.equals(newKey)){
					
					if(prev == null){
						newEntry.next = curr.next;
						V oldData = (table[hash]).value;
						table[hash] = newEntry;
						return oldData;
					} else {
						newEntry.next = curr.next;
						V oldData = prev.next.value;
						prev.next = newEntry;
						return oldData;
					}
				}
				
				prev = curr;
				curr = curr.next;
			}
			prev.next = newEntry;
		}
		return null;
	}
	
	@Override
	public V get(Object key){
		K k = (K) key;
		int hash = hash(k);
		
		if(table[hash] == null){
			return null;
		} else {
			
			Entry<K,V> tmp = table[hash];
			
			while(tmp != null){
				if(tmp.key.equals(k))
					return tmp.value;
				tmp = tmp.next;	
			}
			return null;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsKey(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsValue(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set keySet() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void putAll(Map arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public V remove(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString(){
	       
		  StringBuilder sb = new StringBuilder("{");
		
	       for(int i=0;i<capacity;i++){
	           if(table[i]!=null){
	                  Entry<K, V> entry=table[i];
	                  while(entry!=null){
	                	  	sb.append(entry.key+" : "+entry.value+", ");
	                        entry=entry.next;
	                  }
	           }
	       }             
	    
	       sb.append("}");
	       
	       return sb.toString();
	    }
}
