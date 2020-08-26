class LinkedList2 { 
	
	Node head;
	
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
		}
	}
	
	public static LinkedList2 insert(LinkedList2 list, int data) {
		
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.head == null) {
			list.head = newNode;
		} else {
			
			Node last = list.head;
			
			while (last.next != null) {
				last = last.next;
			}
			
			last.next = newNode;
		}
		
		return list;
		
	}
	
	public static void printList(LinkedList2 list) {
		Node currNode = null;
		
		currNode = list.head;
		
		System.out.println("Linked List : ");
		
		while(currNode != null) {
			System.out.print(currNode.data+ " ");
			
			currNode = currNode.next;
		}
		
	}
	
    public static LinkedList2 deleteByKey(LinkedList2 list, int key) {
     	
    	Node currNode = list.head;
    	Node prevNode = null;
    	
    	if(currNode != null && currNode.data == key){
    		
    		list.head = currNode.next;
    		System.out.println("key : "+key+" founded and deleted");
    		
    		return list;
    	}
    	
    	while (currNode != null && currNode.data != key) {
    		
    		prevNode = currNode;
    		currNode = currNode.next;
    	}
    	
    	if(currNode == null) {
    		System.out.println("key : "+key+" is not founded");
    	} else {
    		
    		prevNode.next = currNode.next;
    		System.out.println("key : "+key+" founded and deleted");
    	}
    	    	
    	
    	return list;
    }
    
    public static LinkedList2 deleteAtPosition(LinkedList2 list, int index){
    	
    	Node currNode = list.head;
    	Node prevNode = null;
    	
    	if(index == 0 && currNode != null) {
    		list.head = currNode.next;
    		
    		System.out.println(" index "+ index +" founded and deleted");
    		
    		return list;
    	}
    	
    	int counter = 0;
    	
    	while(currNode != null){
    	    
    		if(index == counter) {
    		
    			prevNode.next = currNode.next;
    			System.out.println(" index "+ index +" founded and deleted");
    			
    			break;
    		} else {
    			prevNode = currNode;
    			currNode = currNode.next;
    			counter++;
    		}
    	}
    	
    	if(currNode == null) {
    		System.out.println(" index "+ index +" not founded");
    	}
    	
    	return list;
    }
    
	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList2 list = new LinkedList2(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
		list = insert(list, 6); 
		list = insert(list, 7); 
		list = insert(list, 8); 

		// Print the LinkedList 
		printList(list); 
		
//		System.out.println("******DELETION BY KEY******");
//		 // 
//        // ******DELETION BY KEY****** 
//        // 
//  
//        // Delete node with value 1 
//        // In this case the key is ***at head*** 
//        deleteByKey(list, 1); 
//  
//        // Print the LinkedList 
//        printList(list); 
//  
//        // Delete node with value 4 
//        // In this case the key is present ***in the middle*** 
//        deleteByKey(list, 4); 
//  
//        // Print the LinkedList 
//        printList(list); 
//  
//        // Delete node with value 10 
//        // In this case the key is ***not present*** 
//        deleteByKey(list, 10); 
//  
//        // Print the LinkedList 
//        printList(list); 
        
		System.out.println("******DELETION AT POSITION******");
     // 
        // ******DELETION AT POSITION****** 
        // 
  
        // Delete node at position 0 
        // In this case the key is ***at head*** 
        deleteAtPosition(list, 0); 
  
        // Print the LinkedList 
        printList(list); 
  
        // Delete node at position 2 
        // In this case the key is present ***in the middle*** 
        deleteAtPosition(list, 2); 
  
        // Print the LinkedList 
        printList(list); 
  
        // Delete node at position 10 
        // In this case the key is ***not present*** 
        deleteAtPosition(list, 10); 
  
        // Print the LinkedList 
        printList(list); 
	} 
	
}
