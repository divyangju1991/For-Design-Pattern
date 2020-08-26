package arrayUtility;

import java.util.Arrays;

public class ConcatenateTwoArraysMain{
    public static void main(String[] args) {
           int firstArray[] = { 1, 2, 3 };
           int secondArray[] = { 4, 5, 6 };
 
           System.out.println("Display concatenated array");
           for (int i : ConcatenateTwoArrays.concatenateTwoArrays(firstArray, secondArray)) {
                  System.out.print(i + " ");
           }
    }
}
 
/**
 * ConcatenateTwoArrays class contains  concatenateTwoArrays method which concatenates 2 arrays.
 */
class ConcatenateTwoArrays {
    
    /**
     * method  concatenates two arrays.
     */
    public static int[] concatenateTwoArrays(int[] firstArray, int[] secondArray) {
           
           int concatenatedArrayLength = firstArray.length + secondArray.length;
                        
           int[] concatenatedArray = Arrays.copyOf(firstArray, concatenatedArrayLength);
           
           System.arraycopy(secondArray, 0, concatenatedArray, firstArray.length,
                        secondArray.length);
           
           return concatenatedArray;
    }
}