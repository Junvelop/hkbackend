package hk.edu20240704.day06;

public class D3_CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D3_CalculatorA cal = new D3_CalculatorA(5, 10); // f3 누르면 메서드의 경로를 볼 수 있음
		cal.a();
		System.out.println(cal.getResult()); //바로 cal.result로 하면 프라이빗이고 같은 클래스가 아니라 접근이 안 됨 
		
		
		int num1 =20;
		int num2 =10;
		String calcu = "-";
		
		D_CalculatorCompare cal2 = new D_CalculatorCompare();
		cal2.calculator(num1, num2, calcu);
		System.out.printf("%d와 %d의 %s 계산 결과 : %d", num1,num2,calcu,cal.getResult() );

	}

}
