import java.util.HashSet;
import java.util.Optional;

import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AScreen 
{
    BigButton Start;
    BigButton Play;
    BigButton Game;
    BigButton Exit;
    BorderPane borderPane;
    View view;
	Controller controller;
	TilePane topPane;

    public AScreen(View view)
    {
        this.view = view;
        borderPane = new BorderPane();
        Start = new BigButton("Home");
        Play = new BigButton("Play");
        Game = new BigButton("Continue");
        Exit = new BigButton("Exit");

        Start.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) 
			{
				view.background = Screens.START;
				view.updateView();
			}
		});
        Play.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				view.background = Screens.SETTINGS;
				view.updateView();
			}
		});
        Game.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				view.background = Screens.GAME;
				view.updateView();
			}
		});
        Exit.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				System.exit(0);
			}
		});
        topPane = new TilePane(Start, Play, Game,Exit);
        Exit.setAlignment(Pos.BASELINE_RIGHT);
        topPane.setStyle("-fx-background-color: #a5550d;");
        borderPane.setTop(topPane);
    }

    public BorderPane getBorderPane() {
		return borderPane;
	}
}
