import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login()
    {
        super("Login");
        setLayout(null);
	
    	l1=new JLabel("Developed by : Rutuja Jotrao");
    	l1.setBounds(415,234,310,20);
        add(l1);

        l2=new JLabel("Number Guessing Game");
        l2.setBounds(203,50,310,30);
        l2.setFont(new Font("serif",Font.BOLD,20));        
        add(l2);

        b1 = new JButton("Start");
        b1.setBounds(195,100,220,30);
        b1.setFont(new Font("serif",Font.BOLD,15));        
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);
       
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(600,350);
    }

    public void actionPerformed(ActionEvent ae)
    {
        String s=ae.getActionCommand();
    
        if(s.equals("Start"))
        {
           new page1();
            
        }
    }
    
    public static void main(String[] arg)
    {
        new Login();
    }
}
