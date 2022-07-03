import java.util.*;
import java.util.function.ToLongFunction;
import java.math.*;
public class Deck
{
	Card card;
	Controller controller;
	public HashSet<Card> deck = new HashSet<Card>();
	public HashSet<Card> stack = new HashSet<Card>();
	public HashSet<Card> bomb = new HashSet<Card>();

	
	public Deck(Controller controller)
	{
		this.controller = controller;
	}

	/**
	 * Creates a new deck of 52 cards
	 * 
	 * @author Mike
	 * @return 
	 */
	public void setDeck()
	{
		deck = new HashSet<Card>();
		int x = 2;
		int y = 1;
		int z = 1;
		while (x < 15)
		{
			y = 1;
			while (y < 5)
			{
				if(y == 1)
				{
					deck.add(new Card(x, "Club", z));
				}
				else if (y == 2)
				{
					deck.add(new Card(x, "Spade", z));
				}
				else if (y == 3)
				{
					deck.add(new Card(x, "Heart", z));
				}
				else if (y == 4)
				{
					deck.add(new Card(x, "Diamond", z));
				}
				z++;
				y++;
			}
		x++;
		}
	}
	
	public HashSet<Card> getDeck()
	{
		return this.deck;
	}
	
	public HashSet<Card> getStack()
	{
		return stack;
	}

	public Card getTopOfStack()
	{
		Iterator<Card> top = stack.iterator();
		Card a = new Card(0, "0", 0);
		while(top.hasNext())
		{
			a = top.next();
		}
		return a;
	}

	public void setBombPile()
	{
		
	}
	
	public void shuffleDeck()
	{
		Random random = new Random();
		HashSet<Card> newDeck = new HashSet<Card>();
		int rand = random.nextInt(deck.size());
		Iterator<Card> randCard = deck.iterator();
		while(randCard.hasNext())
		{
			if(randCard.next().getID() == rand)
			{
				newDeck.add(randCard.next());
				randCard.remove();
			}
		}


	}
}
