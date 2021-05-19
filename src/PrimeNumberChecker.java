
public class PrimeNumberChecker {

	public static void main(String[] args) {
		

	}
	
	public static boolean isPrime(int n) {
		
		if(n <= 0) {
			return false;
		}
		
		for(int i = 2; i < n/2; i++) {
			if(n % i == 0) {
				
				return false;
			}
		}
		return true;
	}

}
