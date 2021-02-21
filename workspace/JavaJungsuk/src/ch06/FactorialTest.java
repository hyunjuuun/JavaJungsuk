package ch06;

public class FactorialTest {

	public static void main(String[] args) {
		int result = factorial(4);
		
		System.out.println(result);
	}
	
	static int factorial(int n) {
		if (n <= 0 || n > 12) return -1; // 매개변수 n의 유효성 검사를 추
		if (n==1)
			return 1;
		
		return n * factorial(n-1);
	}

}
