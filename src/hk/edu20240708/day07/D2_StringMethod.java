package hk.edu20240708.day07;

public class D2_StringMethod {

    // String 주요 메서드 연습

    // 1. 문자 하나를 반환
    // 문자열에서 문자를 추출 --> "문자열" -> "문"(char 타입 변환)
    // 지원기능 : charAt(index)
    public String sTest01(String s, int ii) {
        char c = s.charAt(ii);
        String ss  = c + ""; // 문자열 + 아무거나 = 다 문자열로 인식이 되기 때문에 이렇게 할 수도 있음
        String ss2 = String.valueOf(c); // 클래스. 메서드로 부르고 있음 -> 스태틱이라 그럼 컨트롤 스페이스 누르면 빨간색 s가 스태틱이란 표시임
        // String.valueof(c)는 c를 문자열로 변환하겠다는 것임
        // 위에 두 개 중 아무거나 쓰면 됨
        
        int i = Integer.parseInt("100"); // 클래스 명. 메서드 -> 아 스태틱이구나
                                         // "100" 이런 것(숫자인데 문자열 형식으로 되어있는 것)만 바꿀 수 있음 진짜 문자열은 못 바꿈
        
        return ss;
    }

    // 2. 문자열의 인덱스를 반환하는 indexOf();
    // "ABCD" 문자열에서 
    // "ABCD".indexOf("B") ---> 반환값은 1 (인덱스 값)
    // "ABCD".indexOf("E") ---> 반환값은 -1 (존재하지 않음을 나타냄) (인덱스 값이 아니라)
    
    // "ABCD".indexOf("BC") ---> 반환값은 1 (해당 문자열의 첫번째 인덱스를 반환함)  
    // 종류 : indexOf(): 앞에서부터 검색, lastIndexOf(): 문자열의 끝부터 검색

    public String sTest2(String s) { // s = "선재 업고 튀어";
        int num1 = s.indexOf("선");
        int num2 = s.indexOf("업고");
        int num3 = s.lastIndexOf("튀어"); // 성능을 고려했을 때 뒤에서부터 찾는 게 유리함 예를 들어 HTML에서 .</body>
        
        // 존재하지 않는다면 -1을 리턴함
        if (s.indexOf("업고") != -1) {
            System.out.println("업고라는 단어가 존재합니다");
        }
        
        return num1 + "." + num2 + "," + num3;
    }
    
    //3. 문자열 길이 반환
    public int sTest03(String s) {
    return s.length();}
    
    //4. 문자열의 내용 변환 : replace("원본", "새로운 내용")
    public void sTest04() {
    	
    	String s = "자바프로그래밍";
    		   s.replace("자바","c#"); //원본 바뀌는게 아님 즉 자바프로그래밍이 없어지는 게 아님 immutable 하기 떄문에 밑에처럼 해야 함 
    		   s =s.replace("자바","c#"); // 결과를 새로 대입해야 적용된다.  // 새로운 문자열 객체를 생성하고, 그 결과를 s에 다시 대입  s의 값이 변경된 것처럼 보이지만, 실제로는 새로운 문자열 객체를 참조하게 된 것입니다.
    	System.out.println(s);
    }
    
    //5. 문자열 추출하기 : substring()
    //substring(int index) : 해당 index부터 끝까지 추출
    //substring(int s, int e) : 시작 인덱스부터 마지막 인덱스 -1번째까지 추출한다 .
    
    public String sTest05(String s) {
    	
    	String ss = s.substring(2);
    	String sss = s.substring(0,3); //0부터 2번째까지
    	return ss + ":" + sss;
    }
    
}
