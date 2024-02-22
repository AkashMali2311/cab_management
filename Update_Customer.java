/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab_Booking;

//import com.sun.java.accessibility.util.AWTEventMonitor;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;//<---this libery use for sql quary
import javax.swing.*; 
public class Update_Customer extends JFrame implements ActionListener
{
      JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
        JButton bt1,bt2;
        JPanel p1,p2,p3;
        JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
        Font f,f1;
        Choice ch;

    //make cunstructor-->
     Update_Customer()
    {
        super("Update Customer");//<--its directed the page name 
        setSize(740, 700);
        setLocation(50, 50);
        
        f=new Font("Arial",Font.BOLD ,25);
        f1=new Font("Arial",Font.BOLD ,18);
        //take choice for button---->
        
        ch=new Choice();
        //use try catch block for data fetching -->
        try 
        {
            connectionclass obj=new connectionclass();
             String q = "select * from customer";//<----give all values and colums for view 
                ResultSet rest=obj.stm.executeQuery(q);//<---All details Store in resultset
                while(rest.next())
                {
                    ch.add(rest.getString("username"));
                }
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        //set lebel as our need--->
        
        l1=new JLabel("Update Customer");//<--Heading portion
        l1.setHorizontalAlignment(JLabel.CENTER);//<--set their position in center
        
        
        l2=new JLabel("Username"); 
        l3=new JLabel("Name");
        l4=new JLabel("Age");
        l5=new JLabel("Data of Birth");
        l6=new JLabel("Address");
        l7=new JLabel("Phone");
        l8=new JLabel("Email");
        l9=new JLabel("Country");
        l10=new JLabel("Gender");
        l11=new JLabel("Aadhar");
        
        
        //create textField for every object--->
        tf1=new JTextField();
        tf2=new JTextField();
        tf3=new JTextField();
        tf4=new JTextField();
        tf5=new JTextField();
        tf6=new JTextField();
        tf7=new JTextField();
        tf8=new JTextField();
        tf9=new JTextField();
        
        
        
        //give 2 buttons-->
        bt1=new JButton("Update");
        bt2=new JButton("Back");
        
        //set button backgroundcolor---->
        bt1.setBackground(Color.BLACK);
        bt2.setBackground(Color.RED);
        
       //set button Foregroundcolor----->
        bt1.setForeground(Color.WHITE);
        bt1.setForeground(Color.WHITE);
        
        //take actionlinsteners for both button for Performing Actions--->
        bt1.addActionListener(this);
        bt2.addActionListener(this);
        
        
        /*give font size to all *LEBELS* as per same-> f=new Font("Arial",Font.BOLD ,25);
                                                   f1=new Font("Arial",Font.BOLD ,18);*/
        l1.setFont(f);//<---it only for Update Customer(f)
        l2.setFont(f1); //<--it all reamaing give same font size as (f1)
        l3.setFont(f1); //<--it all reamaing give same font size as (f1)
        l4.setFont(f1); //<--it all reamaing give same font size as (f1)
        l5.setFont(f1); //<--it all reamaing give same font size as (f1)
        l6.setFont(f1); //<--it all reamaing give same font size as (f1)
        l7.setFont(f1); //<--it all reamaing give same font size as (f1)
        l8.setFont(f1); //<--it all reamaing give same font size as (f1)
        l9.setFont(f1); //<--it all reamaing give same font size as (f1)
        l10.setFont(f1); //<--it all reamaing give same font size as (f1)
        l11.setFont(f1); //<--it all reamaing give same font size as (f1)   

     /*give font size to all *TEXTFIELDS* as per same-->  f1=new Font("Arial",Font.BOLD ,18);*/
            tf1.setFont(f1);
            tf2.setFont(f1);
            tf3.setFont(f1);
            tf4.setFont(f1);
            tf5.setFont(f1);
            tf6.setFont(f1);
            tf7.setFont(f1);
            tf8.setFont(f1);
            tf9.setFont(f1);
            
            
      
         /*give font size to all *CHOICE* as per same-->  f1=new Font("Arial",Font.BOLD ,18);*/
           ch.setFont(f1);
           
           
           
             //Add image at this page with location & image path--->
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("cab_Booking/Icons/updatepage.png"));
        Image img=ic.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);   //<----- image convert in icon for that use this line in program.
        l12=new JLabel(ic1);                 // Image Add in Label which label we created already.
         

           
           p1=new JPanel();
           p1.setLayout(new GridLayout(1,1,10,10));//inthis panel only 1 ROW &only 1 COLOUM &gap is 10 nad 10
           p1.add(l1);//<---LABEL ADD IN PANEL

