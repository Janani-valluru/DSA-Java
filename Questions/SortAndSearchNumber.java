

import java.util.Scanner;

class LocateNumber{
	public void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			boolean sort=false;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					sort=true;
				}
			}
			if(!sort)
				break;
		}
	}
	
	public void binarySearch(int[] arr,int target) {
		int low=0;
		int high=arr.length-1;
		int count=0;
		while(low<=high) {
			int mid=low + (high - low) / 2;
					count++;
			if(arr[mid]==target) {
				System.out.print(mid+"  "+count);
				return;
			}
			if(arr[mid]<target) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
		}
		System.out.println("Not found");
        System.out.println(count);  
	}
}
public class SortAndSearchNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int S = sc.nextInt();
        LocateNumber lm=new LocateNumber();
        lm.bubbleSort(arr);
        lm.binarySearch(arr, S);
        sc.close();
	}

}
