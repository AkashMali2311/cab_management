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
public class CheckBill extends JFrame implements ActionListener
{
    JPanel p1,p2,p3;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JTextField tf1,tf2,tf3,tf4;
    JButton b1,b2;
    Font f,f1;
    Choice ch1;
  public int price=0;
    CheckBill()
    {
        super("Check Total Cab Bill");
        setLocation(50, 10);
        setSize(1100, 600);
        
        l1=new JLabel("Check Total Cab Bill");
        l2=new JLabel("Username");
        l3=new JLabel("Name");
        l4=new JLabel("Email");
        l5=new JLabel("Address");
        l6=new JLabel("Price");
        
        ch1=new Choice();
        try 
        {
              connectionclass obj=new connectionclass();
              String q= "select * from Customer";//<--take source details frome customer table
              ResultSet rest=obj.stm.executeQuery(q);//<---All details Store in resultset
              while(rest.next())//<--when value till present then loop till end
              {
                  ch1.add(rest.getString("username"));
              }
            
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        
        //automatic fild filled thas why we use seteditor ()fasle--->
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        
        //take 2 button-->
        b1=new JButton("IntraCity Cab");
        b2=new JButton("Back");
        
        //set center allinment of heading page l1-->
        l1.setHorizontalAlignment(JLabel.CENTER);
        
        //take action listenor to 2 buton-->
        b1.addActionListener(this);
        b2.addActionListener(this);

        //set font to f and f1--->
        f=new Font("Arial",Font.BOLD,30); 
        f1=new Font("Arial",Font.BOLD,20); 
        
        //add font to all label and textfiels and buttons--->>>
         l1.setFont(f);
         l2.setFont(f1);
         l3.setFont(f1);
         l4.setFont(f1);
         l5.setFont(f1);
         l6.setFont(f1);
         
         //set to font to the textfield-->
         tf1.setFont(f1);
         tf2.setFont(f1);
         tf3.setFont(f1);
         tf4.setFont(f1);
         
         //set font to the buttons--->
         b1.setFont(f1);
         b2.setFont(f1);
     
         //set background color of buttons---->
          b1.setBackground(Color.YELLOW);
          b2.setBackground(Color.BLACK);
          
          //setforgroundcolor of buttons--->
          b1.setForeground(Color.BLACK);
          b2.setForeground(Color.white);

          //addd firdt panel--->
          p1=new JPanel();
          p1.setLayout(new GridLayout(1,1,10,20));
          p1.add(l1);
          
          //add second panel---->
          p2=new JPanel();
          p2.setLayout(new GridLayout(6,2,10,10));
          p2.add(l2);
          p2.add(ch1);
          p2.add(l3);
          p2.add(tf1);
          p2.add(l4);
          p2.add(tf2);
          p2.add(l5);
          p2.add(tf3);
          p2.add(l6);
          p2.add(tf4);
          p2.add(b1);
          p2.add(b2);
        
          //add third panel for image-->
          
           p3=new JPanel();
          p3.setLayout(new GridLayout(1,1,10,10));
          
            //Add image at Home Page with location & image path--->
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("cab_Booking/Icons/man.png"));
        Image img=ic.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);   //<----- image convert in icon for that use this line in program.
        l7=new JLabel(ic1);                 // Image Add in Label which label we created already.
         p3.add(l7);
         
         //set all pannel-->
         setLayout(new BorderLayout(0,0));
         add(p1,"North");
         add(p2,"Center");
         add(p3,"West");
         
                                  //mouse listener for DESTINATION ch3---->
            ch1.addMouseListener(new MouseAdapter()
           {
             @Override
            public void mouseClicked(MouseEvent arg0)
            {
                try 
                {
                     connectionclass obj=new connectionclass();
                     String username=ch1.getSelectedItem();
                    String q1 = "select * from Customer where username='"+username+"'";//<----give  values and colums for view 
                    ResultSet rest=obj.stm.executeQuery(q1);//<---All details Store in resultset
                      while(rest.next())
                      {
                          tf1.setText(rest.getString("name"));
                          tf2.setText(rest.getString("email"));
                          tf3.setText(rest.getString("address"));
                       
                     }
                      rest.close();
                     
                   }
                 catch (Exception exx) 
                 {
                     exx.printStackTrace();
                 }
          
            }
        });
            


    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            //access price --->
           price=0;
           String  username=ch1.getSelectedItem();
            try 
            {
                  connectionclass obj2=new connectionclass();
                    String q2 = "select price from Intracitycab where username='"+username+"'";//<----give  values and colums for view 
                    ResultSet rest1=obj2.stm.executeQuery(q2);//<---All details Store in resultset
                      while(rest1.next())
                      {
                          price=price+Integer.parseInt(rest1.getString("price"));
                      }
                      tf4.setText(price+"");
                      rest1.close();

            } 
            catch (Exception exx) 
            {
                exx.printStackTrace();
            }
          
        }
        if(e.getSource()==b2)
        {
            this.setVisible(false);
        } 

    }
    public static void main(String[] args)
    {
        new CheckBill().setVisible(true);
    }
    
}
