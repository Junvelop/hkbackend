package java_20240628.day02;

public class java_20240628 {

	public static void main(String[] args) {
		System.out.println("ㅎㅇ");
		testMethod();
		testMethod2();
	

	}
	
	public static void testMethod() { // 여기 스태틱을 붙여야 메인 메모리에 올라가서 메인 메서드에서 인식이 가능함 또한 Hello hello = new Hello(); 해서 hello.testMethod로도 쓸 수 있는데 이건 힙 방식으로 올라감
		
		boolean isS = true;
		int i = 100;
		i = 200;
		System.out.println("메서드 실행" + i);
	}
	
	public static void testMethod2() {
		
		int i = 10;
		if(i<15) {
			int ii =5;
			ii = ii + i;
		
		}
		// i = ii + i; 오류발생 ii는 if문 블럭에 선언된 변수라 IF문 안에서만 활용할 수 있음
	}

}
