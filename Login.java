/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab_Booking;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Login extends JFrame implements ActionListener
{
    JPanel panel;
    JFrame f;
    JLabel l1,l2,l3,l4,l5;
    JTextField t1;
    JPasswordField pf1;
    JButton b1,b2;
    
    Login()
    {
            //takeframe->
        f=new JFrame("Login Account ");
        f.setBackground(Color.ORANGE);
        f.setLayout(null);
        
            //labelforframe->
        l1=new JLabel();
        l1.setBounds(0,0,580,350);
        l1.setLayout(null);
        
        
                //Add*Image* at Background of frame->
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("cab_Booking/Icons/cabbg.png"));
        Image i1=img.getImage().getScaledInstance(580, 350, Image.SCALE_DEFAULT);
        ImageIcon img1=new ImageIcon(i1);
        l1.setIcon(img1);
        
                //loginAccount->
        l2=new JLabel("Login Account");
        l2.setBounds(190,30,500,50);
        l2.setFont(new Font("Airal",Font.BOLD,30));
        l2.setForeground(Color.DARK_GRAY);
        l1.add(l2);
        f.add(l1);
                //username->   
        l3=new JLabel("Username");
        l3.setBounds(120,120,150,30);
        l3.setFont(new Font("Airal",Font.BOLD,20));
        l3.setForeground(Color.YELLOW);
        l1.add(l3);
       
                 //password->
        l4=new JLabel("Password");
        l4.setBounds(120,170,150,30);
        l4.setFont(new Font("Airal",Font.BOLD,20));
        l4.setForeground(Color.yellow);
        l1.add(l4);
        
                  //textfield for username[____]-> 
        t1=new JTextField();
        t1.setBounds(320, 120, 150, 30);
        l1.add(t1);
        
                //textfield for password[____]->
         
        pf1=new JPasswordField();
        pf1.setBounds(320, 170, 150, 30);
        l1.add(pf1);
        
                   //button for [Login]->
         b1=new JButton("Login");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.setBounds(120,220,150,40);
         l1.add(b1);
         
                  //button for [SignUP]->
         b2=new JButton("Signup");
         b2.setBackground(Color.BLACK);
         b2.setForeground(Color.WHITE);
         b2.setBounds(320,220,150,40);
         l1.add(b2);
         
                //Add Action listener for buttons->
                
         b1.addActionListener(this);
         b2.addActionListener(this);

                //visibility for true and false condition->
         f.setVisible(true);         //---> when click on button then visible 
         f.setSize(580, 350);
         f.setLocation(300, 100);
         f.setResizable(false);//-->in this condition can not resize of page 
             
    }
                //Action perform event-->
        public void actionPerformed(ActionEvent ee)
        {
             //Action event for [button login]-->
            if (ee.getSource()==b1)
            {
                try
                {
                    connectionclass obj=new connectionclass();
                    String username=t1.getText();
                    String pass=pf1.getText();
                    
                    
                    //write query for  match the data ->
                    
                    String q ="select * from Signup where Username='"+username+"' and password='"+pass+"'";  //->Query
                    ResultSet rs=obj.stm.executeQuery(q);
                    
                    //if any value in *rs* we go to next *HOMEPAGE*->
                     if(rs.next())
                    {
                        //System.out.println("Aai");
                      
                       new HomePage().setVisible(true); ///move to next page homepage 
                        f.setVisible(false);
                    }
                     
                     else
                    {
                        JOptionPane.showMessageDialog(null,"you have entered  wrong username and password");
                        f.setVisible(false);
                        f.setVisible(true);
                        
                    }  
                } 
                catch (Exception e) 
                {
                  
                     // e.PrintStackTrace();
                }   
            }
            //Action event for [button signup]-->
            
            if (ee.getSource()==b2)
            {
               f.setVisible(false);
               new SignUp();
            }
        }
     public static void main(String[] args)
     {
        new Login(); 
     }
        
 }

