
import java.util.*;

public class PolyArgumentTest {
	public static void main(String[] args) {
		
		Buyer b = new Buyer();
		T tv = new T();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = price/10; // 보너스 점수는 제품가격의 10%
	}
	
	Product() {} // 기본 생성
}

class T extends Product {
	T() {super(100);}
	public String toString() {return "Tv";}
}

class Computer extends Product {
	Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Audio extends Product {
	Audio() {super(50);}
	public String toString() {return "Audio";}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); // 구입한 제품을 저장하는데 사용될 Vector객체
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "을/를 반품하셨습니다.");
		}
		else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() { // 구매한 물품에 대한 정보를 요약해서 보여 준다.
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? p : ", " + p; 
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}




