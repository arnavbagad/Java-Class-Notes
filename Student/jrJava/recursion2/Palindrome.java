package jrJava.recursion2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static boolean isPalindrome(String text, int begin, int end){
		if(begin>=end) return true;
		return text.charAt(begin)==text.charAt(end) && isPalindrome(text, begin+1, end-1);
	}
	
}
