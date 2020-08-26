package Problems;

import java.util.Arrays;

public class ConvertArraytoSawToothWaveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertArraytoSawToothWave convertArray = new ConvertArraytoSawToothWave();
		int a[] = {0, 6, 9, 13, 10, 1, 8, 12, 54, 14, 5};
		Arrays.sort(a);
		convertArray.converttoSawToothWave(a);
		
		System.out.println(Arrays.toString(a));
	}

}
