import java.util.HashSet;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.application.Application;
import javafx.scene.shape.Circle;

public class View extends Application
{

    public Screens background;
	Controller controller = new Controller(this);

	StartScreen startScreen = new StartScreen(this);
	SettingsScreen settingsScreen = new SettingsScreen(this);
	GameScreen gameScreen = new GameScreen(this);

    BorderPane bp = new BorderPane();
	final double width = 1500;
	final double height = 800;
    Stage stage = new Stage();
	Scene scene = new Scene(bp, width, height);

    public View()
    {
        this.background = Screens.START;
    }

    public void updateView()
    {
        stage.setScene(scene);
        switch(background)
        {
            case START:
				scene.setRoot(startScreen.getBorderPane());
				stage.show();
				break;
			case SETTINGS:
				scene.setRoot(settingsScreen.getBorderPane());
				stage.show();
				break;
			case GAME:
				scene.setRoot(gameScreen.getBorderPane());
				stage.show();
				getController().startGame();
				break;
        }
    }

    /**
	 * Main for the program
	 * @param args
	 * @author 
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Overrides the start method to bring up a screen with the application running
	 * 
	 * @param stage - the stage to be used
	 * @author 
	 */
	@Override
	public void start(Stage stage) 
	{
		updateView();
	}

	public Controller getController()
	{
		return controller;
	}

}
