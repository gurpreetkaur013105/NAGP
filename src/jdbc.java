	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;

public class jdbc {
   

	// public class JdbcConnection {
	    public static void main(String[] args) {
	        try {
//	            Class.forName("com.mysql.jdbc.Driver");
//	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/BDVYM8z2Qq", 
	                    "BDVYM8z2Qq",
	                    "qO0HHHCgea");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from student");
	            while (rs.next()) {
	                System.out.println(rs.getInt(1) + "  " + rs.getString(2));
	            }
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}



//	<https://teams.microsoft.com/l/message/19:7e73a27127214638ac1f368a65d5dd12@thread.skype/1580371798148?tenantId=a45fe71a-f480-4e42-ad5e-aff33165aa35&amp;groupId=ccfc171b-9bd5-4826-b80c-370b50bef60f&amp;parentMessageId=1580371798148&amp;teamName=NAGP 2020 QA Batch Workshop on Core Java&amp;channelName=General&amp;createdTime=1580371798148>


