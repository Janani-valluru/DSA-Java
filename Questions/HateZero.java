import java.util.Scanner;

public class HateZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.println("Enter the number of rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Arrays to mark non-zero rows and columns
        boolean[] nonZeroRows = new boolean[m];
        boolean[] nonZeroCols = new boolean[n];

        // Identify rows and columns with at least one non-zero element
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    nonZeroRows[i] = true;
                    nonZeroCols[j] = true;
                }
            }
        }

        // Print the filtered matrix
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < m; i++) {
            if (nonZeroRows[i]) { // Only process non-zero rows
                for (int j = 0; j < n; j++) {
                    if (nonZeroCols[j]) { // Only process non-zero columns
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println(); // Move to the next row
            }
        }

        sc.close(); // Close the scanner
    }
}
