import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

class ControllerTest 
{
	Controller controller = new Controller();
	Model model = new Model(controller);
	Deck deck;
	Card card;
	@Test
	void test() 
	{
		System.out.println(model.player.getHand());
//		controller.playDeck = deck.setDeck();
		controller.deal();
		System.out.println(model.player.getHand());
	}

}
