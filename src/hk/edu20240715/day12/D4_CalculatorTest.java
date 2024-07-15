package hk.edu20240715.day12;

public class D4_CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		D4_Calc calc = new D4_CompleteCalc(); //인터페이스 타입으로 생성
		D4_CompleteCalc cal2=new D4_CompleteCalc();
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	//	calc.showInfo(); -> 오류남 부모 클래스에 없어서
		D4_CompleteCalc calc3 = (D4_CompleteCalc)calc;
		calc3.showInfo(); //자식에만 있는 메서드를 사용할 거면 자식타입으로 다운 캐스팅 해야 해 
		

	}

}
