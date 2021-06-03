package week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//1.加载驱动
		String driverName = "com.mysql.jdbc.Driver";
		Class.forName(driverName);
		//2.建立与数据库的链接
		String url = "jdbc:mysql://127.0.0.1:3306/wtu?useUnicode=true&characterEncoding=utf-8";
		String userName = "root";
		String password = "990428";
		Connection con = DriverManager.getConnection(url,userName,password);
		
		//3.创建语句
		//String sql = "select * from t_student";
		//String sql = "delete  from t_student where sno = '1001'";
		String sql = "update t_student set sex = '男' where sno = '1002'";
		PreparedStatement pst = con.prepareStatement(sql);
		
		//4.执行语句
		//ResultSet rs = pst.executeQuery();
		
		/*int icount =  pst.executeUpdate();
		System.out.println("删除记录:"+icount);*/
		
		int icount =  pst.executeUpdate();
		System.out.println("修改记录:"+icount);
		
		
		
		//5.返回结果处理
		
		
		/*while(rs.next()){
			String sno = rs.getString("sno");
			String sname = rs.getString("sname");
			String birth = rs.getString("birth");
			String sex = rs.getString("sex");
			System.out.println(sno+"\t"+sname+"\t"+birth+"\t"+sex);
		}*/
		//6.释放资源		
		//rs.close();
		pst.close();
		con.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

