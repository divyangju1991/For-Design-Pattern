import java.util.HashMap;

/**
 * 
 */

/**
 * @author Divyang
 * Immuatable Class = It means any change in object, It will produce new object 
 * 1) Final Class - So It can not be inherited
 */
public final class ImmutableClassPro {
	
	/**
	 * data member variable should be private and final
	 * 2) private member variable : so It can not be accessed from outside of the class
	 * 3) final member variable : so It can be only assigned once
	 *   
	 */
	private final String name;
	private final Integer id;
	private final HashMap<String, Integer> map;
	
    /**
     * 4) assigned references of all Immutable objects
     *    For mutable object, assign with new keyword 
     * @param name
     * @param id
     * @param map
     */
	public ImmutableClassPro(String name, Integer id, HashMap<String, Integer> map) {
		this.name = name;
		this.id = id;
		this.map = new HashMap<String,Integer>(map);

	}

    /**
     * String is Immutable object, any changes made to String object, it will produce new String object
     * @return
     */
	public String getName() {
		return name;
	}

    /**
     * Integer is Immutable object, any changes made to String object, it will produce new Integer object
     * @return
     */
	public Integer getId() {
		return id;
	}

    /**
     * HashMap is mutable object, any changes made to HashMap object, it will not produce new HashMap object
     * so It return with clone or copy of HashMap object
     * @return
     */
	public HashMap<String, Integer> getMap() {
		return (HashMap<String, Integer>) map.clone();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int localId = 5;
		String localString = "Divyang";
		HashMap<String, Integer> localMap = new HashMap<String, Integer>();
		localMap.put(localString, localId);
		
		ImmutableClassPro imutableObj = new ImmutableClassPro(localString, localId, localMap);
		
        System.out.println("localId == imutableObj.getId() : " + (localId == imutableObj.getId()) );//true
        System.out.println("localString == imutableObj.getName() : " + (localString == imutableObj.getName()) );//true
        System.out.println("localMap == imutableObj.getMap() : " + (localMap == imutableObj.getMap()) );//false
        
        System.out.println("Befor change to object, imutableObj is "+ imutableObj);
        System.out.println("Befor localMap : " +localMap);
        
        localId = 7;
		localString = "Divyang2";
		localMap.put(localString, localId);
		localMap.put("Divyang", localId);
		
		System.out.println("localId == imutableObj.getId() : " + (localId == imutableObj.getId()) );//true
	    System.out.println("localString == imutableObj.getName() : " + (localString == imutableObj.getName()) );//true
	    System.out.println("localMap == imutableObj.getMap() : " + (localMap == imutableObj.getMap()) );//false
	        
	    System.out.println("After change to object,  imutableObj is "+ imutableObj);   
	    
	    System.out.println("After localMap : " +localMap);
	}

	@Override
	public String toString() {
		return "ImmutableClassPro [name=" + name + ", id=" + id + ", getMap()=" + getMap() + ", map=" + map + "]";
	}

}
