package java_20240701.day03;

public class Practice {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		yaksu(30);
		System.out.println("==============================");
	//	cdyaksu(30,10);
		csbaesu();
		
		

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

	public static int csbaesu() {
		int c = 4;
		int s = 2;
		int cd = cdyaksu(c,s);
		
		int csbaesu = c * s / cd;
		
		return csbaesu;
		
		
		
	}
	
	
		
	}

	


