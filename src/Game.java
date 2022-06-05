import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Image;

import java.awt.event.*;

public class Game implements MouseListener{


    private JPanel gamePanel;
    private JLabel money;
    public Game()
    {
        gamePanel = new JPanel();
        gamePanel.setSize(800,800);
        gamePanel.setOpaque(true);
        gamePanel.setBackground(Color.green);
       

        money = new JLabel();
        money.setBounds(400,400,300,300);
        money.setText("Grab the money for a raise!");
        money.setHorizontalTextPosition(JLabel.CENTER);
        money.setVerticalTextPosition(JLabel.BOTTOM);

        money.setIconTextGap(10);
        ImageIcon moneyGrab = new ImageIcon("moneyGrab.jpg");
        Image resizedImage = moneyGrab.getImage().getScaledInstance(90, 90, 1);
        moneyGrab.setImage(resizedImage);
        money.setIcon(moneyGrab);

        money.addMouseListener(this);
        gamePanel.setLayout(null);
        gamePanel.add(money);

  

    }

    public JPanel getPanel()
    {
        return gamePanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("this was entered");
        int xPos = (int) (Math.random()*500);
        int yPos = (int) (Math.random()*500);
        money.setBounds(xPos, yPos, 300,300);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
