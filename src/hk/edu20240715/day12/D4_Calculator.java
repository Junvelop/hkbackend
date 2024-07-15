package hk.edu20240715.day12;

public abstract class D4_Calculator implements D4_Calc {

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public  int substract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public abstract int times(int num1, int num2);
	public abstract int divide(int num1, int num2);

}
