package hk.edu20240703.day05;

public class D1_ClassTest {

    // 멤버 필드: 클래스에 저장해서 사용하는 변수
    public int number; // 인스턴스 변수 -> 인스턴스화 되어야만 사용 가능
    public static int staticNumber; // 클래스 변수 -> 스태틱 메모리에 올라가 바로 사용 가능

    // 기본 생성자: default 생성자라고 함, 파라미터 없음, 생략 가능, 클래스의 초기화 작업을 수행
    public D1_ClassTest() {
        // TODO Auto-generated constructor stub
        super(); // super라는 단어는 부모클래스를 의미함 -> 여기서처럼 ()가 붙으면 부모의 생성자를 의미함.
        this.number = 5; // 초기값 설정할 수 있다. this는 현재 클래스를 의미함.
        System.out.println("default 생성자가 실행됨");
    }

    // 파라미터가 있는 생성자
    public D1_ClassTest(int a) {
        this.number = a;
        System.out.println("파라미터가 있는 생성자가 실행됨");
    }

    // 메서드: 기능 구현
    // 호출 시에는 객체명.메서드이름()
    public void methodTest() {
        System.out.println("클래스 내부에 기능을 정의한다: 메서드 ");
    }

    // 호출법: 클래스명.메서드 -> 스태틱 붙은 거 정적 메서드
    public static void staticmethodTest() {
        System.out.println("static 메모리에 이미 생성돼서 사용할 수 있는 메서드 ");
    }
}
