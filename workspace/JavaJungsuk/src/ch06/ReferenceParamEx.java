package ch06;
// class Data { int x; }

public class ReferenceParamEx {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change (d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) { // 李몄“�삎 留ㅺ컻蹂��닔 
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
