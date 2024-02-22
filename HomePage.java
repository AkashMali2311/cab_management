 /*ss
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab_Booking;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class HomePage extends JFrame implements ActionListener
{   
    JLabel l1;
    Font f,f1,f2;
    JPanel p1,p2;
    
    //Default constructor of class name--->
    HomePage()
    {
        //title msg for home with set their size and location---->
        super(" Welcome To Cab Booking Home Page");
        setLocation(0, 0);
        setSize(1550,800);
        
        //Add image at Home Page with location & image path--->
        ImageIcon ic=new ImageIcon(ClassLoader.getSystemResource("cab_Booking/Icons/carhomepage.jpg"));
        Image img=ic.getImage().getScaledInstance(1550, 800, Image.SCALE_DEFAULT);
        ImageIcon ic1=new ImageIcon(img);   //<----- image convert in icon for that use this line in program.
        l1=new JLabel(ic1);                 // Image Add in Label which label we created already.
         
        f=new Font("Lucida Fax", Font.BOLD, 20);
         f2=new Font("Gadugi", Font.BOLD, 35);
        f1=new Font("MS UI Gothic", Font.BOLD, 30
          );
                
         //take new menu bar--->
         JMenuBar m1=new JMenuBar();
         m1.setLocation(0, 0);
         m1.setSize(2000, 2000);
         //take new menu and menu items--->
         JMenu menu1=new JMenu("Customer Profile");//--->Menu
         JMenuItem item1= new JMenuItem("Add Customer Profile");//-->MenuItem
         JMenuItem item2= new JMenuItem("View Customer Profile");//-->MenuItem
         

          JMenu menu2=new JMenu("Manage Customer");//--->Menu
         JMenuItem item3= new JMenuItem("Update Customer Details");//-->MenuItem

         
          JMenu menu3=new JMenu("Book Intracity Cab");//--->Menu
         JMenuItem item4= new JMenuItem("Book_Cab");//-->MenuItem
         JMenuItem item5= new JMenuItem("View Booked Intracity Cab");//-->MenuItem
                
//         JMenu menu4=new JMenu("Book InterCity Cab");//--->Menu
//         JMenuItem item6= new JMenuItem(" Book Intercity Cab");//-->MenuItem
//         JMenuItem item7= new JMenuItem("View Booked Intercity Cab");//-->MenuItem

//         JMenu menu5=new JMenu("Transport");//--->Menu
//         JMenuItem item8= new JMenuItem("Book Package ");//-->MenuItem
//         JMenuItem item9= new JMenuItem("View  Booked Package");//-->MenuItem

         JMenu menu6=new JMenu("Bill");//--->Menu
         JMenuItem item10= new JMenuItem("Check Bill");//-->MenuItem

         JMenu menu7=new JMenu("Delete");//--->Menu
         JMenuItem item11= new JMenuItem("Delete Customer");//-->MenuItem

         JMenu menu8=new JMenu("About");//--->Menu
         JMenuItem item12= new JMenuItem("About ");//-->MenuItem
         JMenuItem item13= new JMenuItem("Exit");//-->MenuItem

         //MENUBAR ADD INTO FRAME---->
        menu1.add(item1); // add cust profile into customer profile 
        menu1.add(item2); // view cust datails into customer profile 
         
        menu2.add(item3);//update cust details into manage customer
         
        menu3.add(item4);//book cab into Bookintra city cab 
        menu3.add(item5);//view  booked intracity cab into Bookintra city cab

//        menu4.add(item6);// book intercity cab into Bookinter city cab
//        menu4.add(item7);// view  Booked intercity cab into BOOKintercity cab 

        //menu5.add(item8);//book package into transport
        //menu5.add(item9);//view  booked packege into transport

        menu6.add(item10);//Check Bill into BILL
        
        menu7.add(item11);//Delete Customer into Delete

        menu8.add(item12);//About into About
        menu8.add(item13);//Exit into About

        //ADD ALL MENU`S IN MENUBAR-->
            
         m1.add(menu1);  //customer profile into menubar(m1)
         m1.add(menu2);  //Manage customer into menubar(m1)
         m1.add(menu3);  //BookINTRAcity into menubar(m1)
        // m1.add(menu4);  //Book INTERCity profile into menubar(m1)
         //m1.add(menu5);  //Transport into menubar(m1)
         m1.add(menu6);  //BILL profile into menubar(m1)
         m1.add(menu7);  //DELETE profile into menubar(m1)
         m1.add(menu8);  //ABOUT profile into menubar(m1)
         
         //give color to  menu bar and menu forground and background-->
         m1.setBackground(Color.BLACK);
         
         menu1.setForeground(Color.GRAY);
         menu2.setForeground(Color.GRAY);
         menu3.setForeground(Color.GRAY);
         //menu4.setForeground(Color.GRAY);
         //menu5.setForeground(Color.GRAY);
         menu6.setForeground(Color.GRAY);
         menu7.setForeground(Color.GRAY);
         menu8.setForeground(Color.RED);

         
          //give color to  menuitem forground and background-->
          item1.setBackground(Color.BLACK);
          item2.setBackground(Color.BLACK);
          item3.setBackground(Color.BLACK);
          item4.setBackground(Color.BLACK);
          item5.setBackground(Color.BLACK);
          //item6.setBackground(Color.BLACK);
         // item7.setBackground(Color.BLACK);
          //item8.setBackground(Color.BLACK);
          //item9.setBackground(Color.BLACK);
          item10.setBackground(Color.BLACK);
          item11.setBackground(Color.BLACK);
          item12.setBackground(Color.BLACK);
          item13.setBackground(Color.BLACK);
          
          //set color for itrmforground--->
           item1.setForeground(Color.yellow);
           item2.setForeground(Color.yellow);
           item3.setForeground(Color.yellow);
           item4.setForeground(Color.yellow);
           item5.setForeground(Color.yellow);
           //item6.setForeground(Color.yellow);
          // item7.setForeground(Color.yellow);
          // item8.setForeground(Color.yellow);
           //item9.setForeground(Color.yellow);
           item10.setForeground(Color.yellow);
           item11.setForeground(Color.yellow);
           item12.setForeground(Color.RED);
           item13.setForeground(Color.RED);
           
item1.addActionListener(this);
item2.addActionListener(this);
item3.addActionListener(this);
item4.addActionListener(this);
item5.addActionListener(this);
item10.addActionListener(this);
item11.addActionListener(this);

item13.addActionListener(this);
//item1.addActionListener(this);
//item1.addActionListener(this);

            // menubar  into the setjmenubar====>>
                setJMenuBar(m1);
                add(l1);
                
    }    
    public void actionPerformed(ActionEvent e)
    {
        String comnd=e.getActionCommand();
     
       if(comnd.equals("Add Customer Profile"))
        {
            Add_Customer a1=new Add_Customer();
            a1.setVisible(true);
        }
        else if(comnd.equals("View Customer Profile"))
         {
                   view_customer a2=new view_customer();
                           a2.setVisible(true);
         }
        else if(comnd.equals("Update Customer Details"))
         {
                new Update_Customer().setVisible(true);
         }
        else if(comnd.equals("Book_Cab"))
         {
                new Book_Cab().setVisible(true);
         }
             else if(comnd.equals("View Booked Intracity Cab"))
         {
             new View_Booked_Cab().setVisible(true);
         }
//             // else if(comnd.equals("Book InterCity cab"))
//         {
//               // new Book_Intercity_Cab().setVisible(true);
//         }
//              //else if(comnd.equals("view  InterCity Booked Cab"))
//         {
//                //new View_Booked_Cab().setVisible(true);
//         }
//              else if(comnd.equals("Book Package"))
//         {
//                new Book_Package().setVisible(true);
//         }
//              else if(comnd.equals("View Booked Package"))
//         {
//                new View_Booked_Package().setVisible(true);
//         }
              else if(comnd.equals("Check Bill"))
         {
               new CheckBill().setVisible(true);
         }
              else if(comnd.equals("Delete Customer"))
         {
                new Delete_Customer().setVisible(true);
         }
               else if(comnd.equals("About"))
         {
                //new About().setVisible(true);
         }
            else if(comnd.equals("Exit"))
         {
                System.exit(0);
         }     
    }


                
    public static void main(String[] args) 
    {
       new HomePage().setVisible(true);
    }
    
}
