package com.contect5;

import com.contect4.Emp;

public class EmpService implements IEmpService {
	public Emp findEmpByNicknameAndPassword(String nickname, String password) {

		// 获取到专门处理持久层方面的对象
		IEmpDao empDao = new EmpDao();

		// 调用dao中的方法
		return empDao.findEmpByNicknameAndPassword(nickname, password);

	}


}
