

public class MagicSquare {
	static int size = 3;
	static void isSquareMatrix(int mat[][]) {
		int sumd1 = 0, sumd2 = 0;
		for(int i =0;i<size;i++) {
			sumd1 +=mat[i][i];
			sumd2 += mat[i][size-1-i];					
		}
		if(sumd1 != sumd2) {
			System.out.println("not a magic square");
			return;
		}
		for(int i=0;i<size;i++) {
			int rowSum=0,colSum=0;
			for(int j=0;j<size;j++) {
				rowSum += mat[i][j];
				colSum += mat[j][i];
			}
			if(rowSum != colSum || colSum != sumd1) {
				System.out.println("Not a magic square");
			return;
			}
		}
		System.out.println("The matrix is a magic square");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = {{ 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }};
		isSquareMatrix(mat);

	}

}
