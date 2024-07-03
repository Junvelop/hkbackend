package hk.edu20240703.day05;

public class D3_AccessMain {

	public static void main(String[] args) {
		
		D3_AccessTest access = new D3_AccessTest();
		int a = access.a; //퍼블릭 선언 : 접근 가능
		// TODO Auto-generated method stub
		int b = access.b; //디폴트 선언 : 접근 가능
	 	int c = access.getC(3); // private 선언 : 접근 불가능

	}

}
