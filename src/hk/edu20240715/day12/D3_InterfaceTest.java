package hk.edu20240715.day12;

public interface D3_InterfaceTest {
	
	// 다중상속을 흉내 낼 수 있음 0-> extends.. implements ... 
	//public interface D3_InterfaceTest extedns Test implements ITest
	//인터페이스끼리 다중 구현이 가능함 implemnets IA,IB,IC
	//인터페이스 끼리 상속이 가능하다 public interface IA exxtedns IB
	
	
	//상수 선언
	public static final int A = 5;
	public int B = 10;
	
	//알아서 추상 메서드로 인식 인터페이스는
	public abstract int test();
	public int test2();
	
	
	public default void test3() { // 메서드를 쓰고 싶으면 디펄트를 붙이면 됨
		
		
		test5();
		System.out.println("인터페이스를 구현한 객체가 사용한다.");
		
		
	}
	
	
	//private 메서드 : 구현한 객체에서 사용할 수 없다. 인터페이스 내부에서만 공통기능으로 사용한다. 원래는 안 됐지만 편의상 추가되었음
	
	private void test5() {
		
		
		
	}
	
	//static 메서드 : D3_InterfaceTest.test6()로 호출해서 사용가능
	
	public static void test6() { //이미 스태틱에 올려버렸기 때문에 사용 가능
		
		
		System.out.println("인터페시르만으로 실행이 가능하다.");
	}
	
	

}
