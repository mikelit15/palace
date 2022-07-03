import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.effect.DropShadow;

public class Controller 
{
	Model model;
	Player player1;
	Player player2;
	Deck deck;
	View view;
	public HashSet<Card> playDeck = new HashSet<Card>();
	public ArrayList<Integer> stackRank = new ArrayList<Integer>();
	public HashSet<Card> stackCards = new HashSet<Card>();
	public HashSet<Player> players = new HashSet<Player>();



	public Controller(View view)
	{
		this.view = view;
		this.deck = new Deck(this);
		this.player1 = new Player(this, this.deck, 1);
		this.player2 = new Player(this, this.deck, 2);
		players.add(player1);
		players.add(player2);
	}
	
	public void strategy()
	{
		// Stage addedStage = new Stage();
		// Text instructions = new Text("Choose your 3 top cards.");
		// for(int clickCount = 0; clickCount < 3; clickCount++)
		// {
		// 	getHandlerForClick(rank, name)
		// }
		
		// Iterator<Card> cardsInHands = player1.getHand().iterator();
		// HashSet<Card> newHand = new HashSet<Card>();
		// while(cardsInHands.hasNext())
		// {
		// 	Card h = cardsInHands.next();
		// 	if(h.toString(h).equals(choosenCard1))
		// 	{
		// 		player1.top.add(h);
		// 	}
		// 	else if(h.toString(h).equals(choosenCard2))
		// 	{
		// 		player1.top.add(h);
		// 	}
		// 	else if(h.toString(h).equals(choosenCard3))
		// 	{
		// 		player1.top.add(h);
		// 	}
		// 	else
		// 	{
		// 		newHand.add(h);
		// 	}
		// }
		// player1.hand = newHand;
		// System.out.println("\ntop " + player1.getTop());
		// System.out.println("hand " + player1.getHand());
		// System.out.println("bottom " + player1.getBottom());
	}
	
	public void draw()
	{
		boolean drawFlag = false;
		Random random = new Random();
		int rand = random.nextInt(deck.getDeck().size());
		Iterator<Card> randCard = deck.getDeck().iterator();
		while(!drawFlag)
		{
			if(randCard.next().getID() == rand)
			{
				player1.getHand().add(randCard.next());
				randCard.remove();
				drawFlag = true;
			}
		}
	}

	public void deal(HashSet<Card> deck)
	{
		Iterator<Player> allPlayers = players.iterator();
		while(allPlayers.hasNext())
		{
			Player currPlayer = allPlayers.next();
			Iterator<Card> cards = deck.iterator();
			for(int j = 0; j < 3; j++)
			{
				currPlayer.setBottom(cards.next());
				cards.remove();
			}		
			for(int i = 0; i < 6; i++) 
			{
				currPlayer.setHand(cards.next());
				cards.remove();
			}
			System.out.println("\n" + currPlayer.getID() + "s Hand: ");
			Iterator<Card> cardsInHand = currPlayer.getHand().iterator();		
			while(cardsInHand.hasNext())
			{
				Card h = cardsInHand.next();
				System.out.println(h.getID() + " " + h.getRank() + " " + h.getSuit());
			}
			System.out.println("\n" + currPlayer.getID() + "s Bottom: ");
			Iterator<Card> cardsOnBottom = currPlayer.getBottom().iterator();		
			while(cardsOnBottom.hasNext())
			{
				Card h = cardsOnBottom.next();
				System.out.println(h.getID() + " " + h.getRank() + " " + h.getSuit());
			}
		}
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

	public void chooseFirst()
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

	public EventHandler getHandlerForClick(int ID, int rank, String name) {
        return event -> Click((MouseEvent) event, ID, rank, name);
    }
    
    /**
     * Removes a plant when a plant is right-clicked on the addScreen
     * @param event - the click which triggered the event
     * @param name - the name of the plant
     * @author Mike
     */
    public void Click(MouseEvent event, int ID, int rank, String name) {
    	if(event.getButton() == MouseButton.PRIMARY)
    	{
			// Iterator<Card> cards = deck.getDeck().iterator();
    		// if(deck.stack.isEmpty())
			// {

			// }
			// else
			// {
			// 	if(player1.canPlace(rank, name))
			// 	{
			// 		// view.updateScreen();
			// 		// player1.updateHand();
			// 	}
			// 	else
			// 	{
			// 		System.out.println("Can't place that card");
			// 	}
			// }
			System.out.println(rank + " " + name);
    	}
    }

	public void startGame()
	{
		player1.clearTable();
		view.gameScreen.handPane.getChildren().clear();
		deck.setDeck();
		deck.shuffleDeck();
		deal(deck.getDeck());
		// strategy();
		// chooseFirst();
		view.gameScreen.updateScreen();

	}

	public Player getPlayer()
	{
		return player1;
	}

}