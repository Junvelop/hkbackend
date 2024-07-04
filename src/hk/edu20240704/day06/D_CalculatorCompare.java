package hk.edu20240704.day06;

public class D_CalculatorCompare {
	
	//은닉화(캡슐화)
	private int result; //연산결과
	
	public void calculator(int num1, int num2, String cal) {
		//분기형태로 실행하자 -> if문으로 구현하겠다는 뜻 
		//전달받은 연산자(cal변수)는 문자열이다 --> 비교하려면 equals() 사용 
		
		if(cal.equals("+")) {
			
			D3_CalculatorA calA = new D3_CalculatorA(num1,num2);
			calA.a(); //덧셈 연산이 실행
			this.result = calA.getResult();
		}else if(cal.equals("-")) {
			D3_CalculatorB calB = new D3_CalculatorB(num1,num2);
			calB.a();
			this.result = calB.getResult();
		}else if(cal.equals("/")) {
			D3_CalculatorC calC = new D3_CalculatorC(num1, num2);
			calC.a();
			this.result = calC.getResult();
			}
		else if(cal.equals("*")) {
			D3_CalculatorD calD = new D3_CalculatorD(num1, num2);
			calD.a();
			this.result = calD.getResult();
		}else {
			System.out.println("입력된 연산자는 지원하지 않습니다");
		}
		
		
		
		
		
	}
	
	public int getResult() {
		return result;
	}
	

	

}
