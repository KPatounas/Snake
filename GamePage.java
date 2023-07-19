import java.awt.*;
import javax.swing.*;

public class GamePage extends JFrame{

    public GamePage() {

        // Add the GamePagePanel to the frame
        this.add(new GamePagePanel());

        // Frame implementation
        setTitle("Snake"); // Set the title of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame on the screen
        Image ImageIcon = Toolkit.getDefaultToolkit().getImage("snakee.jpg");
        setIconImage(ImageIcon); // Set the icon image for the frame
        setResizable(true);
        setVisible(true);
        pack();

        
    }
}