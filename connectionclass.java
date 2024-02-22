/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cab_Booking;

import java.sql.*;

public class connectionclass
{
    Connection con;
    Statement stm;
    connectionclass()
    {
       try
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ cab_management","root","Manish@5753");
             stm=con.createStatement();
             if(con.isClosed())
             {
                 System.out.println("Yes");
             }
//             else
//             {
//                 System.err.println("No");
//             }
       }
         catch(Exception ex)
       {
           ex.printStackTrace();
       }
    }
    public static void main(String arg[])
    {
         new connectionclass();
    }
        
    
}
