import java.util.Arrays;
import java.util.Random;

public class Sorting {
	
	private static void swap (int[] arr, int i, int j) 
	{
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	static int devide(int[] arr, int begin, int end)
	{
		int pivot = end;
		int newPivot = begin;
		
		for(int i = begin; i < end; i++)
		{
			if(arr[i] < arr[pivot])
			{
				swap(arr, i, newPivot);
				newPivot++;
			}
		}
		
		swap(arr, pivot, newPivot);
		
		return newPivot;
	}
	
	static void quickSort(int[] arr, int begin, int end)
	{
		if(begin < end)
		{
			int pivot = devide(arr, begin, end);
			quickSort(arr, begin, pivot - 1);
			quickSort(arr, pivot + 1, end);
		}
	}
	
	
	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		
		Random rand =  new Random();
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = rand.nextInt(20);
		}
		
		//int[] arr = {19, 19, 8, 13, 2, 6, 11, 19, 17, 17};
		//int[] arr = { 50, 50, 23, 9, 18, 50, 32 };
		
		System.out.println(Arrays.toString(arr));

		quickSort(arr, 0, arr.length-1);
		
		System.out.println(Arrays.toString(arr));
	}
}
