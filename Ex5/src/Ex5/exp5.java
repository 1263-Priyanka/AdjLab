package Ex5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class exp5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// load jdbc driver-4 into application fro mysql
			Class.forName("com.mysql.jdbc.Driver");

			//establish jdbc connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");

			String query2 = "update students set name = ? where regno = ?";
			PreparedStatement upsmt = con.prepareStatement(query2);
			upsmt.setString(1,"Jin");
			upsmt.setString(2,  "1263");
			int rows = upsmt.executeUpdate();
			System.out.println(rows+" rows are updated.."); 

			Statement stmt = con.createStatement(); 
			ResultSet rs = stmt.executeQuery("select * from studs");

			System.out.println("regno\tname\tbranch");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}