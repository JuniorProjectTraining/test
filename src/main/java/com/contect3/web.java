package com.contect3;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contect4.Emp;
import com.contect5.EmpService;
import com.contect5.IEmpService;

@WebServlet("/EmpServlet")
public class web extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");

		// ����Ո�󅢔�
		String cmd = req.getParameter("cmd");

		if ("login".equals(cmd)) {
			login(req, resp);
		}else if ("register".equals(cmd)) {
			register(req, resp);
		}


		System.out.print("OK");

	}

	/**
	 * ����ר�����ڴ����¼���ܵķ���
	 * 
	 * @param req
	 * @param resp
	 * @throws IOException
	 */
	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		/**
		 * ˼·: 1, ��ȡ���û�������ǳƺ�����<br>
		 * 2, Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û����� 3, �������, �������¼ 4, ���������, ������û�[�˺Ż���������,
		 * �뾭�����¼, �����ǵ��[ע��]]
		 */

		// 1, ��ȡ���û�������ǳƺ�����<br>
		String nickname = req.getParameter("nickname");
		String password = req.getParameter("password");

		System.out.println(nickname);
		System.out.println(password);

		// 2, Ȼ��ȥ���ݿ��в����Ƿ������ж�Ӧ�ǳƺ�������û�����
		IEmpService service = new EmpService();

		Emp emp = service.findEmpByNicknameAndPassword(nickname, password);

		if (emp != null) {
			resp.getWriter().write("��¼�ɹ�, ��ӭ: " + emp);

			return;
		} else {
			resp.getWriter().write("�˺Ż���������, ������¼");
		}

	}
	private void register(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// ���Ȼ�ȡ��ǰ̨ҳ�洫�ݵ�����
		String nickname = req.getParameter("nickname");
		String password = req.getParameter("password");
		String gender = req.getParameter("gender");
		double salary = Double.parseDouble(req.getParameter("salary"));

		/**
		 * ���������ж��ǳ��Ƿ��Ѿ���ʹ��, �����ʹ��, ������ע��.
		 */
		// ��ȡ���������
		IEmpService service = new EmpService();

		// �����ж��û����Ƿ���ڵķ���.
		// 1��ʾ����, ��1��ʾ������
		int flag = service.findEmpByNickname(nickname);

		if (flag == 1) {
			// ����ʾ��Ϣ���뵽��������
			req.setAttribute("nicknameMsg", "���ǳ��Ѵ���, �뻻һ���ǳ�");
			// ����ת��
			req.getRequestDispatcher("/registere.jsp").forward(req, resp);

			return;
		} else {
			// �����е����ݷ�װ��ʵ�������
			Emp emp = new Emp(1, nickname, password, gender, salary);

			// ����ע��ķ���
			service.registerEmp(emp);

			resp.getWriter().write("ע��ɹ�, 3s����ת����¼ҳ��");

			resp.setHeader("refresh", "3;url=/second/login.jsp");
		}

	}



}
