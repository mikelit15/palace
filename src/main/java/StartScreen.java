import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.geometry.Orientation;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;

/**
 * The screen to welcome the user to the program
 * @author 
 *
 */
public class StartScreen extends AScreen
{
	public final int height = 400;
/**
 * A screen to welcome the user
 * @param view - the view component of MVC
 * @author 
 */
public StartScreen(View view) 
{
    super(view);

    Text title = new Text("Palace");
    title.setFont(Font.font("veranda", FontWeight.BOLD, FontPosture.REGULAR, 80));
    title.setFill(Color.web("#dfae43"));
    TilePane pane= new TilePane(title);
    
    pane.setOrientation(Orientation.VERTICAL);
    pane.setStyle("-fx-background-color: #228b22;");
    borderPane.setCenter(pane);
    borderPane.setTop(topPane);

    borderPane.setStyle("-fx-background-color: #228b22;");

    this.view = view;
    
    }
}
  
