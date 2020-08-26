package problems;

public class BinarySearchLastOccurenceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,2,1,4};
		
		System.out.println(new BinarySearchLastOccurence().binarySearchLastOccurence(a, 0, a.length-1, 2));
		
		System.out.println(new BinarySearchLastOccurence().binarySearchLastOccurence(a, 0, a.length-1, 1));
		
		System.out.println(new BinarySearchLastOccurence().binarySearchLastOccurence(a, 0, a.length-1, 4));
	}

}
