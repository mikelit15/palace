import java.util.*;

public class Main 
{
	public static void main(String args[])
	{
		HashSet<Card> hand = new HashSet<Card>();
		Card.main(args);
		
		HashSet<Card> deck = Card.getDeck();
		Iterator<Card> cards = deck.iterator();		
	
		if(!deck.isEmpty()) {
			for(int i = 0; i < 6; i++) {
				if(cards.hasNext())
					hand.add(cards.next());
			}
		}
		
		System.out.println("Hand: ");
		Iterator<Card> cardsInHand = hand.iterator();		
		while(cardsInHand.hasNext())
		{
			Card h = cardsInHand.next();
			System.out.println(h.getRank() + " " + h.getSuit());
		}
		
	}
}