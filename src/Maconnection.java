

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Maconnection {
	
	Connection con;
	Statement st;
	Statement st1;
	Maconnection(){
		
		try {Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/miniprojetagence","root","");
		 st=con.createStatement();
		 st1=con.createStatement();
		} catch (ClassNotFoundException e) {System.out.print(" class not found exception ");}
		catch (SQLException e) {System.out.print("sql not found exception ");}
	}
	
	int ajout (String req) throws SQLException {
		
		return st.executeUpdate(req);
	
	}
	ResultSet selection (String req) throws SQLException {
		return st.executeQuery(req);
	}
	ResultSet selection1 (String req) throws SQLException {
		return st1.executeQuery(req);
	}
	
	int suppression(String req) throws SQLException {
		return st.executeUpdate(req);
	}

	int modify(String req) throws SQLException {
			return st.executeUpdate(req);
	}
	
}
