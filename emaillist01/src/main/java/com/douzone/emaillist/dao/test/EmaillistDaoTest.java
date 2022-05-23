package com.douzone.emaillist.dao.test;

import java.util.List;

import com.douzone.emaillist.dao.EmaillistDao;
import com.douzone.emaillist.vo.EmaillistVo;

public class EmaillistDaoTest {

	public static void main(String[] args) {
		// testInsert();
		// testFindAll();	
	}

	private static void testFindAll() {
		List<EmaillistVo> list  = new EmaillistDao().findAll();
		for(EmaillistVo vo: list)
			System.out.println(vo);
	}
	
	private static void testInsert() {
		EmaillistVo vo = new EmaillistVo();
		vo.setFirstName("길");
		vo.setLastName("동이");
		vo.setEmail("gildong@gmail.com");
		
		new EmaillistDao().insert(vo);
	}
}
