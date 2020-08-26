package problems;

import java.util.ArrayList;

import problems.CheckDuplicates;

public class FailedCheckDuplicatesImprove4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[] = {3,8,7,3,2};
//		int b[] = {3,8,7,1,2};
//		int c[] = {3,8,7,6,2,8};
//		int d[] = {3,8,7,3,1,2,1};

//		System.out.println(new CheckDuplicatesImprove3().isDuplicateFound(a));
//		System.out.println(new CheckDuplicatesImprove3().isDuplicateFound(b));
//		System.out.println(new CheckDuplicatesImprove3().isDuplicateFound(c));
//		System.out.println(new CheckDuplicatesImprove3().isDuplicateFound(d));
		
		//int[] array = new int[]{1, 2, 2, 3, 1};
        //Failed
		//int[] array = new int[]{3,8,7,3,2};
		int array[] = {1,2,4,3,4};
        
        ArrayList<Integer> dups = findAllDups(array);
        for(int v: dups) {
            System.out.printf("%d, ", v);
        }
        System.out.println();
	}

	public static void displayArray(int[] array) {
        System.out.print("[debug] ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.println();
    }
    
    public static ArrayList<Integer> findAllDups(int[] array) {
        ArrayList<Integer> dups = new ArrayList<Integer>();
        int value;
        int ele;
        for (int i = 0; i < array.length; i++) {
            ele = array[i];
            value = array[Math.abs(ele)];
            if (value < 0) {
                dups.add(Math.abs(ele));
            }
            array[Math.abs(ele)] *=  array[Math.abs(ele)] > 0 ? -1 : 1;
            
            displayArray(array);
        }
        return dups;
    }
}
