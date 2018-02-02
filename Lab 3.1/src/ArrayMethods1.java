import java.lang.reflect.Array;
import java.util.Arrays;
public class ArrayMethods1 {

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
	
	// The 2.0 would never be properly placed in the right spot and I can't find the issue...

	public static void selectionSort(double[] list1) {
	int x = list1.length;
	for(int i=0; i<x-1; i++) {
		int min = i;
		for(int y=i+1; y<x; y++) {
			if(list1[y] < list1[min]) {
				min = y;
				swap(list1,y,i);
				}

		}
		
	}
		
	}
	
	// I'm still having a bit of issues with for loops and understanding their conditions
	// usually get out of bound errors, and had to ask my friend to check my loops and response to see what was wrong.
	// Even though he explained, the concepts of a for loop is still kind of cloudy for me.
	
	public static void bubbleSort(String[] list1) {
		int x = list1.length;
		for(int i=0; i < x; i++){
            for(int y=1; y < (x-i); y++){
            	if(list1[y-1].compareTo(list1[y]) > 0) {
                    swap(list1,y-1,y);
                    }
            }
		}
		
	}

	public static void main(String [] args) {
		int[] test1 = {1,4,4,5,2,4,3,17,0};
		double[] test2 = {1.1,4.1,4.2,2.0,5.0,4.0,3.0,17.0,0.0};
		String[] test3 = {"zebra", "tortilla", "abba", "foo", "bar", "aba"};
		
		long start = System.nanoTime();
		insertionSort(test1);
		long end = System.nanoTime();
		long time = end - start;
		System.out.println("Test1 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test1));
		
		start = System.nanoTime();
		selectionSort(test2);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test2 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test2));
		
		start = System.nanoTime();
		bubbleSort(test3);
		end = System.nanoTime();
		time = end - start;
		System.out.println("Test3 took: " + time + " nanoseconds");
		System.out.println(Arrays.toString(test3));
		
		
		
	}
}
