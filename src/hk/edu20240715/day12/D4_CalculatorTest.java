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
//		D4_calc.showInfo(); -> 오류남 부모 인터페이스에 없어서 자료형이 달라서 // 오버라이딩이 됐으면 자료형이 같다고 여겨지지만 새로 만들어지기만 한 것은 아님 
		D4_CompleteCalc calc3 = (D4_CompleteCalc)calc;
		calc3.showInfo(); //자식에만 있는 메서드를 사용할 거면 자식타입으로 다운 캐스팅 해야 해 
		

	}

}
