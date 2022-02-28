import java.util.HashSet;

public class Card 
{
	public String name;
	public int rank;
	public String suit;
	public static HashSet<Card> deck = new HashSet<Card>();

	public static void main(String args[])
	{
		setDeck();
		System.out.println("Hello");
		System.out.print(getDeck());
	}
	
	public Card(String name, int rank, String suit)
	{
		this.name = name;
		this.rank = rank;
		this.suit = suit;
	}
	
	public String getName()
	{
		return name;
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
		int w;
		int x;
		int y;
		for(w = 1; w < 53; w++)
		{
			for(x = 1; x < 15; x++)
			{
				for(y = 1; y < 5; y++)
				{
					if (x < 11)
					{
						switch(y)
						{
							case 1:
							{
								deck.add(new Card(Integer.toString(y), x, "Club"));
							}
							case 2:
							{
								deck.add(new Card(Integer.toString(y), x, "Spade"));
							}
							case 3:
							{
								deck.add(new Card(Integer.toString(y), x, "Heart"));
							}
							case 4:
							{
								deck.add(new Card(Integer.toString(y), x, "Diamond"));
							}
						}
					}
					else
					{
						String i = "";
						if (x == 11)
						{
							i = "Jack";
						}
						else if (x == 12)
						{
							i = "Queen";
						}
						else if (x == 13)
						{
							i = "King";
						}
						else if (x == 14)
						{
							i = "Ace";
						}
						switch(y)
						{
							case 1:
							{
								deck.add(new Card(i, x, "Club"));
							}
							case 2:
							{
								deck.add(new Card(i, x, "Spade"));
							}
							case 3:
							{
								deck.add(new Card(i, x, "Heart"));
							}
							case 4:
							{
								deck.add(new Card(i, x, "Diamond"));
							}
						}
					}
				}
			}
		}
	}
	
	public static HashSet<Card> getDeck()
	{
		return deck;
	}
	
}
