package com.contect5;

import com.contect4.Emp;

public interface IEmpService {

	/**
	 * ͨ���ǳƺ��������emp����
	 * @param nickname
	 * @param password
	 * @return
	 */
	Emp findEmpByNicknameAndPassword(String nickname, String password);
	
}