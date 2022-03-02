import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.effect.DropShadow;

public class Controller 
{
	Model model;
	//View view
	public HashSet<Card> playDeck = new HashSet<Card>();
	public ArrayList<Integer> stackRank = new ArrayList<Integer>();
	public HashSet<Card> stackCards = new HashSet<Card>();



	public Controller()
	{
		this.model = new Model(this);
	}
	
	public void main(String args[])
	{

	}
	
	public void start()
	{
		this.playDeck = model.getPlayDeck();
		deal();
		strategy();
	}
	
	public void deal()
	{
		//deck.shuffleDeck();
		playDeck = model.getPlayDeck();
		for(int x = 0; x < 7; x++)
		{
			model.player.setHand(model.deck.draw(playDeck));
		}
	}
	
	public void strategy()
	{
		
	}
	
	public void CPU()
	{
		
	}
	
	public void bomb()
	{
		stackCards.clear();
		stackRank.clear();
	}
	
	public void pickUp()
	{
		
	}
	
	public void place()
	{
		
	}
	
	public void setStack(Card card)
	{
		stackCards.add(card);
		stackRank.add(card.getRank());
	}
	
	public int getStackRank()
	{
		return stackRank.lastIndexOf(stackRank);
	}
	
	public HashSet<Card> getStackCards()
	{
		return stackCards;
	}
	
	public void winner()
	{
		
	}

}