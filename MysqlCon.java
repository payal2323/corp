import java.sql.*;  
class MysqlCon
{  
public static void main(String args[])
	{  
	try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/rntdbuat","rnt_user","RnT@LMS");  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from employee_master");  
			while(rs.next())
			{  
			}			
			con.close();  
		}
		catch(Exception e)
		{ 
		}  
	}  
}  
