package java_20240628.day02;

public class D1_VariableTest {
	
	public static void main(String[] args) {
		
		
		// 기본타입의 특징 (정수 타입) 기본형이 int
		byte b =1; // ~ 128 ~127 숫자를 표현 1바이트
		
//			 b= 128; //128은 표현범위를 벗어남
		short sh = 128; //2byte니깐 저장할 수 있음
		int i = 500000000; //4바이트
		long l= 500000000L;
		
		
		//2. 실수형
		double d= 15.8;
		//float f= 12.7f;
		float f = (float)12.7;
		double ff = d + f; //다른 타입의 두 변수를 연산하면 큰쪽의 타입으로 변환
		float ff2 = (float)(d + f);
		
		//3. 다른 타입끼리 연산
		int ii = (int) (i +d); // int + double = double 반환
		double dd= i +d;
		int iii = (int)dd; //dd double --> int형 변환하면 짤림 12.3이 12와 같이
		
		//4. 정수끼리 연산
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1+b2); //byte끼리 연산해도 int형으로 변환 Java에서는 byte, short, char 같은 작은 정수형 데이터 타입 간의 산술 연산이 수행될 때, 결과가 자동으로 int 타입으로 변환됩니다. 이는 자바 언어의 설계 원칙 중 하나로, 산술 연산 중 발생할 수 있는 오버플로우 및 기타 문제를 방지하기 위해서입니다.
		
	}

}
;