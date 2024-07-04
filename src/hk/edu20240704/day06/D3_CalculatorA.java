package hk.edu20240704.day06;

public class D3_CalculatorA {

	//께산할 값 2개를 저장할 맴버필드 선언 
	public int num1;
	public int num2;
	
	
	private int result;
	
	
	public D3_CalculatorA() {
		// TODO Auto-generated constructor stub
		this.num1 =10;
		this.num2=10;
		// this(10,10); 위에 두줄 쓰기 귀찮으면 이거 쓰면 됨 // 기본 초기 값을 생성자 오버로딩을 통해 초기화할 수도 있다. 
	}
	
	//생성자 오버로딩 : 연산을 위한 2개의 수를 객체생성하자마자 필드에 저장
	public D3_CalculatorA(int num1, int num2) {
		// TODO Auto-generated constructor stub
		this.num1 = num1;
		this.num2 = num2;
	}
	
	//기능 정의 : 덧셈연산
	public void a() {
		this.result = this.num1 + this.num2; 
		
	}

	
	//직접 메서드에서 계산해서 결과를 반환시킬 수도 있지만 까다로움
	
	
	
	public int getResult() { // 게터 또는 세터를 만들 때는 소스 메뉴에서 제너레이터 게터 세터 들어가서 해야 함.
		return this.result; // 연산한 내용을 게터로 가져온다. 
	}
	
	
	
	
}


