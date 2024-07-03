package hk.edu20240703.day05;

public class D4_ConstructorTest {
	
	
	public static void main(String[] args) {
		
		D4_ConstructorTest con = new D4_ConstructorTest();
		System.out.println(con.getSize());
		
		D4_ConstructorTest con2 = new D4_ConstructorTest(40);
		System.out.println(con2.getSize());
		
		D4_ConstructorTest con3 = new D4_ConstructorTest(30, "빨강");
		System.out.println(con3.getSize());
		System.out.println(con3.color);
		
	}
	
	//티비객체
	private int size = 0; //중요한 객체인 경우 프라이빗 선언
	public String color = "검정색"; //색상 
	
	//디펄트 생성자는 단독으로 사용할 때는 생략이 가능하지만 오버로딩하면 생략이 안 돼 
	 public D4_ConstructorTest() {
		// TODO Auto-generated constructor stub
		 super(); // 부모의 생성자를 호출 (이 코드는 반드시 첫줄에 작성한다)
		 this.size = 60;
		 
	} 	
	
	// 생성자 오버로딩 (파라미터 1개짜리)
	 public D4_ConstructorTest(int size) { // 생성자를 오버로딩 했으면 기본 생성자가 없으면 안 돼 진짜 쓰고 싶으면 작성을 해야 돼 
	// TODO Auto-generated constructor stub
		 this.size = size;
		 
		 
		 
		 
} 
	 D4_ConstructorTest(int size, String color){
		 
		 this.size = size;
		 this.color=color;
		 
	 }
	 
	 //값을 가져오기
	 public int getSize() {
		 return size;
	 }
	 
	 public void setSize(int size) {
		 this.size = size;
	 }
	

}
