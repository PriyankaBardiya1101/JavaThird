package functionMethod;

public class Palindrom {
	public static boolean isPalindromeString(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }

	public static boolean isPalindromeNumber(int number) {
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        return original == reversed;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testNumber = 121;
        System.out.println(testNumber + " is palindrome? " + isPalindromeNumber(testNumber));
    

        String testString = "A man a plan a canal Panama";
        System.out.println(testString + " is palindrome? " + isPalindromeString(testString));

	}

}
