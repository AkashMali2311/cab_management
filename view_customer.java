/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cab_Booking;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;//<---this libery use for sql quary
import javax.swing.*; 

public class view_customer  extends JFrame 
{
    Font f;
    JTable t1;
    String x[]={"Username","Name","Age","Date of Birth","Address","Phone","Email","Country","Gender","Aadhar"};
    String y[][]=new String [20][10];//its two dimensional Array [20]->rows and [10]->coloums
    int i=0,j=0;
    
    //constructor for atomatic call for run main method--->
     view_customer()
    {
        super("All Customer datails");
        setSize(1300, 400);
        setLocation(0, 10);
        f=new Font ("MS UI Gothic",Font.BOLD,17);
        
        //use try and catch block for fetching data--->
        try 
        {
           connectionclass obj=new connectionclass();
             String q = "select * from customer";//<----give all values and colums for view 
                ResultSet rest=obj.stm.executeQuery(q);//<---All details Store in resultset
                while(rest.next())//<---This Loop work for all coloumn .
                { //take all coulums-->
                    y[i][j++]=rest.getString("username");
                    y[i][j++]=rest.getString("name");
                    y[i][j++]=rest.getString("age");
                    y[i][j++]=rest.getString("dob");
                    y[i][j++]=rest.getString("address"); 
                    y[i][j++]=rest.getString("phone");
                    y[i][j++]=rest.getString("Email");
                    y[i][j++]=rest.getString("country");
                    y[i][j++]=rest.getString("gender");
                    y[i][j++]=rest.getString("aadhar");
                    i++;//<----all coloums filled the going to the second row
                    j=0;
                }
                t1=new JTable(y, x);
        } 
        catch (Exception e)
        {
            e.printStackTrace();
        }
        
        //set color to the table heading section and background-->
        t1.setFont(f);
        t1.setBackground(Color.BLACK);
        t1.setForeground(Color.WHITE);
        
        //Add scrollBar for see multiple record in your data base-->
        JScrollPane js=new JScrollPane(t1);
        add(js);
    }
    public static void main(String[] args)
    {
        new  view_customer().setVisible(true);

    }
}
