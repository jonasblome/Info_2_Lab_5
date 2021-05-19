
public class ExecutionTimes {
	
	public static void main(String[] args) {
		ExecutionTimes executor = new ExecutionTimes();

		System.out.println("10s");
		System.out.println();
		executor.fragment1(10);
		executor.fragment2(10);
		executor.fragment3(10);
		executor.fragment4(10);
		executor.fragment5(10);
		executor.fragment6(10);
		executor.fragment7(10);
		executor.fragment8(10);
		System.out.println();
		System.out.println("100s");
		System.out.println();
		executor.fragment1(100);
		executor.fragment2(100);
		executor.fragment3(100);
		executor.fragment4(100);
		executor.fragment5(100);
		executor.fragment6(100);
		executor.fragment7(100);
		executor.fragment8(100);
		System.out.println();
		System.out.println("1000s");
		System.out.println();
		executor.fragment1(1000);
		executor.fragment2(1000);
		executor.fragment3(1000);
		executor.fragment4(1000);
		executor.fragment5(1000);
		executor.fragment6(1000);
		executor.fragment7(1000);
		executor.fragment8(1000);
		System.out.println();
		System.out.println("10000s");
		System.out.println();
		executor.fragment1(10000);
		executor.fragment2(10000);
		executor.fragment3(10000);
		executor.fragment4(10000);
		executor.fragment5(10000);
		executor.fragment6(10000);
		executor.fragment7(10000);
		executor.fragment8(10000);
		System.out.println();
	
		System.out.println(isPrime(24));
	}
	
	// runtime: O(n)
	public void fragment1 (int n) {
		int sum = 0;
		for ( int i = 0; i < n; i ++)
		    sum++;
		System.out.println("Fragment 1: " + sum);
	}
	
	// runtime: O(n * n)
	public void fragment2 (int n) {
		long sum = 0;
		for ( int i = 0; i < n; i ++)
		    for ( int j = 0; j < n; j ++)
		        sum++;
		System.out.println("Fragment 2: " + sum);
	}
	
	// runtime: O((n * n + n) / n)
	public void fragment3 (int n) {
		int sum = 0;
		for ( int i = 0; i < n; i ++)
		    for ( int j = i; j < n; j ++)
		        sum++;
		System.out.println("Fragment 3: " + sum);
	}
	
	// runtime: O(n + n * n) (n + can be omitted)
	public void fragment4 (int n) {
		long sum = 0;
		for ( int i = 0; i < n; i ++) {
		    sum ++;
		    for ( int j = 0; j < n; j ++)
		    	sum ++;
		}
		System.out.println("Fragment 4: " + sum);
	}
	
	// runtime: O(n * n * n)
	public void fragment5 (int n) {
		long sum = 0;
		for ( int i = 0; i < n; i ++)
		    for ( int j = 0; j < n*n; j ++)
		    sum++;
		System.out.println("Fragment 5: " + sum);
	}
	
	// runtime: O((n - 1)!)
	public void fragment6 (int n) {
		long sum = 0;
		for ( int i = 0; i < n; i ++)
		    for ( int j = 0; j < i; j ++)
		        sum++;
		System.out.println("Fragment 6: " + sum);
	}
	
	// runtime: O((n - 1) * n * n * (n - 1)!) (the - 1 can be omitted)
	public void fragment7 (int n) {
		long sum = 0;
		for ( int i = 1; i < n; i ++)
		    for ( int j = 0; j < n*n; j ++)
		        if (j % i == 0)
		           for (int k = 0; k < j; k++)
		               sum++;
		System.out.println("Fragment 7: " + sum);
	}
	
	// runtime: O(log(n))
	public void fragment8 (int n) {
		long sum = 0;
		int i = n;
		while (i > 1) {
		    i = i / 2;
		    sum++;
		}
		System.out.println("Fragment 8: " + sum);
	}
	
	
	public static boolean isPrime (int n) {
		if (n <= 0) {
			System.out.println("Please insert a positive number");
			return false;
		}
		int i = 2;
		while(i <= n / 2) {
			if (n % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}

}
