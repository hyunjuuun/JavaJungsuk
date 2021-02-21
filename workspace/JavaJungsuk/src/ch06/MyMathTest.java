package ch06;

public class MyMathTest {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		mm.printGugudan(12);
	}

}

class MyMath {
	void printGugudan(int x) {
		if (!(2 <= x && x <= 9)) {
			System.out.println("출력 가능한 범위를 벗어났습니다.");
			return;
		}
		for(int i=1; i<10; i++) {
			System.out.printf("%d * %d = %d%n", x, i, x * i);
		}
		
	}
	long add(long a, long b) { return a+b ;}
	long subtract(long a, long b) { return a-b; }
	long multiply(long a, long b) { return a*b; }
	double divide(double a, double b) { return a/b; }
}