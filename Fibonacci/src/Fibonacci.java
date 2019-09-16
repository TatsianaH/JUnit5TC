
public class Fibonacci {
	public static long fib(int n) {
		/*
		 * 1. Case if(n <= 1) return n; return fib(n - 1) + fib(n - 2);
		 */

		/*
		 * 2.Case long [] arr = new long[n+2]; arr[0] = 0; arr[1] = 1; int i; for(i = 2;
		 * i <= n; i++){ arr[i] = arr[i - 1] + arr[i - 2]; } return arr[n]; }
		 */

		long a = 0, b = 1, c;
		if (n == 0)
			return a;
		if (n == 1)
			return b;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;

		}
		return b;

	}

	public static void main(String args[]) {
		int n = 9;
		System.out.println(fib(n));
	}
}
