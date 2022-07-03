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


public class SettingsScreen extends AScreen
{
    public SettingsScreen(View view) 
    {
        super(view);
    
        Text title = new Text("Settings");
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
