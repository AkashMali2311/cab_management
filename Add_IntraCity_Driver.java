/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab_Booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class Add_IntraCity_Driver extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JButton bt1,bt2;
    JPanel p1,p2,p3;
    JTextField tf1,tf2,tf3,tf4,tf5,tf6;
    Font f,f1;
    Add_IntraCity_Driver()
    {
         super("Add IntraCity Diver");//<--its directed the page name 
        setSize(500, 500);
        setLocation(100, 100);
        
        //set frame---> 
        f=new Font("Arial",Font.BOLD ,20);
        f1=new Font("Arial",Font.BOLD ,20);
        
        //take lebel for customer service--->
        l1=new JLabel("Add Intracity Driver"); 
        l1.setHorizontalAlignment(JLabel.CENTER);//<--set at middle of the page
        l1.setForeground(Color.BLACK);
        
        l2=new JLabel("Driver Name");
        l3=new JLabel("Source");
        l4=new JLabel("Destination");
        l5=new JLabel("Car");
        l6=new JLabel("Price");

        //take Textfield-->
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        tf5=new JTextField();
      
        //take 2 buttons---->
        bt1=new JButton("Add Intracity Driver");
        bt2=new JButton("Back");

        //take actionlistener-->
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        bt1.setBackground(Color.yellow);
        bt1.setForeground(Color.black);
        
         bt2.setBackground(Color.black);
        bt2.setForeground(Color.white);
        
        //take size to FONT-->
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        
        
        tf1.setFont(f1);
        tf2.setFont(f1);
        tf3.setFont(f1);
        tf4.setFont(f1);
        tf5.setFont(f1);
        
        bt1.setFont(f1);
        bt2.setFont(f1);


        //make panels-->
        p1=new JPanel();
        p1.setLayout(new GridLayout(1,1,10,10)); /*<--inthis panel have 1 row and 1 colum and it panel for only work for center*/
        p1.add(l1);
        
        p2=new JPanel();
        p2.setLayout(new GridLayout(6,2,10,10));//<--inthis panel have 6 row and 2 colum it work for lebels and button

        p2.add(l2);
        p2.add(tf1);
        p2.add(l3) ;
        p2.add(tf2);
        p2.add(l4);
        p2.add(tf3);
        p2.add(l5);
        p2.add(tf4);
        p2.add(l6);
        p2.add(tf5);
        p2.add(bt1);
        p2.add(bt2);

        setLayout(new BorderLayout(10,10));
        add(p1,"North");
        add(p2,"Center");

    
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==bt1)
        {
            String name=tf1.getText();
            String source=tf2.getText();
            String destination=tf3.getText();
            String car=tf4.getText();
            String price=tf5.getText();
            //databaseconnectivity--->
            try 
            {
                 connectionclass obj2=new connectionclass();
                 String q= "insert into Intracity_driver(driver,source,destination,car,price) values('"+name+"','"+source+"','"+destination+"','"+car+"','"+price+"')";
                int aa=obj2.stm.executeUpdate(q);
                if(aa==1)
                {
                    JOptionPane.showMessageDialog(null," Your Data Succesfully Inserted");
                    this.setVisible(false);
                }
                else
                {
                    JOptionPane.showMessageDialog(null," Please, Fill All Details Carefully");

                }
            }
           
            catch (Exception ee)
            {
                ee.printStackTrace();
            }
   
        }
         if(e.getSource()==bt2)
            {
                   this.setVisible(false);
                   
                  // new AdminSection().setVisible(true);//adminsection is new class
            }
    }
    public static void main(String[] args)
    {
        new Add_IntraCity_Driver().setVisible(true);
    }
}
