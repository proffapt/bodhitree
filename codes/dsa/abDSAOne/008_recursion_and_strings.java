class Main{
	// Here are some problems related to String and it's manipulation being solved using Recursion
	public static void main(String[] args){
		// System.out.println(isPalindrome("fuck", 0, "fuck".length()-1));
		// System.out.println(isPalindrome("racecar", 0, "racecar".length()-1));
		powerSet("abc", 0, "");
	}

	// Powerset of a string, All the substrings which can be made from the given string
	static void powerSet(String s, int i, String cur){
		if (i==s.length()){
			System.out.print(cur+" ");
			return;
		}

		powerSet(s, i+1, cur);
		powerSet(s, i+1, cur+s.charAt(i));
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
}
