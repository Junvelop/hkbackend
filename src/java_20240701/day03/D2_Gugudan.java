package java_20240701.day03;

public class D2_Gugudan {
	
	
	public static void main(String[] args) {
		
		/*for (int i = 2; i <=9; i++) { // 구구단 출력
			
			for (int j = 1; j <= 9; j++) {
				
				System.out.println(j +"*" + i + "=" + (j * i));
				
			}*/
			
			
		/*	for (int i = 2; i <=9; i++) { // 짝수단만 출력 
				
				if(i % 2 ==0)
				
				for (int j = 1; j <= 9; j++) {
					
					System.out.println(i +"*" + j + "=" + (j * i));
					
				}
			
			
		}
			
		*/
		
		/* int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 == 0)
			
			sum += i;
			
		}
		
		System.out.println(sum);
		
		
		

	}*/ 
		
		
		
		
	       /*주사위 두개의 합이 5이상이면 실행을 멈추고, 5가 아니면 계속 실행하는 코드를 작성하자 
         * 실행결과 출력하기 : (2,5) (1,3) (4,3)..
         * 1~6까지의 숫자로 구성되며 프로그램상에서는 랜덤하게 숫자가 생성되도록 해야함
         * Math 객체에서 random()메서드를 사용하면 랜덤한 숫자를 얻을 수 있음
         */
        /*int number = (int)Math.random();
        System.out.println("랜덤숫자생성" + number);
        //우리가 필요한 숫자는 1~6
        number=(int)(Math.random()*6+1);//0~1사이 *6 1*6=6
                                        //5.9999999+1 =6.999999999..
        */
        while(true) {
           int num1=(int)(Math.random()*6+1);
            int num2=(int)(Math.random()*6+1);
            System.out.printf("(%d,%d)\n",num1,num2);
            if(num1+num2==5) {
               System.out.println("합이 5가되어 종료");
               break;
            }
        }
	
	

	
/*	for (int i = 1; i <=9; i++) {
		
		System.out.println("2 x" + i + "=" + (2 * i) );
		System.out.printf("2x%d=%d\n", i, (2 * i)); // 역슬래시 n은 줄바꿈임
	} */
	
	
	}
}

