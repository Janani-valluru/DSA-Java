import java.util.ArrayList;

public class MergeSort {
	
	public static void mergesort(int arr[] ,int low ,  int high) {
		
		if(low>=high) {
			return;
		}
		int mid = (low + high)/2;
		mergesort(arr,low,mid);
		mergesort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}

	
	public static void merge(int[] arr, int low, int mid, int high) {
		
		
		ArrayList<Integer> temp =  new ArrayList<>();
		int left = low;
		int right = mid+1;
		while(left<=mid && right <=high) {
			
			if(arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		
		
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		
		while(right<=high) {
			temp.add(arr[left]);
			right++;
		}
		
		for(int i=low;i<=high;i++) {
			arr[i] = temp.get(i-low);
		}
		
	}


	public static void main(String[] args) {
		
		int[] arr = {2, 6, 9, 8, 6, 7, 0, 8, 4};
        mergesort(arr, 0, arr.length - 1); // Use arr.length - 1 instead of n-1

        // Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
	}
}
}
