package hk.edu20240715.day12;

public class D1_AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D1_Animal am = new D1_Human(); // 부모 타입이지만 실제로 담고 있는 것은 휴먼 객체임 그러기에 휴먼 클래스의 오버라이딩 된 메소드가 호출이 됨.
		am.move();
	//	am.test(); 오류 발생 
		
		
		
		D1_Human humanChild = (D1_Human)am; // 자식타입으로 형 변환을 해줘야 자식타입에만 있는 것을 쓸 수 있음. // 다운캐스팅
		humanChild.test(); // 부모에 공개된 메서드만 사용 가능하다.
		
		
		System.out.println("------------------");
		
		//다형성 발생원리 3가지
		//1. 부모의 타입으로 자식을 생성한다.
		D1_Animal animal1 = new D1_Human();
		D1_Animal animal2 = new D1_Tiger();
		D1_Animal animal3 = new D1_Eagle();
		
		
		//2. 부모의 타입으로 자식을 참조한다.
		D1_Human human1 = new D1_Human();
		D1_Animal animal4= human1;
		
		
		D1_AnimalTest aTest = new D1_AnimalTest();
		aTest.moveAnimal(animal1);
		aTest.moveAnimal(animal2);
		aTest.moveAnimal(animal3);
	//	aTest.moveAnimal(animal4);
		

	}
	
	// 자식타입의 서로 다른 여러 객체들을 참조할 수 있다. (파라미터에 선언된 부모타입으로)
	public void moveAnimal(D1_Animal animal) {
		//메서드 오버라이딩 : 부모의 메서드를 오버라이딩 해야 한다.
		animal.move(); //하나의 부모타입으로 여러 형태를 나타낼 수 있다. (다형성)
		
		//오버라이딩 안된 경우에 메서드를 사용한다면
		if(animal instanceof D1_Human) { //인스턴스 종류 비교 만약 애니멀이 휴먼타입이면이란 뜻 
			
			D1_Human human2 = (D1_Human)animal;
			human2.test();
			
		}
		
	}

}
