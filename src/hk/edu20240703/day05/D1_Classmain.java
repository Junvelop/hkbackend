package hk.edu20240703.day05;

public class D1_Classmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//참조타입
		D1_ClassTest classtest = new D1_ClassTest(); //heap 메모리 생성 -> 객체는 주소 생성하고 주소 저장하고 있음
		classtest.methodTest();// 객체명. 메서드() 호출
		D1_ClassTest.staticmethodTest(); // 스태틱 매서드는 클래스명.메서드로 실행함 (정적메서드라고 불름)
		D1_ClassTest classTest2 = new D1_ClassTest(); // 객체 2 위에 classtest와 독립적임
		classTest2.number =19;
		classTest2.methodTest();
		int number2= classTest2.number;
		
		
		//인스턴스 변수 : 객체 각각에 대해서 관리가 되기 때문에 서로 영향을 받지 않는다. 
		classtest.number=30;
		System.out.println(classtest.number + ":" + classTest2.number);
		
		//클래스변수 : 객체끼리 하나의 변수를 공유하고 있어서 서로 영향을 받는다.
		classtest.staticNumber = 30;
		System.out.println("클래스변수 : " + classTest2.staticNumber);// 스태틱은 객체가 여라개 생성될 경우 공유됨(스태틱 메모리에 바로 올라가 있기 떄문에 힙 메모리가 아니라) 그러기 때문에 다른 객체로 값을 바꿔도 또 다른 객체로 값을 가지고 올 수 있음 
		
		
		
		
		
		

	}

}
