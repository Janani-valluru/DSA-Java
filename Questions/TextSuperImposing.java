
import java.util.Scanner;

public class TextSuperImposing {
	public static void placing() {
		Scanner sc=new Scanner(System.in);
		char[][] matrix=new char[10][10];
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matrix[i][j]='*';
			}
		}
		System.out.println("vertical string");
		String vs=sc.next();
		System.out.println("Starting row");
		int sr=sc.nextInt();
		System.out.println("Starting Column");
		int scol=sc.nextInt();
		System.out.println("Enter the horizontal string");
		String hs=sc.next();
		int commonIdx = -1;
		char commonChar ='\0';
		for(int i=0;i<vs.length();i++) {
			matrix[sr+i][scol]=vs.charAt(i);
			if(hs.indexOf(vs.charAt(i))!=-1) {
				commonIdx=i;
				commonChar=vs.charAt(i);
			}
		}
		if(commonChar!='\0') {
			int hr = sr+commonIdx;
			int hc = scol-hs.indexOf(commonChar);
			for(int j=0;j<hs.length();j++) {
				matrix[hr][hc+j]=hs.charAt(j);
			}
			
		}
		printMatrix(matrix);
		sc.close();
	}
	public static void printMatrix(char[][] matrix) {
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		placing();

	}

}
