package java_20240701.day03;

public class D1_ControlFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if문 유형 대표적 3가지 1. if(조건식) {실행코드} 
		//2. if(조건식) {실행코드} else {실행코드}
		//3. if(조건식) {실행코드} else if {실행코드} else if {실행코드} 
		
		
		int num1=10;
		int num2=5;
		
		if(num1 >num2) {
			
			System.out.println("실행결과 : " + num1 + ">" + num2); //자바에서는 문자열 더하기 다른 것은 자동으로 문자열로 인식이 됨 그래서 출력되는 값은 다 문자열임
			
		}else { //엘스문은 이렇게 닫는 괄호 옆에 바로 입력해주어야 함. 안 그러면 바로 오류가 남
			
			System.out.println("실행결과 : " + num1 + "<" + num2); 
			
		}
		
		//여러 조건을 설정한다면 ..
		if(num1>num2) {
			
			System.out.println("실행결과 : " + num1 + ">" + num2);
		}else if (num1==num2) {
			
			System.out.println("실행결과 : " + num1 + "=" + num2);
		}else if (num1<num2) {
			
			System.out.println("실행결과 : " + num1 + "<" + num2);
		}
		
		
		
		//스위치 케이스문 : 대상값이 정수형, String
		
		int num = 6;
		
		
		switch (num) {
			case 1: System.out.println("1입니다."); break;
			case 2: System.out.println("2입니다."); break;
			case 3: System.out.println("3입니다."); break;
			case 4: System.out.println("4입니다."); break;
			case 5: System.out.println("5입니다."); break;
			case 6: System.out.println("6입니다."); break;
			

		default:
			break;
		}
			
		//제어문 (반복문)
		//for문 : 기본형식 (인덱스 기반의 실행), 향상된 for문 
		
		for (int i = 0; i < 10; i++) {
			
			
			if(i==3) { //가장 가까운 반복문 빠져나오기
				
				 break;
				 // continue;// 는 가장 가까운 반복문으로 돌아가기 이 코드에서는 3을 출력 안 하고 for문으로 돌아감
			}
			
			System.out.println(i);
		}
		
		//향상된 for문 
		//배열 : 어떤 값의 나열 --> 자바에서는 같은 타입의 나열
		int [] i = {1,2,3,4,5};
		// 초기값 : 사용될 객체
		for (int j : i) // j : for문안에서 사용할 변수
		{
			System.out.println(j);
		}
		
		for (int j = 0; j < i.length; j++) {
			
			System.out.println(i[j]); //i라는 배열에서 j라는 인덱스를 꺼내오는 방식
			
		}
		
		do {
			
			System.out.println("조건에 맞지 않아도 한번은 실행한다.");
			
		} while (10 < 5);

	}

}
