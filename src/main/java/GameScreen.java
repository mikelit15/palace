import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.ImageIO;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;

/**
 * The screen to welcome the user to the program
 * @author 
 *
 */
public class GameScreen extends AScreen
{
	public final int height = 400;
    public FlowPane handPane;
    public HashSet<CardView> cards = new HashSet<CardView>();


/**
 * A screen to welcome the user
 * @param view - the view component of MVC
 * @author 
 */
public GameScreen(View view) 
{
    super(view);
    Text title = new Text("Game");
    title.setFont(Font.font("veranda", FontWeight.BOLD, FontPosture.REGULAR, 80));
    title.setFill(Color.web("#dfae43"));
    TilePane pane= new TilePane(title);
    handPane = new FlowPane();
    pane.setOrientation(Orientation.VERTICAL);
    pane.setStyle("-fx-background-color: #228b22;");
    handPane.setStyle("-fx-background-color: transparent");
    borderPane.setCenter(pane);
    borderPane.setTop(topPane);
    borderPane.setStyle("-fx-background-color: #228b22;");
    borderPane.setCenter(handPane);
    importCards();
    
    }

    public void importCards()
    {
        cards = new HashSet<CardView>();
        Scanner sc = new Scanner(getClass().getResourceAsStream("cards.csv"));
		sc.useDelimiter("\n");
		while (sc.hasNext()) {
			String addingLine = sc.next();
			String name = addingLine.split(",")[0];
            String rank = addingLine.split(",")[1];
            String ID = addingLine.split(",")[2];
			String image = addingLine.split(",")[3];
            String garb = addingLine.split(",")[4];
			try {
				CardView addedCard = new CardView(this.view, ID, name, rank, image);
				cards.add(addedCard);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		sc.close();
    }

    public void updateScreen()
    {
        Iterator<Card> cardsInHand = view.getController().getPlayer().getHand().iterator();
        {
            while(cardsInHand.hasNext())
            {
                Card b = cardsInHand.next();
                Iterator<CardView> cardView = cards.iterator();
                {
                    while(cardView.hasNext())
                    {
                        CardView a = cardView.next();
                        if(a.getID() == b.getID())
                        {
                            handPane.getChildren().add(a.getImgView());
                        }
                    }
                }
            }
        }
    }
}
  
