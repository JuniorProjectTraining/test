package com.contect5;

import com.contect4.Emp;

public class EmpService implements IEmpService {
	private IEmpDao empDao = new EmpDao();

	public Emp findEmpByNicknameAndPassword(String nickname, String password) {


		// 调用dao中的方法
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}

	public int findEmpByNickname(String nickname) {
		return empDao.findEmpByNickname(nickname);
	}

	public void registerEmp(Emp emp) {
		empDao.registerEmp(emp);
	}


}
