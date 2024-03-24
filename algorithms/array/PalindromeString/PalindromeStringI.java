class PalindromeStringI {
	public static boolean isPalindrome(String string) {
		char[] charArray = string.toCharArray();
		int p1 = 0, p2 = charArray.length - 1;
		while (p1 < p2) {
				if (charArray[p1++] != charArray[p2--])
					return false;
		}
		return true;
	}
	public static String cleanString(String string) {
			String newString = "";
			char[] charArray = string.toCharArray();
			for (char i : charArray) {
				if ( (i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z') || (i >= '0' && i <= '9'))
					newString += i;
			}

			return newString.toLowerCase();
	}
	public static void main(String[] argv) {
		if (argv.length < 1) {
			System.out.println("No string provided as argument");
			return;
		}
		System.out.println("Clean string: " + cleanString(argv[0]));
		System.out.println("If string " + argv[0] + " is a palindrome: " + isPalindrome(cleanString(argv[0])));
	}
}
