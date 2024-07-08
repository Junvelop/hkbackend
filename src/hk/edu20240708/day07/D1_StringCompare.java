package hk.edu20240708.day07;

public class D1_StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//리터럴과 객체 생성 비교
		String s1 = "java";
		String s2 = "java"; // 스택에는 s1, s2가 만들어지고 힙에는 스트링 풀 영역에 자바라는 내용이 들어가 있어서 s1, s2가 스트림풀에 있는 자바라는 내용을 가르키고 있음
		
		System.out.println(s1==s2); //주소로 비교
		System.out.println(s1.equals(s2)); //해시코드로 비교
		
		
		//객체와 객체 비교
		String obj1 = new String("java");
		String obj2 = new String("java");
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2)); // 힙으로 생성하는 것임 -> 객체 생성마다 주소 달라 -> 펄스 출력 -> 내용이 같으면 해쉬코드 같아 -> 트루 출력
		
		
		String s3 = "java";
		String obj3 = new String("java");
		System.out.println(s3==obj3);
		System.out.println(s3.equals(obj3)); // 주소값은 다르기 떄문에 false 출력 -> 내용은 같기 떄문에 true 출력
		
		//String 특징 -> 불변적인 성격 -> 값이 안 변함
		String s = "java"; //원본
		String ss = s; // 복사본
			   ss = "자바"; //복ㄱ사본쪽에서 값을 바꾸면 원본이 바뀔까?
		System.out.println(s); //바뀌지 않음 참조형이지만 기본형인 성격이 있어서  
		
		
		
		//변수 s의 값이 자주 바뀌는 상황 
			s = "java2";
			s = s+"객체지향"; //객체가 계속 만들어짐 -> 메모리 효율 떨어져
			
			
			//스트링 버퍼는 자바.랭 패키지인데 이건 기본으로 쓸 수있어서 임포트 x
			
			
		//힙에 객체가 한번 생성되고 내부에 값이 변경되는 개념 -> 메모리 효율이 높음	
		StringBuffer sb = new StringBuffer("java");
		sb.append("객체지향 프로그래밍");
		System.out.println(sb.toString()); //얘는 객체 하나를 만들어 놓고 계속 더하는 것이고 (뮤터블) 리터럴 구조는 객체가 계속 생성이 됨
			
	
		
			
		
		

	}

}
