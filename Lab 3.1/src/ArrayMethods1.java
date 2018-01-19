import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayMethods1 {
	
	public static int[] oo = {1,9,2,10,3,14,20,11};
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	public static void insertionSort(int[] list1) {
	int x = list1.length;
	for(int i=1; i<x; i++) {
		int test = list1[i];
		int pos = (i - 1);
		while((pos >= 0) && (list1[pos] > test))
		{
			swap(list1, pos+1, pos);
			pos = pos -1;
					
		}
	}
	}
	
	public static void selectionSort(double[] list1) {
		
	}
	
	public static void bubbleSort(String[] list1) {
		
	}

	public static void main(String [] args) {
		insertionSort(oo);
		
		System.out.println(Arrays.toString(oo));
		
	}
}
