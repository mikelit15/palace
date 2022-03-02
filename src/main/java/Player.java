import java.util.*;

public class Player 
{
	public Card card;
	public HashSet<Card> hand = new HashSet<Card>();
	public HashSet<Card> top = new HashSet<Card>();
	public HashSet<Card> bottom = new HashSet<Card>();

	
	public void resetHand()
	{
		
	}
	
	public void top()
	{
		
	}
	
	public void bottom()
	{
		
	}
	
	public HashSet<Card> getTop()
	{
		return top;
	}
	
	public HashSet<Card> getBottom()
	{
		return bottom;
	}
	
	public HashSet<Card> getHand()
	{
		return hand;
	}
	
	public void setHand(Card card)
	{
		this.hand.add(card);
	}
	
	public boolean canPlace()
	{
		if(hand.contains(card.getRank()))
		{
			
		}
		return true;
	}
	
}
