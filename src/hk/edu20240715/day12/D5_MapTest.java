package hk.edu20240715.day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D5_MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자바 스크립트로 치면 제이슨 객체와 비슷한 구조 : 키와 밸류 저장
		Map<String,String> map = new HashMap<>();
		map.put("하나","한경");
		map.put("둘", "닷컴");
		
		System.out.println("Map의 값 : " + " " + map.get("하나"));
		Set<String> setKeyMap = map.keySet(); //key 값만 set으로 반환 
		Iterator<String> iterKeyMap = setKeyMap.iterator();
		while(iterKeyMap.hasNext()) {
			
			String str = iterKeyMap.next();
			System.out.println(map.get(str));
			
			
		}
		
				

	}

}
