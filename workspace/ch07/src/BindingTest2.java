
public class BindingTest2 {
	public static void main(String[] args) {
		// Parent: P2, Child: C2
		P2 p = new C2();
		C2 c = new C2();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class P2 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class C2 extends P2 {}