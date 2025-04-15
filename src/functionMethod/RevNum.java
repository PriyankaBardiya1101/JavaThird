package functionMethod;

public class RevNum {
	public static int revNum(int n) {
		int rev=0;
		while(n!=0) {
			int digit = n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		return rev;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123456;
		int revNum=revNum(num);
		System.out.println("Reversed number:"+revNum);

	}

}
