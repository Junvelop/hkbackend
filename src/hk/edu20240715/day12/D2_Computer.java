package hk.edu20240715.day12;

public abstract class D2_Computer { //추상 메서드를 포함하고 있으면 클래스 앞에 앱스트랙트를 붙여야해 
	
	
	
	//디스플레이 방식이 컴퓨터 유형별로 다를 수 있다. 노트북, 데스크탑
	public abstract void display(); //추상메서드는 {}를 빼고 반환형 앞에 앱스트랙트를 붙이면 돼 
	
	//타이핑 방식도 컴퓨터 유형별로 다를 수 있다. 노트북, 데스크탑
	public abstract void typing();
	public void turnOn() {
		
		System.out.println("전원을 킵니다");
	}
	
	public void turnOff() {
		
		System.out.println("전원을 끕니다");
	}

}
