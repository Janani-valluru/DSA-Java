

import java.util.HashSet;

class ToFindHappyNumber{
	public void number(int si,int ei) {
		
		for(int i=si;i<=ei;i++) {
			HashSet<Integer>hs=new HashSet<>();
			int sum=i;
			int count=1;
			
			 
			while(sum!=1 && count<10) {
				count++;
				sum=sumOfSquare(sum);
				if(hs.contains(sum)) {
					break;
				}
				else {
					hs.add(sum);
				}
			}
			if(sum==1) {
				System.out.println(i + " " + count);
			}
		}
			
	}
	public int sumOfSquare(int num) {
		int sum=0;
		while(num>0) {
			int digit = num % 10;
            sum += digit * digit;
            num /= 10;
		}
		return sum;
	}
}

public class HappyNumber {
	public static void main(String[] args) {
		ToFindHappyNumber hn=new ToFindHappyNumber();
		hn.number(44, 49);
	}

}
////////////
