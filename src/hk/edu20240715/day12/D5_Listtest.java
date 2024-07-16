package hk.edu20240715.day12;

import java.util.ArrayList; // 얘는 클래스 ( 리스트를 구현한 ) 
import java.util.List; // 얘는 인텊에스

public class D5_Listtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제네릭 : 형변환을 미리 해주는 개념이다. 여기선 스트링이 제네릭임) 그래서 스트링 형태만 담을 수 있음
		List<String> list = new ArrayList<>();
		list.add("한"); // 값을 저장하면 자동으로 저장공간과 인덱스가 생성
		list.add("경");
		list.add("닷");
		list.add("컴"); // 스트링 타입이기 때문에 한가지 타입 (스트링 타입)만 들어감
		
		for (int i = 0; i < list.size(); i++) {
			
			
			System.out.println(list.get(i) + ""); // 미리 저장하는 값의 타입으로 형변환했기 때문에 바로 담김 
			
		}
		
		list.remove(0); // 특정 인덱스에 값을 삭제 
		list.clear(); // 모두 삭제
		
		System.out.println("list의 길이값 : " + list.size());
		
		

	}

}
