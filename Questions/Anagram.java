

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void checkUsingArray(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			System.out.println("Not anagram");
			return;
		}
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1,arr2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not anagram");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings to check anagram");
		System.out.println("Enter first string");
		String s1=sc.next();
		System.out.println("Enter first string");
		String s2=sc.next();
		checkUsingArray(s1,s2);
		sc.close();
	}
}
