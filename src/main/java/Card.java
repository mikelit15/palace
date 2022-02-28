import java.util.*;

public class Card 
{
	public int rank;
	public String suit;
	public static HashSet<Card> deck = new HashSet<Card>();

	public static void main(String args[])
	{
		Card h;
		setDeck();
		Iterator<Card> cards = deck.iterator();
		while(cards.hasNext())
		{
			h = cards.next();
			System.out.println(h.getRank() + " " + h.getSuit());
		}
	}
	
	public Card(int rank, String suit)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	public int getRank()
	{
		return rank;
	}
	
	public String getSuit()
	{
		return suit;
	}
	
	public static void setDeck()
	{
		int x = 2;
		int y = 1;

		while (x < 14)
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
	}

	public static HashSet<Card> getDeck()
	{
		return deck;
	}
	
	public static HashSet<Card> shuffleDeck()
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
}
