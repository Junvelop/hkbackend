package hk.edu20240715.day12;

import java.util.HashMap; // 맵을 구현한 클래스
import java.util.Iterator; // 인터페이스 
import java.util.Map; // 인터페이스
import java.util.Set; // 인터페이스 

public class D5_MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바 스크립트로 치면 제이슨 객체와 비슷한 구조 : 키와 밸류 저장
		Map<String,String> map = new HashMap<>();
		map.put("하나","한경");
		map.put("둘", "닷컴");
		
		System.out.println("Map의 값 : " + " " + map.get("하나"));
		Set<String> setKeyMap = map.keySet(); //key 값만 set으로 반환 
		Iterator<String> iterKeyMap = setKeyMap.iterator(); //이터레이터 메서드는 이터키맵이라는 객체가 맵을 순회할 수 있게 만들어줌 
		while(iterKeyMap.hasNext()) {
			
			String str = iterKeyMap.next();
			System.out.println(map.get(str));
			
			
		}
		
				

	}

}
