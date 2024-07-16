package hk.edu20240716.day13;

import java.util.List;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Card card = new Card();
	//	System.out.println(card);
		
		
		CardCase cardCase = new CardCase();
		cardCase.shuffle();
		List<Card> cards = cardCase.getCards();
		
		for (int i = 0; i < cards.size(); i++) {
			
			System.out.print(cards.get(i) + "\t");
			
			//10장씩 줄바꿔서 출력하기
			if((i +1) % 10 == 0) {
				System.out.println();
			}
		}
		

	}
	


}
