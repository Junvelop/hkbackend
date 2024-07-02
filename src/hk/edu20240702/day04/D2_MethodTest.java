package hk.edu20240702.day04;

public class D2_MethodTest {
	
	public static void main(String[] args) {
		
		D2_MethodTest t1 = new D2_MethodTest();
		
		t1.test01();
		test02();
		int result = test05(2,3); //메서드에서 반환된 값은 저장을 안 하면 날아가기 때문에 이렇게 변수로 받아줘야 함
		System.out.println(test05(2,3));// 자기 클래스 내부이기 때문에 클래스명. 메서드를 쓰지 않음
	
	}
	
	public  void test01() {
		
		System.out.println("hi");
	}
	
	
	
	public static void test02() {
		System.out.println("bye");
	}
	
	
	//2. 반환타입 0  / 반환 타입 x
	public static int test03() {
	
	return 3;
	}
	
	public static void test04() {
		
		// string hi;
	}
	
	
	//3. 파라미터 있/없
	
	public static int test05(int k, int j) {
		
		int c = k + j + 3;
		return c;
	}

}
