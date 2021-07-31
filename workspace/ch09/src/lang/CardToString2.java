package lang;

public class CardToString2 {
	public static void main(String[] args) {
		
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("DIAMOND", 2);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}

class Card2 {
	String kind;
	int number;
	
	public Card2() {
		this("SAPDE", 1);
	}
	
	public Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "CARD [kind: " + kind + ", number: " + number + "]";
	}
	
}