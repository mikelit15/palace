import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javafx.scene.input.MouseEvent;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CardView 
{
    int IDs;
    String name;
    int ranks;
    Image Img;
    ImageView iv;

    public CardView(View view, String names, String ranks, String imgs) throws IOException
    {
        iv = new ImageView();
        this.name = names;
        this.ranks = Integer.parseInt(ranks);
        this.Img = new Image(new File(imgs).toURI().toString());
        iv.setImage(Img);
        // iv.setOnMouseClicked(view.getController().getHandlerForClick(rank, name));
    }

    public CardView(View view, String ID, String name, String rank, String img) throws IOException
    {
        iv = new ImageView();
        this.IDs = Integer.parseInt(ID);
        this.name = name;
        this.ranks = Integer.parseInt(rank);
        this.Img = new Image(getClass().getClassLoader().getResourceAsStream(img));
        iv.setImage(Img);
        this.iv.setOnMouseClicked(view.getController().getHandlerForClick(IDs, ranks, name));
    }

    public int getID()
    {
        return this.IDs;
    }

    public Image getImg()
    {
        return Img;
    }

    public ImageView getImgView()
    {
        return iv;
    }
}
