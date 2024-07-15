package hk.edu20240715.day12;

public class D2_ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	D2_Computer computer = new D2_Computer(); // 추상클래스라 new를 생성해서 생성자를 만들 수 없음.
		
		
		D2_Computer c1 = new D2_DeskTop();
		c1.display();
		c1.turnOn();
		
		D2_Computer c2 = new D2_MyNoteBook();
		c2.display();
		c2.typing();

	}

}
