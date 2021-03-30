
public class CallStackTest {
	public static void main(String[] args) {
		firstMethod(); // static�޼���� ��ü �������� ȣ�Ⱑ���ϴ�.
	}
	
	static void firstMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("secondMethod()");
	}
}
