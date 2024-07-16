package hk.edu20240716.day13;

import java.util.ArrayList;
import java.util.List;

//카드 52장을 나타내는 클래스

public class CardCase {
	
	//카드 52장을 저장할 맴버필드
	private List<Card> cards;
	
	private static final int NUMOFCARDS = Card.DECK.length * Card.STECK.length;
	
	public CardCase() {
		cards = new ArrayList<Card>();
	}
	
	//카드 객체를 생성해서 cards에 담아줄 메서드
	
	public void shuffle() {
		
		int i = 0;
		while(true) {
			Card cc = new Card(); // 카드 한장 만들기
			
			if(!cards.contains(cc)) {
				cards.add(cc); // 카드 한장 넣기
				i++;
				
			}
			
			cards.add(cc);
			i++;
			
			if(i==NUMOFCARDS) {
				break;
			}
		}
		
		
	}
	
	public List<Card> getCards(){
		
		return cards;
	}

}
