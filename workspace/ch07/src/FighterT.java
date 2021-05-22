abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("멈춥니다.");
	}
}

interface Fightable2 { // 인터페이스의 모든 메서드는 public abstract
	void move(int x, int y); // public abstract 생략
	void attack(Fightable f); // public abstract 생략
}

class Fighter2 extends Unit2 implements Fightable2 {
	// 오버라이딩 규칙 : 조상(public)보다 접근제어자가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이");
	}
	public void attack(Fightable2 f) {
		System.out.println(f+"를 공격");
	}
	@Override
	public void attack(Fightable f) {
		// TODO Auto-generated method stub
		
	} 
}

public class FighterT {

	public static void main(String[] args) {
		Fighter2 f = new Fighter2();
		f.move(100, 200);
		f.attack(new Fighter2());
		
	}

}
