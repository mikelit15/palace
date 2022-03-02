import java.util.*;
import java.math.*;
public class Deck
{
	Card card;
	public HashSet<Card> deck = new HashSet<Card>();
	
	public static void main(String args[])
	{

	}
	
	/**
	 * Creates a new deck of 52 cards
	 * 
	 * @author Mike
	 * @return 
	 */
	public
	HashSet<Card> setDeck()
	{
		int x = 2;
		int y = 1;

		while (x < 15)
		{
			y = 1;
			while (y < 5)
			{
				if(y == 1)
				{
					deck.add(new Card(x, "Club"));
				}
				else if (y == 2)
				{
					deck.add(new Card(x, "Spade"));
				}
				else if (y == 3)
				{
					deck.add(new Card(x, "Heart"));
				}
				else if (y == 4)
				{
					deck.add(new Card(x, "Diamond"));
				}
			y++;
			}
		x++;
		}
		return deck;
	}
	
	public HashSet<Card> getDeck()
	{
		return deck;
	}
	
	public void setBombPile()
	{
		
	}
	
	public HashSet<Card> shuffleDeck()
	{
		int x = 0;
		while(x < 53)
		{
			HashSet<Card> shuffled = new HashSet<Card>();
			for(int y = 0; y < deck.size(); y++)
			{
				
			}
		}
		return deck;
	}
	
	public Card draw(HashSet<Card> decks)
	{
		int x = 0;
		Card y = new Card(0, "0");
		Random random = new Random();
		int rand = random.nextInt(decks.size());
		Iterator<Card> randCard = decks.iterator();
		while(randCard.hasNext())
		{
			if(x == rand)
			{
				y = randCard.next();
				x = 0;
				decks.remove(y);
				break;
			}
			y = randCard.next();
			x++;
		}
		return y;
	}
}
