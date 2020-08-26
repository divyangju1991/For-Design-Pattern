
public class TowerOfHanoi {

	/**
	 * 
	 * @param n
	 * @param from_rod A
	 * @param to_rod C
	 * @param aux_rod B
	 */
	public static void towerOfHanoi(int n, String from_rod, String to_rod, String aux_rod){
		
		if(n ==1) {
		  System.out.println("Disk 1 from Road "+from_rod+" to Rod "+to_rod);
		  return;
		}
		
		towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
		System.out.println("Disk "+n+" from Road "+from_rod+" to Rod "+to_rod);
		
		towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(4, "A", "C", "B");
	}

}
