import javax.swing.*;
import java.awt.*;

public class Game {

    public JFrame mainFrame;
    public JPanel jPanel;


    public Game() {
        mainFrame = new JFrame("Hangman");
        frame();
    }

    public void frame(){
        mainFrame.setVisible(true);
        mainFrame.setSize(500, 300);
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void panel (){
        jPanel = new JPanel(new BorderLayout());
    }


}
