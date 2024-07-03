package hk.edu20240703.day05;

public class D2_ObjectTest  { //클래스 만들 때 부터 오브젝트 생성 
	
	public static void main(String[] args) {
		
		String str = new String();
		System.out.println(str.getClass()); // 클래스의 위치와 이름을 출력해줌
		
		D1_ClassTest classTest = new D1_ClassTest();
		System.out.println(classTest.getClass());
		
		System.out.println(classTest.toString()); //문자열로 반환해준다. : 객체일 경우 "위치@hashcode(16진수)" 반환한다.
		
		//기본타입일 경우 값을 문자열로 반환한다.
		int a = 10;
		Integer ii = 10; // 기본타입을 참조타입처럼 쓸 수 있게 만들어주는 것 Integer은 wrapper 클래스임
		System.out.println(ii.toString());
		
		
		D1_ClassTest classTest2 = new D1_ClassTest();
		
		System.out.println(classTest.hashCode());
		System.out.println(classTest2.hashCode()); // 둘이 해시코드가 다름 같은 틀로 만든 다른 붕어빵이기 떄문이다.
		
		// equals : 참조타입을 비교할때 -->hashcode로 비교한다 --> 해시코드() 사용
		
		System.out.println(classTest.equals(classTest2));
		
		//equals는 문자열 비교할 때 주로 쓰인다.
		//리터럴 방식, 객체 생성 방식
		
		//리터럴 방식
		String s = "a"; //리터럴 방식 기본방식 처럼 사용하는 것
		String ss = "a";;
		System.out.println(s==ss); //주소를 비교
		System.out.println(s.equals(ss)); //해시코드를 비교
		
		
		//객체생성해서 사용했을 경우 
		String sss = new String("a");
		System.out.println(s==sss); // 주소비교
		System.out.println(s.equals(sss)); // 해시코드는 내용이 같으면 똑같음 하지만 ==은 주소로 비교하기 떄문에 주소가 두개가 달라서 이렇게 됨 
	}

}
