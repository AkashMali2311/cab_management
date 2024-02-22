/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab_Booking;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.Random;//<---use this libery for random function
import javax.swing.*; 

public class AdminSection extends JFrame implements ActionListener
{
    JPanel p1,p2;
    JLabel l1;
    JButton b1,b2 ;
    Font f,f1;
    AdminSection()
    {
        super("Admin Section");
        setLocation(450, 250);//450 250
        setSize(400, 270);//400 270
        
        //take font -->
         f=new Font("Arial",Font.BOLD ,30);
        f1=new Font("Arial",Font.BOLD ,18);
        
        //take label name and button name-->
        l1=new JLabel("Admin Section");
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        b1=new JButton("Intracity Driver");
        b2=new JButton("SingUp");
          
      //take actionlisteners to the button --->
        b1.addActionListener(this);
        b2.addActionListener(this);
        
         b1.setBackground(Color.YELLOW);
         b2.setBackground(Color.YELLOW);
          
          //setforgroundcolor of buttons--->
          b1.setForeground(Color.BLACK);
          b2.setForeground(Color.BLACK );


        //set font to the buttons and lebel-->
        l1.setFont(f);
        b1.setFont(f1);
        b2.setFont(f1);
        
        //add panel-->
        
        p1=new JPanel();
        p1.setLayout(new GridLayout(3,1,10,10));
        p1.add(l1);
        p1.add(b1);
        p1.add(b2);
        
        setLayout(new BorderLayout(10,10));
        add(p1,"Center");
        
        
        
        
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new Add_IntraCity_Driver().setVisible(true);
            this.setVisible(false);
        }
        if(e.getSource()==b2)
        {
            new SignUp().setVisible(true);
             this.setVisible(false);

        }
    }
    public static void main(String[] args)
    {
        new AdminSection().setVisible(true);

        
    }
}

