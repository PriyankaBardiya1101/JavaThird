package functionMethod;

public class VowelCount {
	public static int countVowels(String str) {
        int count = 0;
//        str = str.toLowerCase(); 
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="Hello my name is priyanka";
		int vowelCount=countVowels(input);
		System.out.println("Number of vowels:"+vowelCount);

	}

}
