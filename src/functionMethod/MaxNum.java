package functionMethod;

public class MaxNum {

	public static int maxNum(int s, int b, int c) {
		int a = 100;
		int max=a;
		if(b>max) {
			max=b;
			
		}
		if(c>max) {
			max=c;
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100; int b = 230; int c = 15;
		int max=maxNum(a,b,c);
		System.out.println(max);
		

	}

}
