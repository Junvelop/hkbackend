package hk.edu20240704.day06;

import hk.edu20240703.day05.D3_AccessTest;

public class D1_ImmutableTest {
	
	int bb = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다른 패키지에 있는 클래스를 사용하려면 import해야 한다. 
		D3_AccessTest d3 = new D3_AccessTest(); // 자동완성으로 입력하면 임포트가 자동으로 됨
		
		
		
		int aa =5;
		
		change01(aa); // int a = aa가 저장이 됨 
		System.out.println("원본 aa변수값 :" + aa); //값을 전단했기 떄문에 값이 바뀌지 않음
		
		D1_ImmutableTest itest = new D1_ImmutableTest();
		change02(itest);
		D1_ImmutableTest itest2 = new D1_ImmutableTest();
		change02(itest2);
		System.out.println("원본 itest2의 값 :" + itest2.bb);
		
	

	}
	
	public static void change01(int a) { // -> 기본 타입 -> 값만 넘김
		
		a = 10;
		
		
	}
	
	
	public static void change02(D1_ImmutableTest itest) { // 참조 타입 -> 주소만 넘김 
		
		itest.bb = 10;
		
	}
	
	
	

}
