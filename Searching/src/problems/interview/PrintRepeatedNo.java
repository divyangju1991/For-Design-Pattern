package Problems.interview;

public class PrintRepeatedNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {99, 6, 99, 99, 1, 7, 6, 7};
		PrintRepeatedNo obj = new PrintRepeatedNo();
		obj.printRepeatedNo(arr, 100);
	}

	public void printRepeatedNo(int[] arr, int n){
		int count[] = new int[n];
		
		for(int i=0; i<arr.length; i++){
			
			if(count[arr[i]] == 1){
				System.out.println("Repeated No : "+ arr[i]);
				count[arr[i]]++;
			} else {
				count[arr[i]]++;
			}
		}
	}
}
