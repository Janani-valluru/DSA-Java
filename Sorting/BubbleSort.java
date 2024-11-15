import java.util.Arrays;

public class BubbleSort {
	
	public static void Bubble(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				
				if(arr[j]>arr[j+1]) {   // compare the adjacent value;
					
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]= temp;
					
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		int arr [] = {2,7,5,4,8,9};
		Bubble(arr);
		System.out.println(Arrays.toString(arr));
	}
	
}
