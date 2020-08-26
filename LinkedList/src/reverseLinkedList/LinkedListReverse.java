package reverseLinkedList;

//Java program to get intersection point of two linked list 
import java.util.*; 
class Node { 
 int data; 
 Node next; 
 Node(int d) 
 { 
     data = d; 
     next = null; 
 } 
} 
class LinkedListReverse { 
 public static void main(String[] args) 
 { 
     // list 1 
     Node n1 = new Node(1); 
     n1.next = new Node(2); 
     n1.next.next = new Node(3); 
     n1.next.next.next = new Node(4); 
     n1.next.next.next.next = new Node(5); 
     n1.next.next.next.next.next = new Node(6); 
     n1.next.next.next.next.next.next = new Node(7); 
     // list 2 
     Node n2 = new Node(10); 
     n2.next = new Node(9); 
     n2.next.next = new Node(8); 
     n2.next.next.next = n1.next.next.next; 
     Print(n1); 
     Print(n2); 
     n1 = reverseLinkedList(n1);
     n2 = reverseLinkedList(n2);
     Print(n1); 
     Print(n2); 
     
 } 

 // function to print the list 
 public static void Print(Node n) 
 { 
     Node cur = n; 
     while (cur != null) { 
         System.out.print(cur.data + "  "); 
         cur = cur.next; 
     } 
     System.out.println(); 
 } 

 // function to reverse LinkedList
 public static Node reverseLinkedList(Node n){
	 
	 Node curr = n;
	 Node prev = null;
	 Node next = null; 
	 while(curr != null){
		 next = curr.next;
		 curr.next = prev;
		 prev= curr;
		 curr = next;
	 }
	  n = prev; 
      return n; 
	 
 }
 
} 