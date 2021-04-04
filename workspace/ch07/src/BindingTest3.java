
public class BindingTest3 {
	public static void main(String[] args) {
		// Parent: P3, Child: C3
		P3 p = new C3();
		C3 c = new C3();
		
		System.out.println("p.x = " + p.x);
		p.method();
		System.out.println();
		System.out.println("c.x = " + c.x);
		c.method();
	}
}

class P3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class C3 extends P3 {
	int x = 200;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("super.x=" + super.x);
		System.out.println("this.x=" + this.x);
	}
}
