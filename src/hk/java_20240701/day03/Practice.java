package java_20240701.day03;

public class Practice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yaksu(30);
		System.out.println("==============================");
		cdyaksu(30,10);
		
		csbaesu(4,2);
		greateDivisor(30,10);
		perfectNum(1,10000);
		amicalbe(1, 10000);
		
		

	}
	
	public static void yaksu(int num) {
		
		
		
		for(int i =1; i <num; i++) {
			if(num % i ==0) {
				System.out.println((i == num)?i :i + " ,");
				
			}
			
		}
	}
		
		
	public static int cdyaksu(int max, int min) {
		
		int a;
		
		for(;max!=min;) {
		
			if(max > min) {
				
				max = max - min;}
				
			else 
				{System.out.println("으하하");}
	
				
			}
		System.out.println(max);
		
		return max;
		
		}
	
	//teacher
	public static void greateDivisor(int a, int b) {
		
		int tempA=a;//원본값 저장
		int tempB=b;
		
		
		
		while(true) { //언제 끝날지 모르니까 while 문이 유리함
			if(a > b) {
				
				a = a -b;
			}
			
			if(b > a) {
				
				b= b- a;
				
			}
			
			if( a == b) { //while문을 종료하는 코드 
				break;
			}
			
			System.out.println("최대공약수는" + a+ "입니다");
			
			
		}
		
		
		
		
	}
	
	
	

	public static void csbaesu(int a, int b) {
		
		int cd = cdyaksu(a,b);
		
		int csbaesu = a * b / cd;
		
		System.out.printf("%d와 %d의 최소공배수는 %d이다.\n", a, b, csbaesu);

		
		
		
	}
	
	
	//친화수 구하기
	// 220 == (
	public static void amicalbe (int s, int e) {
		for (int i = 0; i < e; i++) {
			if(i!=sumDivisor(i) && i==sumDivisor(sumDivisor(i))) {
				System.out.println(i + ":" + sumDivisor(i) + "는 친화수입니다");
				
			}
			
		}
	}
	
	//진약수의 합 구하기
	public static int sumDivisor(int a) {
		
		int sum =0;
		for (int i =1; i < a; i++) {
			if(a%i == 0) {
				sum += i;
				
			}
		}
		return sum;
	}
	
	
	// 완전수를 구하는 메서드 : 진약수의 합과 자신의 수가 같은 경우
	
	public static void perfectNum(int s, int e) {
		for(int i = s; i < e; i++) {
			
			if(i == sumDivisor(i)) {
				System.out.println(i + "는 완전수입니다.");
			}
		}
	}
	
		
	}

	


