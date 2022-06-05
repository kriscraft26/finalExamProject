import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Image;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class StartingMenu implements ActionListener{

    private JPanel startMenu;
    private boolean isDone;
    public StartingMenu()
    {
        boolean isDone = false;

        ImageIcon startImage = new ImageIcon("raisesimulator.jpg");
        Image resizedImage = startImage.getImage().getScaledInstance(192, 120, 1);
        startImage.setImage(resizedImage);
        JLabel menu = new JLabel();
        menu.setBounds(100,0, 200, 200);
        menu.setIcon(startImage);

        JButton startButton = new JButton();
        startButton.setBounds(100,250, 200,125);
        startButton.setText("Click this to begin!");
        
        startButton.addActionListener(this);

        startMenu = new JPanel();
        startMenu.setBounds(200,200,400,400);
        startMenu.setBackground(Color.lightGray);
        startMenu.setLayout(null);
        startMenu.add(menu);
        startMenu.add(startButton);
        
    }
    
    public JPanel getPanel()
    {
        return startMenu;
    }

    public boolean isItDone()
    {
        return isDone;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        isDone = true;
        startMenu.setVisible(false);
    }
    
}
