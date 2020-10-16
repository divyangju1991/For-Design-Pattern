import java.util.ArrayList;

public class MinNum {

   public static void main(String args[]) {
	   
	   ArrayList<Integer> numList = new ArrayList<Integer>(); 
	   numList.add(10);
	   numList.add(7);
	   numList.add(8);
	   numList.add(1);
	   numList.add(5);
	   numList.add(2);
	   numList.add(0);
	   numList.add(12);
	   
	   System.out.println("Min : " + new MinNum().min(numList));
	   System.out.println("Max : " + new MinNum().max(numList));
	   new MinNum().minMax(numList);
	   
	   new CalculateUpperCaseLowerCaseDigits().CalculateUpperCaseLowerCaseDigits("It's time to Disco No : 12");
   }
   
   public int min(ArrayList<Integer> numlist) {
	   
	   int min = numlist.get(0);
	   
	   for(int num : numlist) {
		   
		   if(num < min) {
			   min = num;
		   }
	   }
	   
	   return min;
   }
   
   public int max(ArrayList<Integer> numlist) {
	   
	   int max = numlist.get(0);
	   
	   for(int num : numlist) {
		   
		   if(num > max) {
			   max = num;
		   }
	   }
	   
	   return max;
   }

   public void minMax(ArrayList<Integer> numlist){
	   
	   int min = numlist.get(0);
	   int max = numlist.get(0);
	   
	   for(int num : numlist) {
		   
		   if(num < min) {
			   min = num;
		   }
		   
		   if(num > max) {
			   max = num;
		   }
	   }
	   
	   System.out.println("minMax() min : "+ min);
	   
	   System.out.println("minMax() max : "+ max);
   }
}
