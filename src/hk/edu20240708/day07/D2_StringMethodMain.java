package hk.edu20240708.day07;

public class D2_StringMethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D2_StringMethod smt = new D2_StringMethod();
		String s = smt.sTest01("java", 1); //객체명. 메서드 -> 인스턴스 객체임 스태틱이 아니라 힙에 올리는 구조임
		System.out.println(s);
		
		
		String ss= smt.sTest2("선재 업고 튀어");
		System.out.println(ss);
		
		System.out.println(smt.sTest03("java"));
		smt.sTest04();
		
		String sss=smt.sTest05("java프로그래밍언어");
		System.out.println(sss);
		

	}

}
