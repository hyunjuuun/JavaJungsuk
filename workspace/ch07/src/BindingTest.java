
public class BindingTest {
	public static void main(String[] args) {
		// Parent: P, Child: C
		P p = new C();
		C c = new C();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class P {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class C extends P {
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	}
}