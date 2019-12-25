package com.contect5;

import com.contect4.Emp;

public interface IEmpDao {

	/**
	 * 通过昵称和密码查找emp对象
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);

	int findEmpByNickname(String nickname);


	void registerEmp(Emp emp);

}
