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
public class Book_Cab extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
        JButton bt1,bt2;
        JPanel p1,p2,p3;
        JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
        Font f,f1;
        Choice ch1,ch2,ch3;
    Book_Cab()
    {
        super("Book IntraCity Car");//<--its directed the page name 
        setSize(1100,700);
        setLocation(50, 50);
        
         //set frame---> 
        f=new Font("Arial",Font.BOLD ,25);
        f1=new Font("Arial",Font.BOLD ,18);
        
        //take choice===>>
        ch1=new Choice();
        ch2=new Choice();
        ch3=new Choice();
        
        try 
        {
              connectionclass obj=new connectionclass();
              String q= "select source from Intracity_driver";//<--take source details frome Intracity_customer table
              ResultSet rest=obj.stm.executeQuery(q);//<---All details Store in resultset
              while(rest.next())//<--when value till present then loop till end
              {
                  ch1.add(rest.getString("source"));//<--add value in source textfield by DEFAULT
              }

            
        } 
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        
        try
        {
            connectionclass obj=new connectionclass();
           String q= "select username from Customer";//<--take username details frome Customer table
            ResultSet rest=obj.stm.executeQuery(q);//<---All details Store in resultset
                 while(rest.next())//<--when value till present then loop till end
              {
                  ch3.add(rest.getString("username"));//<--add value in username textfield by DEFAULT
              }
                 rest.close();

        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
//make LABEL for all options--->
        l1=new JLabel("Book Intracity cab");
        l1.setHorizontalAlignment(JLabel.CENTER);//<---set at center of the page 
        
        l2=new JLabel("Book ID");
        l3=new JLabel("Source");
        l4=new JLabel("Destination");
        l5=new JLabel("Username");
        l6=new JLabel("Name");
        l7=new JLabel("Driver Name");
        l8=new JLabel("Car");
        l9=new JLabel("Destination from");
        l10=new JLabel("Destination To");
        l11=new JLabel("Price");
        
 //make TEXTFIELD ----->
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        tf5=new JTextField();
        tf6=new JTextField();
        tf7=new JTextField();
        tf8=new JTextField();

        //make some TEXTFIELDS are DISABLE--->
        tf1.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        tf5.setEditable(false);
        tf6.setEditable(false);
        tf7.setEditable(false);
        tf8.setEditable(false);
        
        //take 2 Buttons with actionlistener--->
        bt1=new JButton("Book Cab");
        bt2=new JButton("Back");
        
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        bt1.setBackground(Color.YELLOW);
        bt2.setBackground(Color.RED);
        
        bt1.setForeground(Color.BLACK);
        bt2.setForeground(Color.WHITE);
        
        
        //generate random number for BOOK ID TEXTFIELD in red color---->
        Random rm=new Random();
        tf1.setText(""+Math.abs(rm.nextInt() % 100000));
        tf1.setForeground(Color.red);
        
        //take size and font to LEBAL---->
        l1.setFont(f);
        l2.setFont(f1);
        l3.setFont(f1);
        l4.setFont(f1);
        l5.setFont(f1);
        l6.setFont(f1);
        l7.setFont(f1);
        l8.setFont(f1);
        l9.setFont(f1);
        l10.setFont(f1);
        l11.setFont(f1);
//take size and font to choices--->
        ch1.setFont(f1);
        ch2.setFont(f1);
        ch3.setFont(f1);
        
          //take size and font to TEXTFIELS---->
          tf1.setFont(f1);
          tf3.setFont(f1);
          tf4.setFont(f1);
          tf5.setFont(f1);
          tf6.setFont(f1);
          tf7.setFont(f1);
          tf8.setFont(f1);
         

          //take size and font to BUTTONS---->
          bt1.setFont(f1);
          bt2.setFont(f1);
         
         // take paneland set ---->
          p1=new JPanel();
          p1.setLayout(new GridLayout(1,1,10,10)); /*<--inthis panel have 1 row and 1 colum and it panel for only work for center*/
          p1.add(l1);
        
          p2=new JPanel();
          p2.setLayout(new GridLayout(11,2,5,5)); /*<--inthis panel have 1 row and 1 colum and it panel for only work for center*/
          
          p2.add(l2);
          p2.add(tf1);
          p2.add(l3);
          p2.add(ch1);
          p2.add(l4);
          p2.add(ch2);
          p2.add(l5);
          p2.add(ch3);
          p2.add(l6);
          p2.add(tf3);
          p2.add(l7);
          p2.add(tf4);
          p2.add(l8);
          p2.add(tf5);
          p2.add(l9);
          p2.add(tf6);
          p2.add(l10);
          p2.add(tf7);
          p2.add(l11);
          p2.add(tf8);
          p2.add(bt1);
          p2.add(bt2);
        
              //Add image at this page with location & image path--->
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("cab_Booking/Icons/updatepage.png"));
        Image img=ic.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);   //<----- image convert in icon for that use this line in program.
        l12=new JLabel(ic1);                 // Image Add in Label which label we created already.
         
        
        //make panel 3rd---->
          p3=new JPanel();
          p3.setLayout(new GridLayout(1,1,10,10)); /*<--inthis panel have 1 row and 1 colum and it panel for only work for center*/
          p3.add(l12);

      //set  LAYOUT for both p1 and p2 panels----->
           setLayout(new BorderLayout(10,10));
           add(p1,"North");
           add(p2,"Center");
           add(p3,"West");
           
           
                         //mouse listener for DESTINATION ch3---->
            ch3.addMouseListener(new MouseAdapter()
           {
             @Override
            public void mouseClicked(MouseEvent arg0)
            {
                try 
                {
                     connectionclass obj=new connectionclass();
                     String username=ch3.getSelectedItem();
                    String q1 = "select name from customer where username='"+username+"'";//<----give  values and colums for view 
                    ResultSet rest1=obj.stm.executeQuery(q1);//<---All details Store in resultset
                      while(rest1.next())
                      {
                          tf3.setText(rest1.getString("name"));
                       
                      }
                      rest1.close();
                     
                   }
                 catch (Exception exx) 
                 {
                     exx.printStackTrace();
                 }
          
            }
        });
            
                         //mouse listener for USERNAME ch1---->
            ch1.addMouseListener(new MouseAdapter()
           {
             @Override
            public void mouseClicked(MouseEvent arg0)
            {
                ch2.removeAll();//<--at a time only one value Add
                try 
                {
                     connectionclass obj=new connectionclass();
                     String source=ch1.getSelectedItem();
                    String q1 = "select destination from Intracity_driver where source='"+source+"'";//<----give  values and colums for view 
                    ResultSet rest1=obj.stm.executeQuery(q1);//<---All details Store in resultset
                      while(rest1.next())
                      {
                          ch2.add(rest1.getString("destination"));
                       
                      }
                     
                   }
                 catch (Exception exx) 
                 {
                     exx.printStackTrace();
                 }
          
            }
        });
            
                       //mouse listener for SOURCE ch3---->

             ch2.addMouseListener(new MouseAdapter()
           {
             @Override
            public void mouseClicked(MouseEvent arg0)
            {
                try 
                {
                     connectionclass obj=new connectionclass();
                     String source=ch1.getSelectedItem();
                     String destination=ch2.getSelectedItem();
                     String q1 = "select * from Intracity_driver where source='"+source+"' and destination='"+destination+"'";//<----give  values and colums for view 
                     ResultSet rest1=obj.stm.executeQuery(q1);//<---All details Store in resultset
                      while(rest1.next())
                      {
                          tf4.setText(rest1.getString("driver"));
                          tf5.setText(rest1.getString("car"));
                          tf6.setText(rest1.getString("source"));
                          tf7.setText(rest1.getString("destination"));
                          tf8.setText(rest1.getString("price"));

                      }
                     
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
        if(e.getSource()==bt1)
        {
            String bid=tf1.getText();
            String username=ch3.getSelectedItem();
            String dname=tf4.getText();
            String car=tf5.getText();
            String source=tf6.getText();
            String destination=tf7.getText();
            String price=tf8.getText();
            
            
            try 
            {
                  connectionclass obj3=new connectionclass();
                  String q1= "insert into Intracitycab values('"+bid+"','"+username+"','"+dname+"','"+car+"','"+source+"','"+destination+"','"+price+"')";
                  int aa=obj3.stm.executeUpdate(q1);
                  if(aa==1)
                  { 
                      JOptionPane.showMessageDialog(null,"Cab Book Successfully ");
                        this.setVisible(false);
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null,"Please,Fill All Details Carefully ");
                      

                  }
            } 
            catch (Exception exx)
            {
                exx.printStackTrace();
            }
       }
        if(e.getSource()==bt2)
        {
           this.setVisible(false);
 
        }
        
    }
     public static void main(String[] args)
    {
        new Book_Cab().setVisible(true);
    }


}
