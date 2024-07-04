package hk.edu20240704.day06;

import java.util.Arrays;

public class D2_FianlTest extends D2_ParentTest {

	public static void main(String[] args) {
		
		//값 변경이 안되는 경우 만들기
		int a = 5;
			a = 10; //변경 가능
			
		// 상수로 선언하기
		final int B =10;
			   // int B = 5; 이렇게 하면 에러 뜸
		
		//메서드에 아규먼트로 전달해서 실행 
		D2_FianlTest ft = new D2_FianlTest();
		ft.test01(30);
		
		arrayA[0] = 10;
		System.out.println(Arrays.toString(arrayA));
	//	arrayA = new int[] {4,5}; // 주소값 변경하는 코드 실행하면 에러가 떠
	}
	
	public int test01(int value) {
		// TODO Auto-generated method stub
		final int aa = value;
		
		return aa;
		
	}
	
	public static final int A = 10;
	
	public static final int [] arrayA = {1,2,3,4,5}; //참조 타입 중 배열 선언 : 주소값을 저장 -> 주소값 변경 금지 

	@Override //메서드에 final 사용하면 오버라이딩 금지
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("자식에서 다시 정의했어요");
	}
	
}
