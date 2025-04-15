package functionMethod;

public class CalcFacto {
	public static int facto(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		return fact;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		int res=facto(num);
		System.out.println("Factorial of "+ num + " is: "+res);

	}

}
