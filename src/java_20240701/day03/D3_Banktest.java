package java_20240701.day03;

import java.util.*;

public class D3_Banktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scan = new Scanner(System.in); // 스캐너 -> 클래스를 객체생성해서 변수에 저장할 때 선언되는 타입 --> 참조타입
		
		//예제
				// while문과 Scanner객체를 이용해서 키보드로부터 입력된 데이터로 예금,출금,조회,종료 기능 구현
				// 예금한 금액을 저장할 변수 선언
				// 키보드로 입력받은 값을 저장할 변수 선언
		
		
		
		int yegum;
		int chulgum;
		int chowhe ;
		int exit ;
		int money = 0;
		

				while(true) {
					System.out.println("------------------------");
					System.out.println("1.예금|2.출금|3.잔고|4.종료");
					System.out.println("------------------------");
					System.out.println("선택>");
					int choice = scan.nextInt();
					
					if(scan.hasNextInt()) {
						choice =scan.nextInt();
					}else {
						
						System.out.println("숫자를 입력해요");
						scan = new Scanner(System.in);
						continue;
						
					}

					if(choice == 1) {
						
						System.out.println("예금액 >");
					    yegum = scan.nextInt();
					    money = money + yegum;
						
						
						

					}else if(choice == 2){
						
						System.out.println("출금액 >");
						chulgum = scan.nextInt();
						money = money - chulgum;
						if(money < chulgum) {
							System.out.println("출금불가 잔액부족");
							
							continue; // 가장 가까운 반복문으로 돌아가기 -> while 문으로 돌아가기
						}
						

					}else if(choice == 3) {
						
						System.out.println("잔고 >" + money);
						
						
						
					}
					
					
					
					
					else {
						
						System.out.println("정확한 숫자를 입력하세요");
						continue;

					}

				}
				
		
		

	}

}
