
public class FindPositionFromWhichSortedArrayRotatedExample {
    
    public static void main(String[] args) {
           int ar[] = { 4, 1, 2, 3 };
           for (int n : ar)
                  System.out.print(n + " ");
           System.out.print(" : ");
           
           for (int i = 0; i < ar.length; i++) {
                  if (i + 1 == ar.length) {
                        System.out.println("Array has not been rotated");
                  } else {
                        if (ar[i] > ar[i + 1]) {
                               System.out.println("Array has been rotated from " + (i+1)
                                             + " position");
                               break;
                        }
                  }
           } //end for loop
 
    }
}
 