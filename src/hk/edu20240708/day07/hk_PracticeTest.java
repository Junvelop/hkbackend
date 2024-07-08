package hk.edu20240708.day07;

public class hk_PracticeTest {
	
	
	//예제:
	//문자열에서 해당 검색어가 존재하는지 판단하여 존재한다면 해당 검색어를 추출하여
	//출력하고, "###"으로 변경하여 처리하고, 계속 검색어가 존재하는지 확인하여
	//앞에 작업을 진행한다.
	// 
	//1.해당 검색어가 존재하는 여부 판단해보기,해당검색어가 없으면 "검색어가 존재하지 않습니다."출력
	//2.해당 검색어의 인덱스를 구해보기: 검색어 인덱스 출력하기
	//3.해당 검색어를 추출해서 출력해보기: substring()을 사용해서 추출한뒤  출력하기
	//4.해당 검색어를 문자열에서 ###으로 바꿔주기
	//5.해당 검색어의 검색된 개수 출력하기[indexOf(idx,검색시작인덱스)]
	
	public void search(String str) {
		String s= "SK텔레콤이 싱가포르 1위 통신사 싱텔(Singtel)과 차세대 통신 네트워크 기술 협력을 위한 양해각서(MOU)를 체결했다고 8일 밝혔다.\r\n"
				+ "\r\n"
				+ "두 통신사는 글로벌 주요 통신사들의 인공지능(AI) 연합인 '글로벌 텔코 AI 얼라이언스'의 창립 회원사로서 협력을 약속했다.\r\n"
				+ "\r\n"
				+ "양사는 4G·5G 기술 노하우를 바탕으로 고객 경험 향상과 네트워크 안정성·효율성을 동시에 개선할 계획이다. 이를 위해 이동통신 네트워크 엔지니어링·구축·운용·설루션 등 다양한 상용망 분야에서 기술 논의와 인력 교류를 추진한다.\r\n"
				+ "\r\n"
				+ "아울러 에지 AI 인프라 적용과 코어망 운용 기술 연구, 네트워크 슬라이싱(맞춤형 서비스를 위해 코어네트워크를 독립된 여러 가상 네트워크로 분리하는 기술) 등 5G 유무선 이동통신망 진화 기술 전략, 6G 적용 사례 개발 등 분야에서 협력할 예정이다.";
	
        if (s.indexOf("네트워크") != -1) {
            System.out.println("네트워크라는 단어가 존재합니다");
        }
        
        int num = s.indexOf("네트워크");
        System.out.println(num);
        
        String st = s.substring(39, 44);
        
        System.out.println(st);
        
	
	
	}
	
	public void replace() {
		
		String s = "안녕 결국 돌고도는 건가봐 아마도 좋은 아버지가 되겠다고 다짐했건만 더 나아진 것도 없어 자신했건만";
		s.replace("안녕", "바이");
		s =  s.replace("안녕", "##"); //이렇게 다시 대입을 해야 변화가 됨 리터럴은 변하지 않기 때문에
		System.out.println(s);
	}
	
	public void searchCount(String target) {
	    String s = "지긋지긋지긋 해 삐끗삐끗 삐끗해 꺼진 니 전화기에 니 집 앞 편지함엔 난 아직도 그대 여전히 함께하잔 그말들 잠깐의 달콤함뿐이라고";
	//    String target = "삐끗";
	    int count = 0;
	    int index = 0;

	    // 문자열 s에서 target을 찾을 때까지 반복
	    while ((index = s.indexOf(target, index)) != -1) {
	        count++;  // 찾으면 카운트 증가
	        index += target.length();  // 다음 인덱스 설정
	    }

	    System.out.println(target + "의 개수: " + count);
	}

	

}
