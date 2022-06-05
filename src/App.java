import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class App {
    public static void main(String[] args) throws Exception {

        //Start Menu
      /* 
        ImageIcon startImage = new ImageIcon("raisesimulator.jpg");
        Image resizedImage = startImage.getImage().getScaledInstance(192, 120, 1);
        startImage.setImage(resizedImage);
        JLabel menu = new JLabel();
        menu.setBounds(100,0, 200, 200);
        menu.setIcon(startImage);

        JButton startButton = new JButton();
        startButton.setBounds(100,250, 200,125);
        startButton.setText("Click this to begin!");
        
        

        JPanel startMenu = new JPanel();
        startMenu.setBounds(200,200,400,400);
        startMenu.setBackground(Color.lightGray);
        startMenu.setLayout(null);
        startMenu.add(menu);
        startMenu.add(startButton);
        */
        
        StartingMenu startMenu = new StartingMenu();


        ImageIcon image = new ImageIcon("greed.jpg"); 


        JFrame frame = new JFrame();
        frame.setTitle("Getting a Raise Simulator");
        frame.setIconImage(image.getImage());

        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.add(startMenu.getPanel());
        frame.setVisible(true);

        while(startMenu.isItDone() == false)
        {
           System.out.println("Not clicked yet");
        }

        System.out.println("WORKS!");

        frame.add(new Game().getPanel());

 


    }
}
