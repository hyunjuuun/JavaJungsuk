package ch06;
class MyMath2 {
	long a, b;

	// 인스턴스 변수 a,b 만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {
		return a + b;
	}

	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다.
	static long add(long a, long b) {
		return a + b;
	} // a,b는 지역변수
}

class MyMathTest2 {
	public static void main(String[] args) {
		
		// 클래스 메서드 호출. 인스턴스 생성없이 호출 가능
		System.out.println(MyMath2.add(200L, 100L));
		
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 100L;
		
		// 인스턴스 메서드는 객체 생성 후에만 호출이 가능함.
		System.out.println(mm.add());
	}

}
