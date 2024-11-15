
public class InsertionSort {
	
	public static void insertion(int arr[],int n) {
		
		for(int i=1;i< n;i++) { // Start from the second element
			int j=i;
			  
			// Compare and swap until the correct position is found
			
			while( j>0 && arr[j-1] > arr[j]) {
				
				int temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[] = {13, 46, 24, 52, 20, 9};
		insertion(arr,arr.length);
		
		 System.out.println("Sorted array:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	}
}
