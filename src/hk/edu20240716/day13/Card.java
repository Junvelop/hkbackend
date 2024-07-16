package hk.edu20240716.day13;

public class Card {
	
	
	
	public static final String[] DECK = {"♠","◆","♥","♣"};
	public static final String[] STECK = {"A","2","3","4","5","6","7","8","9","T","J","Q","K"};
	
	//카드 한장의 대한 정보[ 그림 + 숫자 ]
	
	
	public Card() {
		// TODO Auto-generated constructor stub
		init(); // 실행되자마자 카드 한장 만들기
	}
	
	
	private String card; // "♥9" 이런 형식으로 구현될 거임 
	
	
	//은닉화 : 메서드를 통해 접근
	public String getCard() {
		
		return this.card;
	}
	
	
	//카드 한장 만드는 기능
	public void init() {
		
		int a = (int) (Math.random() * DECK.length); // 0부터 3까지 숫자를 랜덤하게 생성해서 저장: DECK의 인덱스를 의미 3.6666 이런것도 소수점이 짤려서 0으로 나옴
		int b = (int) (Math.random() * STECK.length); // 0부터 12까지의 숫자를 랜덤하게 생성하고 저장
		card = DECK[a] + STECK[b];
		
		
	}
	
	@Override
	public String toString() {
		return"["+card+"]";
	} // toString 오버라이딩 하기 원래 오브젝트 클래스에 있는 것임
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		boolean isS = false;
		Card ca = (Card)obj; // 카드객체를 오브젝트 형태로 받았기 때문에 쓸거면 다시 카드로 형을 변환해주어야 함
		if(card.equals(ca.getCard())) // 리스트의 카드와 매개변수로 들어온 카드를 비교 equals와 contains의 관계 
		{
			isS =true;
		}
		return isS;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return card.hashCode() + 137;
	}
	
	
	

}
