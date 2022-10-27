import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class page1 extends JFrame implements ActionListener{
    
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
    int a=0;
    int y;

    page1(){

        super("Login");
        y=(int)(Math.random()*100);

        setLayout(null);

        l1 = new JLabel("Enter Number : ");
        l1.setBounds(44,50,100,30);
        add(l1);
    
        t1=new JTextField();
        t1.setBounds(155,50,200,30);
        add(t1);
        
     
        b1 = new JButton("Check");
        b1.setBounds(40,140,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Restart");
        b2.setBounds(180,140,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        b3 = new JButton("Exit");
        b3.setBounds(330,140,120,30);
        b3.setFont(new Font("serif",Font.BOLD,15));
        b3.addActionListener(this);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        add(b3);

        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(600,350);

        
    }
        
        public void Check()
        {
            int x=Integer.parseInt(t1.getText());
    
            if(a<4)
            {
                
                    if(x==y)
                    {
                        JOptionPane.showMessageDialog(this,"Congrats! Your guess is correct");
                        if(a==1)
                        {
                            JOptionPane.showMessageDialog(this,"Congrats! Your score is 100");
                        }
                        else if(a==2)
                        {
                            JOptionPane.showMessageDialog(this,"Congrats! Your score is 70");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Congrats! Your score is 50");
                        }
                    }
                    else
                    {
                        if(x>y)
                        {
                            JOptionPane.showMessageDialog(this,"OOPS! Your guess is greater");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"OOPS! Your guess is smaller");
                        }
                    }
                 
    
            }
            else
            {
                JOptionPane.showMessageDialog(this,"You have lost your max attempts! "+"\n"+"Ans is : "+y);
                 
            }
        }

     

    public void actionPerformed(ActionEvent ae)
{
    String s=ae.getActionCommand();
    a++;
    
        if(s.equals("Check"))
        {
            Check();
            
        }

        if(s.equals("Restart"))
        {

           new page2();

        }

        if(s.equals("Exit"))
        {

           new Login();

        }
}

}
