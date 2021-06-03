package week13;
import java.sql.*;              
import java.util.Scanner;
public class SqlDBTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; // ���ӵ���SQL server
			Class.forName(driverName);
			String url = "jdbc:sqlserver://localhost:1433;DatabaseName=msi"; // �˿ں��� 1433
			String userName = "sa"; // �ҵ��û���
			String password = "0318"; // �ҵ�����
			Connection con = DriverManager.getConnection(url, userName, password);

			System.out.print("��Ҫ���������ѧ����");
			int count;
			Scanner scan = new Scanner(System.in);
			count = scan.nextInt();

			for (int i = 1; i <= count; i++) {
				System.out.print("�����" + i + "��ѧ������Ϣ(�ö��ŷָ�):");
				String info = scan.next();
				String stu[] = info.split(",|��");
				String sql = "insert into tstudent(id,name,gender,birth,score) values(?,?,?,?,?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, stu[0]);
				ps.setString(2, stu[1]);
				ps.setString(3, stu[2]);
				ps.setString(4, stu[3]);
				ps.setFloat(5, Float.parseFloat(stu[4]));
				int icount =  ps.executeUpdate();
				System.out.println("�޸ļ�¼:"+icount);
				ps.close();
			}
			
			System.out.print("��Ҫ��ѯ��ѧ��Ϊ:");
			String sno = scan.next();
			String sql = "select * from tstudent where id = '1001'";   //���� ��1001��Ӧ����sno��Ӧ��ֵ�����ǲ�֪�����
			                                                           //��sno���������滹��ԭ��ֵ����ʽ
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				String id = rs.getString("id");
				String sname = rs.getString("name");
				String sex = rs.getString("gender");
				String birth = rs.getString("birth");
				String score = rs.getString("score");
				System.out.println(id+"\t"+sname+"\t"+sex+"\t"+birth+"\t"+score);
			}
			rs.close();
			pst.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
