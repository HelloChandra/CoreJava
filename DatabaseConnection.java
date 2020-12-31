import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.sql.ResultSet;
import java.sql.CallableStatement;

public class DatabaseConnection 
{
	
	Connection c;
	Statement s;
	PreparedStatement p;
	String name,password;
	ResultSet r;
	CallableStatement cs;
	int number;
	int count=1;
	
	public void CreateConnection()
	{
		try
		{
			
			//Normal Statement
			


               Class.forName("com.mysql.jdbc.Driver");
			   c=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			   //s=c.createStatement();
				
				/*
			   r=s.executeQuery("select * from MyTable");
				
				while(r.next())
				{
				   System.out.println(r.getString(1)+"  "+r.getInt(2));	
				}
				*/
                 
			/*
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			   */
			   //s=c.createStatement();
			   //s.execute("insert into MyTable values('mohan',1002)");
	
			 
			   
			//  PreparedStatement
			
			/*
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			   c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			   
			   */
			   
			   /*
			   p=c.prepareStatement("insert into MyTable values(?,?)");
			   Scanner sc=new Scanner(System.in);
			   System.out.println("Enter name");
			   name=sc.next();
			   System.out.println("Enter id");
			   number=sc.nextInt();
			   p.setString(1,name);
			   p.setInt(2,number);
			   p.executeUpdate();
			*/
			   //calling stored procedure from java application
			   
			 /*
			   Class.forName("oracle.jdbc.driver.OracleDriver");
		       c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		       cs=c.prepareCall("{CALL MyProcedure}");
		       cs.execute();
		       */
		       
			/*
			Class.forName("oracle.jdbc.driver.OracleDriver");
		    c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		    cs=c.prepareCall("{CALL MyInProcedure(?)}");
		    //cs.setString(1,"rakesh");
			cs.setInt(1,14);
			cs.execute();
			*/
			
			//calling in parameterized procedure
			/*
			   Class.forName("oracle.jdbc.driver.OracleDriver");
		       c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		       cs=c.prepareCall("{CALL iprocedure(?)}");
			   cs.setString(1,"srikanth");
			   //cs.setInt(1,1004);
			   cs.execute();
			
			*/
			//Creating Normal ResultSet
			
			/*
			Class.forName("oracle.jdbc.driver.OracleDriver");
			c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			*/
			
			
			
			
			// Creating Scrollable ResultSet
			
		
			/*
		Class.forName("oracle.jdbc.driver.OracleDriver");
		c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		
		s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		r=s.executeQuery("select * from MyTable");
		System.out.println("Third Record");
		r.absolute(3);
		//r.updateInt(1,1010);
		//r.updateRow();
			   
		System.out.println(r.getString(1)+"  "+r.getInt(2));
			   
		System.out.println("First Record");
		r.absolute(1);
		System.out.println(r.getString(1)+"  "+r.getInt(2));
			   */
	
			 
			// Creating Updatable ResultSet
			
			
			   /*
			  Class.forName("oracle.jdbc.driver.OracleDriver");
		      c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
		      */
			   
		      s=c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		      r=s.executeQuery("select id from Mytable");
		  
		     
		      r.absolute(2);
		    
		      r.updateInt(1,15);
		      r.updateRow(); 
			
		
			   
			  
		}
		catch(ClassNotFoundException cl)
		{
			System.out.println(cl.getMessage());
		}
		catch(SQLException sq)
		{
		   System.out.println(sq.getMessage());
		}
		
	}
	public static void main(String args[])
	{
		DatabaseConnection dc=new DatabaseConnection();
		dc.CreateConnection();
	}
	

}
