package com.contect5;

import com.contect4.Emp;

public interface IEmpDao {

	/**
	 * ͨ���ǳƺ��������emp����
	 * 
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);

	int findEmpByNickname(String nickname);


	void registerEmp(Emp emp);

}
