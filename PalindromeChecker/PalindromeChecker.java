import java.util.Scanner;
import java.util.*;

public class PalindromeChecker{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to be tested for Palindrome");
		String str = sc.next();
		int start = 0;
		int end = str.length()-1;
		boolean isPalindrome = true;
		while(start<end){
			if(str.charAt(start) != str.charAt(end)){
				isPalindrome = false;
				break;
			}
		start++;
		end--;
		}
		if(isPalindrome){
			System.out.println("Given String is a Palindrome");
		}
		else{
			System.out.println("Given String is not a Palindrome");
		}
	}
}