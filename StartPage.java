import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPage extends JFrame implements ActionListener{

    JPanel panel = new JPanel();
    JButton newGameButton = new JButton("New Game");
    JButton exitButton = new JButton("Exit");


    public StartPage(){

        //Frame implementation
        setTitle("Snake");   //Set the title of the frame
        setSize(600,600);   //Set the size of the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Set the default close operation of the frame
        setLocation(0, 0); //Set the position of the frame
        Image ImageIcon=Toolkit.getDefaultToolkit().getImage("snakee.jpg"); 
        setIconImage(ImageIcon); // Set the icon image for the frame
        setLayout(new BorderLayout());
        setResizable(true);
        setVisible(true);

        //  add the dark panel
        panel.setBackground(Color.BLACK);
        panel.setLayout(new GridBagLayout());
        add(panel);

        
        newGameButton.setPreferredSize(new Dimension(100, 50));
        newGameButton.setBackground(Color.BLACK);
        newGameButton.setForeground(Color.GREEN);
        newGameButton.setFocusable(false);
        newGameButton.setBorder(new LineBorder(Color.GREEN, 2));

        exitButton.setPreferredSize(new Dimension(100, 50));
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.GREEN);
        exitButton.setFocusable(false);
        exitButton.setBorder(new LineBorder(Color.GREEN, 2));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(50, 50, 10, 50); 
        panel.add(newGameButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 50, 50, 50); 
        panel.add(exitButton, gbc);

        add(panel, BorderLayout.CENTER);
        newGameButton.addActionListener(this);
        exitButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==newGameButton){
            this.dispose();
             new GamePage();
        }
        else if ( e.getSource()==exitButton){
            System.exit(0);
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}

