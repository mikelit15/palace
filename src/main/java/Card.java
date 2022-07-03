import java.util.*;

/**
 * Holds the information for any given card in the model
 * @author Mike
 */

public class Card 
{
	public int rank;
	public String suit;
	public int ID;
	public String img;
	
	/**
	 * Object representing the data behind each card
	 * @param rank - the rank or number of the card
	 * @param suit - the suit of the card
	 * @author Mike
	 */
	
	public Card(int rank, String suit, int ID)
	{
		this.rank = rank;
		this.suit = suit;
		this.ID = ID;
	}
	
	/**
	 * Function to get the rank of a card
	 * @return integer representing the rank of the card
	 * @author Mike
	 */
	
	public int getRank()
	{
		return rank;
	}
	
	/**
	 * Function to get the suit of a card
	 * @return string representing the suit of the card
	 * @author Mike
	 */
	
	public String getSuit()
	{
		return suit;
	}
	
	public int getID()
	{
		return ID;
	}

	/**
	 * To string method to convert card into a string representing the rank and suit
	 * @param card - takes in a card to print out the rank and suit on one line
	 * @return string - representing the rank and suit of the card
	 * @author Mike
	 */
	
	public String toString(Card card)
	{
		return card.getRank() + " " + card.getSuit();
	}

	public boolean inDeck(HashSet<Card> deck, int checkID)
	{
		boolean x = false;
		Iterator<Card> card = deck.iterator();
		while(card.hasNext())
		{
			if(card.next().getID() == checkID)
			{
				x = true;
			}
			else
			{
				x = false;
			}
		}
		return x;
	}
}
