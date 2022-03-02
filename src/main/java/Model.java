import java.util.*;

/**
 * Model component of MVC
 * @author Mike
 */

public class Model 
{
	Deck deck;
	HashSet<Card> playDeck = new HashSet<Card>();
	Card card;
	Player player;
	Controller controller;
	
	public Model(Controller controller)
	{
		this.controller = controller;
	}
	
	public Controller getController()
	{
		return this.controller;
	}
	
	public HashSet<Card> getPlayDeck()
	{
		return playDeck;
	}
	
}
