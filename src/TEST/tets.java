package TEST;

import java.sql.*;

public class tets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://127.0.0.1/testsystem?useSSL=false";
		String driver="com.mysql.jdbc.Driver";
		String user="root";
		String psw="lx09031231";
		Connection con;
		PreparedStatement st;
		String sql1="insert into student values(?,?)";
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, psw);
			st = (PreparedStatement)con.prepareStatement(sql1);
			st.setString(1, "201407670127");
			st.setString(2, "lx09031231");
			st.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
