import java.util.*;
public class TestStopWatch {

	public static void main(String[] args) {
		//Lab9.2
		int size = 100000;
		int[] a = new int[size];
		StopWatch s1 = new StopWatch();
		s1.start();
		selectionSort(a);
		s1.stop();
		System.out.print(s1.getElapsedTime() + " milliseconds");
	}

	//Lab9.2
	public static int[] createArray(int n) {
		int[] result = new int[n];
		Random randNum = new Random();
		for (int i = 0; i < n; i++) {
			result[i] = randNum.nextInt(100);
		}
		return result;
	}
	
	public static void selectionSort(int[] a) { 
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int minIdx = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) { 
					min = a[j];
					minIdx = j;
				} 
			}
			if (minIdx != i) { 
				int temp = a[i];
				a[i] = min;
			    a[minIdx] = temp;
			}
		}
	}
}
