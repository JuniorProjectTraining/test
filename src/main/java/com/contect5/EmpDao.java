package com.contect5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.contect.MyDBUtils;
import com.contect4.Emp;

public class EmpDao implements IEmpDao {

	public Emp findEmpByNicknameAndPassword(String nickname, String password) {
		
		String sql = "select * from emp where nickname=? and password=?";

		// 1, ��ȡ���������ݿ�Ķ���
		Connection connection = MyDBUtils.getConnection();

		try {

			// 2, ��ȡ��ִ��sql����Ԥ�������
			PreparedStatement prepareStatement = (PreparedStatement) connection.prepareStatement(sql);

			// 3, ��sql�е�ռλ��[?] ��ֵ
			prepareStatement.setString(1, nickname);
			prepareStatement.setString(2, password);

			// 4, ִ��sql���, �õ������
			ResultSet resultSet = prepareStatement.executeQuery();

			// 5, �����ֵ, ���װ, Ȼ��, ����
			while (resultSet.next()) {
				// ��ȡ���ݿ��ж�Ӧ������ֵ
				int id = resultSet.getInt("id");
				String gender = resultSet.getString("gender");
				double salary = resultSet.getDouble("salary");

				// �����ݸ�ײ��������
				Emp emp = new Emp(id, nickname, password, gender, salary);

				return emp;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				// �Ͽ�����, �ͷ���Դ
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}

