package hk.edu20240704.day06;

public class D3_CalculatorD {

	
		
		public int num1;
		public int num2;
		private int result;
		public D3_CalculatorD(int num1, int num2) {
			super();
			this.num1 = num1;
			this.num2 = num2;
		}
		
		public D3_CalculatorD() {
			this(10,10);
		}
		
		
		
		public void a() {
			
			result = num1 * num2;
		}

		public int getResult() {
			return result;
		}
		
		

		
		
		
		
		
		

	
	
	
	

}
