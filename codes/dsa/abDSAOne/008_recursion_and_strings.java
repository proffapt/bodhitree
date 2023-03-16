class Main{
	// Here are some problems related to String and it's manipulation being solved using Recursion
	public static void main(String[] args){
		// System.out.println(isPalindrome("fuck", 0, "fuck".length()-1));
		// System.out.println(isPalindrome("racecar", 0, "racecar".length()-1));
		System.out.println(powerSet("abc", 0, "abc".length()-1));
	}
	// Whether a given string is a palindrome or not
	static boolean isPalindrome(String str, int l, int r){
		if (l>=r){
			return true;
		}
		if (str.charAt(l) == str.charAt(r))
			return isPalindrome(str, l+1, r-1);
		else 
			return false;
	}
	// Powerset of a string, All the substrings which can be made from the given string
	static String powerSet(String s, int l, int r){
		if (l>r){
			System.out.println("");
			return "\nDONE";
		}
		System.out.println(s.substring(l, r));
		return s.charAt(l) + powerSet(s, l+1, r);
	}
}
