package functionMethod;

public class PrimeNum {
 public static boolean isPrime(int n) {
	 if(n<=1) {
		 return false;
	 }
	for(int i=2; i<=n/2; i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=11;
		 if(isPrime(num)) {
			 System.out.println("Prime");
		 }else {
			 System.out.println("Not prime number");
		 }
	}

}
