package hk.edu20240715.day12;

public class D4_CompleteCalc extends D4_Calculator {

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return D4_Calc.ERROR;
        }
    }

    public void showInfo() {
        System.out.println("하위클래스에서 새롭게 정의된 매서드");
    }
}
