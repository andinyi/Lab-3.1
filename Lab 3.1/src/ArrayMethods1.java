import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayMethods1 {
	
	public static int[] oo = {1,9,2,10,3,14,20,11};
	public static double[] ii = {1.3,1.5,7.6,2.3,11.6,34.1,1.1,18.2};
	public static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void swap(double[] arr, int index1, int index2) {
		double temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	public static void swap(String[] arr, int index1, int index2) {
		String temp = arr[index1];
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
	int x = list1.length;
	for(int i=0; i<x; i++) {
		int min = i;
		double test = list1[i];
		for(int y=i+1; y<x; y++) {
			if(test > list1[y]) {
				min = y;
				swap(list1,i,y);
				}
		}
		
	}
		
	}
	
	public static void bubbleSort(String[] list1) {
		
	}

	public static void main(String [] args) {
		insertionSort(oo);
		selectionSort(ii);
		System.out.println(Arrays.toString(ii));
		System.out.println(Arrays.toString(oo));             
		
		
	}
}
