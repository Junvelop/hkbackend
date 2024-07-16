package java_20240628.day02;

public class D2_isLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =2001; i <= 2030; i++) {
	//	int y= 2024;
		
	//	if( (i % 4 == 0 && i % 100 != 00) || i % 400 == 0 ) {
		if(isLeapYear(i))
			System.out.println(i + "는 윤년이다");
		}}
		
		
		

	

		
	
	
	
	//윤년을 판단하는 메서드 : 트루 / 펄스 

    public static boolean isLeapYear(int i){
    	
    	boolean hi = false;
    	
    	if( ( i % 4 == 0 && i % 100 != 00) || i % 400 == 0 )
    		hi = true;
    	
    	return hi;
    	
    }}
    
	
