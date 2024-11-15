public class SelectionSort {

    public static void Selection(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) { // Outer loop for each pass
            int mini = i; // Assume the first unsorted element is the smallest
           
            for (int j = i + 1; j < n; j++) { // Inner loop to find the smallest
               
            	if (arr[j] < arr[mini]) { // Compare each element with the current minimum
                    
            		mini = j; // Update the index of the smallest element
                }
            }
            // Swap the smallest element with the first unsorted element
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        // Print the sorted array
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        Selection(arr, arr.length); 
    }
}