           p2=new JPanel();
           p2.setLayout(new GridLayout(1,1,10,10));//inthis panel only 1 ROW &only 1 COLOUM &gap is 10 nad 10
           p2.add(l12);//<----image add in panel
           
           p3=new JPanel();
           p3.setLayout(new GridLayout(11,2,10,10));//inthis panel only 1 ROW &only 1 COLOUM &gap is 10 nad 10
           p3.add(l2);//<----LEBEL ADD IN PANEL
           p3.add(ch);
           p3.add(l3);
           p3.add(tf1);
           p3.add(l4);
           p3.add(tf2);
           p3.add(l5);
           p3.add(tf3);
           p3.add(l6);
           p3.add(tf4);
           p3.add(l7);
           p3.add(tf5);
           p3.add(l8);
           p3.add(tf6);
           p3.add(l9);
           p3.add(tf7);
           p3.add(l10);
           p3.add(tf8);
           p3.add(l11);
           p3.add(tf9);
          //also add both buttons-->
           p3.add(bt1);
           p3.add(bt2);
           
           
           
           
           //set  LAYOUT for both p1 and p2 panels----->
           setLayout(new BorderLayout(10,10));
           add(p1,"North");
           add(p2,"West");
           add(p3,"Center");
           
           //mouse listener---->
            ch.addMouseListener(new MouseAdapter()
           {
             @Override
            public void mouseClicked(MouseEvent arg0)
            {
                try 
                {
                     connectionclass obj2=new connectionclass();
                     String username=ch.getSelectedItem();
                    String q1 = "select * from customer where username='"+username+"'";//<----give  values and colums for view 
                    ResultSet rest1=obj2.stm.executeQuery(q1);//<---All details Store in resultset
                      while(rest1.next())
                      {
                          tf1.setText(rest1.getString("name"));
                          tf2.setText(rest1.getString("age"));
                          tf3.setText(rest1.getString("dob"));
                          tf4.setText(rest1.getString("address"));
                          tf5.setText(rest1.getString("phone"));
                          tf6.setText(rest1.getString("email"));
                          tf7.setText(rest1.getString("country"));
                          tf8.setText(rest1.getString("gender"));
                          tf9.setText(rest1.getString("aadhar"));                    
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
            String username=ch.getSelectedItem();
            String name=tf1.getText();
            String age=tf2.getText();
            String dob=tf3.getText();
            String address=tf4.getText();
            String phone=tf5.getText();
            String email=tf6.getText();
            String country=tf7.getText();
            String gender=tf8.getText();
            String aadhar=tf9.getText();

            try 
            {
                connectionclass obj3=new connectionclass();
                String q1 = "insert into Customer set name='"+name+"',age='"+age+"',dop='"+dob+"',address='"+address+"',phone='"+phone+"',email='"+email+"',country='"+country+"',gender='"+gender+"',aadhar='"+aadhar+"',where username='"+username+"'";
                int aa=obj3.stm.executeUpdate(q1);
                if(aa==1)
                {
                 JOptionPane.showMessageDialog(null,"Your Data Successfully Updated");
                        this.setVisible(false);
                        new  view_customer().setVisible(true);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Please,Fill all Details Carefully");
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
        }
    }
    public static void main(String[] args)
    {
       new Update_Customer().setVisible(true);
    }
            
}
