package com.contect5;

import com.contect4.Emp;

public class EmpService implements IEmpService {
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// ��ȡ��ר�Ŵ���־ò㷽��Ķ���
		IEmpDao empDao = new EmpDao();

		// ����dao�еķ���
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}


}
