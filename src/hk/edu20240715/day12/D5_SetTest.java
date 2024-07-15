package hk.edu20240715.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D5_SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		set.add("건");
		set.add("양");
		set.add("대");
		set.add("학");
		set.add("교");
		set.add("교"); //중복 된 값은 들어갈 수 없음 
		
		
		Iterator iter = set.iterator(); //HashSet 클래스에 iterator()가 있음 
		while(iter.hasNext()) { //hasNext()는 Set에 값이 존재하는지 확인
			String str =(String)iter.next();//값을 꺼낸다
			System.out.print(str+" ");
		}

	}

}
