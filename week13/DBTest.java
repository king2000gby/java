package week13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		//1.��������
		String driverName = "com.mysql.jdbc.Driver";
		Class.forName(driverName);
		//2.���������ݿ������
		String url = "jdbc:mysql://127.0.0.1:3306/wtu?useUnicode=true&characterEncoding=utf-8";
		String userName = "root";
		String password = "990428";
		Connection con = DriverManager.getConnection(url,userName,password);
		
		//3.�������
		//String sql = "select * from t_student";
		//String sql = "delete  from t_student where sno = '1001'";
		String sql = "update t_student set sex = '��' where sno = '1002'";
		PreparedStatement pst = con.prepareStatement(sql);
		
		//4.ִ�����
		//ResultSet rs = pst.executeQuery();
		
		/*int icount =  pst.executeUpdate();
		System.out.println("ɾ����¼:"+icount);*/
		
		int icount =  pst.executeUpdate();
		System.out.println("�޸ļ�¼:"+icount);
		
		
		
		//5.���ؽ������
		
		
		/*while(rs.next()){
			String sno = rs.getString("sno");
			String sname = rs.getString("sname");
			String birth = rs.getString("birth");
			String sex = rs.getString("sex");
			System.out.println(sno+"\t"+sname+"\t"+birth+"\t"+sex);
		}*/
		//6.�ͷ���Դ		
		//rs.close();
		pst.close();
		con.close();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}

