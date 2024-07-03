package hk.edu20240703.day05;

public class D3_AccessTest {

	//멤버필드
	public int a; //모두 접근 가능
		   int b;
		   
	private int c; // 클래스 내부에서만
	
	//메서드
	public void aa() {
		
		
	}
	
	void bb() {
		
		
	}
	
	private void cc() {
		
		
	}
	
	public int getC(int g) {
		
		if (g == 3)
			return c;
		
		 return 0;//클래스 내부에서 접근하기 떄문에 가져올 수 있음. 
	}
	
	
}
