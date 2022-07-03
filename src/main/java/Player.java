import java.util.*;

import javafx.scene.Node;
import javafx.scene.input.MouseEvent;

public class Player 
{
	public Deck deck;
	Controller controller;
	public int ID;
	public HashSet<Card> hand = new HashSet<Card>();
	public HashSet<Card> top = new HashSet<Card>();
	public HashSet<Card> bottom = new HashSet<Card>();

	public Player(Controller controller, Deck deck, int ID)
	{
		this.controller = controller;
		this.deck = deck;
		this.ID = ID;
	}

	public String getID()
	{
		return "Player " + String.valueOf(ID);
	}

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

	public void setTop(Card card)
	{
		this.top.add(card);
	}

	public void setBottom(Card card)
	{
		this.bottom.add(card);
	}
	
	public boolean canPlace(int rank, String name)
	{
		boolean a = false;
		if(rank >= deck.getTopOfStack().getRank())
		{
			a = true;
		}
		return a;
	}

	public void clearTable()
	{
		this.hand = new HashSet<Card>();
		this.top = new HashSet<Card>();
		this.bottom = new HashSet<Card>();
	}

	public void updateHand(MouseEvent event)
	{

	}
	
	public boolean inHand(String card)
	{
		boolean x = false;
		Iterator<Card> inHand = getHand().iterator();
		while(inHand.hasNext())
		{
			Card h = inHand.next();
			if(h.toString(h).equals(card))
			{
				x = true;
			}
		}
		return x;
	}

	public Controller getController()
	{
		return this.controller;
	}
}
