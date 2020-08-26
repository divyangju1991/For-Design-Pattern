package UnrolledlinkedList;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public class UnrolledLinkedList<E> extends AbstractList<E> implements List<E>, Serializable {

	//The maximum number of elements that can be stored in a single node
	private int nodeCapacity;

	//The current size of elements
	private int size = 0;
	
	private int modCount = 0;
	
	//The first node of the list
	private ListNode firstNode;
	
	//The last node of the list
	private ListNode lastNode;
	
	public UnrolledLinkedList(int nodeCapacity) throws IllegalArgumentException {
		if(nodeCapacity <8){
			throw new IllegalArgumentException("nodeCapacity < 8");
		}
		
		this.nodeCapacity = nodeCapacity;
		firstNode = new ListNode();
		lastNode = firstNode;
	}
	
	public ListNode getFirstNode() {
		return firstNode;
	}

	public UnrolledLinkedList() throws IllegalArgumentException {
		this(16);
	}
	
	public boolean isEmpty() {
		return (size <= 0);
	}
	
	public boolean contains(Object o){
		return (indexOf(o) != -1);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	public Iterator<E> iterator(){
		return new ULLListIterator(firstNode , -1, -1);
	}
	
	//Appends specific elements to the end of list
	public boolean add(E e){
		insertIntoNode(lastNode, lastNode.numElements, e);
		return true;
	}
	
	public void insertIntoNode(ListNode node, int ptr, E element) {
		
		//If node size is full
		if(node.numElements == nodeCapacity) {
			
			//create new node
			ListNode newNode = new ListNode();
			
			//move half of elements into new node
			int elementsToMove = nodeCapacity / 2 ;
			int startIndex = nodeCapacity - elementsToMove;
			
			for(int i=0; i<elementsToMove; i++){
				newNode.elements[i] = node.elements[startIndex+i]; 
				node.elements[startIndex+i] = null;
			}
			node.numElements -= elementsToMove;
			newNode.numElements = elementsToMove;
			
			//newnode insert into node
			newNode.next = node.next;
			newNode.previous = node;
			
			if(node.next != null){
				node.next.previous = newNode;
			}
			
			node.next = newNode;
			
			if(node == lastNode) {
				lastNode = newNode;
			}
			
			//check whether the element should be inserted into
			//the original node or into new node
			if(ptr > node.numElements){
				node = newNode;
				ptr -= node.numElements;
			}
		}
		
		for(int i=node.numElements; i> ptr; i--){
			node.elements[i] = node.elements[i-1];
		}
		
		node.elements[ptr] = element;
		node.numElements++;
		modCount++;
		size++;
	}
	
	public boolean remove(Object o){
		
		ListNode node = firstNode;
		
		if(o == null) {
			
			while(node!= null){
				
				for(int i = 0; i < node.numElements; i++) {
					if(node.elements[i] == null){
						removeFromNode(node, i);
						return true;
					}
				}
				node = node.next;
			}
			
		} else {
			
			while(node != null) {
				
				for(int i = 0; i < node.numElements; i++) {
					if(o.equals(node.elements[i])){
						removeFromNode(node, i);
						return true;
					}
				}
				node = node.next;
			}
		}
		
		return false;
	}
	
	private void removeFromNode(ListNode node, int ptr){
		
		node.numElements--;
		
		for(int i=ptr; i < node.numElements; i++){
			node.elements[i] = node.elements[i+1];
		}
		
		node.elements[node.numElements] = null;
		
		if(node.next != null && (node.next.numElements + node.numElements <= nodeCapacity)){
			mergeWithNextNode(node);
		} else if(node.previous != null && (node.previous.numElements + node.numElements <= nodeCapacity)) {
			mergeWithNextNode(node.previous);
		}
		
		size--;
		modCount++;
	}
	
	private void mergeWithNextNode(ListNode node){
		
		ListNode next = node.next;
		
		for(int i=0; i<next.numElements; i++){
			node.elements[node.numElements + i] = next.elements[i];
			next.elements[i] = null;
		}
		
		node.numElements += next.numElements;
		
		if(next.next != null){
			next.next.previous = node;
		}
		
		node.next = next.next.next;
		
		if(next == lastNode){
			lastNode = node;
		}
	}
	
	public void clear(){
		
		ListNode node = firstNode;
		
		while((node = node.next) != null){
			node.next = null;
			node.previous = null;
			node.elements = null;
		}
		
		lastNode = firstNode;
			
		for(int ptr = 0; ptr < firstNode.numElements ; ptr++) {
			firstNode.elements[ptr] = null;
		}
		
		firstNode.numElements = 0;
		size = 0;
	}
	
	public E get(int index) throws IndexOutOfBoundsException {
		
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		ListNode node;
		int ptr = 0;
		
		if((size - index) > index) {
			
			node = firstNode;
			while(ptr <= index - node.numElements) {
				ptr += node.numElements;
				node = node.next;
			}
			
		} else {
			
			node = lastNode;
			ptr = size;
			
			while((ptr -= node.numElements) > index) {
			    node = node.previous;	
			}
		}
		
		return (E) node.elements[index - ptr];
	}
	
	
	
	public class ListNode {
		
		ListNode next;
		ListNode previous;
		int numElements = 0;
		
		Object[] elements;
		
		ListNode(){
			elements = new Object[nodeCapacity];
		}

		public ListNode getNext() {
			return next;
		}
		
	}
	
	private class ULLListIterator implements ListIterator<E> {
		
		ListNode currentNode;
		int ptr;
		int index;
		int expectedModCount = modCount;
		
		ULLListIterator(ListNode node, int ptr, int index) {
			this.currentNode = node;
			this.ptr = ptr;
			this.index = index;
		}
		
		public boolean hasNext() {
			return (index < (size-1));
		}
		
		public E next() {
			
			ptr++;
			if(ptr >= currentNode.numElements) {
			
				if(currentNode.next != null) {
					currentNode = currentNode.next;
					ptr = 0;
				} else {
					throw new NoSuchElementException();
				}
				
			}
			
			index++;
			checkForModification();
			return (E) currentNode.elements[ptr];
		}
		
		private void checkForModification() {
			if(modCount != expectedModCount) {
				throw new ConcurrentModificationException();
			}
			
		}
		
		public E previous() {
			ptr--;
			if(ptr < 0) {
				
				if(currentNode.previous != null) {
					currentNode= currentNode.previous;
					ptr = currentNode.numElements -1;
				} else {
					throw new NoSuchElementException();
				}
			}
			index--;
			checkForModification();
			return (E) currentNode.elements[ptr];
		}
		
		public int nextIndex(){
			return (index + 1);
		}
		
		public int previousIndex(){
			return (index -1);
		}
		
		public void remove() {
			checkForModification();
			
		}
		
		public void set(E e) {
			checkForModification();
			currentNode.elements[ptr] = e;
		}
		
		public void add(E e){
			checkForModification();
			
		}

		@Override
		public boolean hasPrevious() {
			return (index > 0);
		}
		
	}


}
