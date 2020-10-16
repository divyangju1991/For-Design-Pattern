package searching;

//If sorted array given then go for this approach for search
public class BinarySearchEx {
	
	public int binarySearch(int[] a, int l, int r, int x){
		
		if(r >= l){
			
			int mid = l + (r-1) / 2;
			
			if(x == a[mid]){
				return mid;
			} else if(x > a[mid]){
				return binarySearch(a, mid+1, r, x);
			} else {
				return binarySearch(a, l, mid-1, x);
			}
			
		} else {
			return -1;
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchEx obj = new BinarySearchEx();
		int[] a = {1,5,8,9,0,3};
		int n = a.length-1;

		System.out.println(obj.binarySearch(a, 0, n, 8));
		System.out.println(obj.binarySearch(a, 0, n, 15));
		System.out.println(obj.binarySearch(a, 0, n, 3));
		System.out.println(obj.binarySearch(a, 0, n, 1));
	}

}
