/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab_Booking;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*; 

public class View_Booked_Cab extends JFrame
{    Font f;
    JTable t1;
    String x[]={"Book_ID","username","drivername","car","source","destination","Price"};
    String y[][]=new String [30][10];//its two dimensional Array [20]->rows and [10]->coloums
    int i=0,j=0 ;
    View_Booked_Cab()
    {
       super("All Booked Cab Record");
        setSize(1300, 400);
        setLocation(0, 10);
        f=new Font ("MS UI Gothic",Font.BOLD,17);
        
        //try connectivity---->
        try 
        {
            connectionclass obj=new connectionclass();
             String q = "select * from Intracitycab";//<----give all values and colums for view 
                ResultSet rest=obj.stm.executeQuery(q);//<---All details Store in resultset
                while(rest.next())
                {
                      //take all coulums-->
                    y[i][j++]=rest.getString("BookId");
                    y[i][j++]=rest.getString("username");
                    y[i][j++]=rest.getString("drivername");
                    y[i][j++]=rest.getString("car");
                    y[i][j++]=rest.getString("source"); 
                    y[i][j++]=rest.getString("destination");
                    y[i][j++]=rest.getString("price");
                    i++;//<----all coloums filled the going to the second row
                    j=0;
                }
                t1=new JTable(y,x);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
        t1.setFont(f);
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);

        
        //add scollbar--->
        JScrollPane js=new JScrollPane(t1);
        add(js);
    }
  
    public static void main(String[] args)
    {
            new View_Booked_Cab().setVisible(true);
            
     }
}
