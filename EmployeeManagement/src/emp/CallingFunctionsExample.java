package emp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
public class CallingFunctionsExample {
   public static void main(String args[]) throws SQLException {
      //Registering the Driver
      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
      //Getting the connection
      String mysqlUrl = "jdbc:mysql://localhost:3306/test";
      Connection con = DriverManager.getConnection(mysqlUrl, "root", "root");
      System.out.println("Connection established......");
      //Preparing a CallableStatement to call a function
      CallableStatement cstmt = con.prepareCall("{? = call totalemp()}");
      //Registering the out parameter of the function (return type)
      cstmt.registerOutParameter(1,java.sql.Types.INTEGER);
      cstmt.execute();
      int count=cstmt.getInt(1);
      System.out.print("total: "+count);
   }
}
