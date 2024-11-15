
public class Pattern5{

	static void pattern(int n) {
		for(int i=0;i<n;i++) {
			//space
			for(int j =0;j<n+i+1;j++) {
				System.out.print(" ");
			}
				for(int j =0;j<n-i;j++) {
					System.out.print(j+"");
				}
					for(int j =0;j<n+i+1;j++) {
						System.out.print(" ");
			
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		pattern(num);
	}

}
