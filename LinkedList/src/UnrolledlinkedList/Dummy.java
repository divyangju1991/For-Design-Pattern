package UnrolledlinkedList;

import java.util.Iterator;
import java.util.ListIterator;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnrolledLinkedList<Integer> list = new UnrolledLinkedList<Integer>(10);
//		list.clear();
		list.add(5);
		list.add(8);
		list.add(3);
		list.add(2);
		list.add(10);
		list.add(15);
		list.add(18);
		list.add(13);
		list.add(12);
		list.add(29);
		list.add(16);
		list.add(19);
		list.add(87);
		list.add(64);
		list.add(97);
		list.add(33);
		list.add(55);
		list.add(26);
		list.add(59);
		list.add(82);
		list.add(38);
		list.add(25);
		list.add(50);
		list.add(46);
		list.add(69);
		list.add(77);
		list.add(87);
		list.add(88);
		list.add(99);
		list.add(24);
		list.add(23);
		
		list.add(69);
		list.add(28);
		list.add(84);
		list.add(27);
		list.add(53);
		list.add(41);
		list.add(61);
		list.add(71);
		list.add(81);
		list.add(82);
		list.add(91);
		list.add(21);
		list.add(31);
		
		System.out.println(list.toString());
		
		try {
			System.out.println(list.contains(72) + " = found 72"); 
			System.out.println(list.contains(25) + " = found 25");
		} catch(Exception e) {
			System.out.println(list.contains(25) + " = found 25");
		}
		
		//list.clear();
		
		System.out.println("0 = "+list.get(0));
		System.out.println("1 = "+list.get(1));
		System.out.println("17 = " + list.get(17));
		System.out.println("35 = " +list.get(35));
		System.out.println(list.size());
		System.out.println("41 = " +list.get(41));
		System.out.println("43 = " +list.get(43));
		
		try {
			System.out.println("44 = " +list.get(44));
		} catch(Exception e){
			e.printStackTrace();
		}
		
		try {
			System.out.println("45 = " +list.get(45));
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
