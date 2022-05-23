package com.douzone.guestbook.dao.test;
import java.util.Date;
import java.util.List;

import com.douzone.guestbook.dao.guestbookDao;
import com.douzone.guestbook.vo.guestbookVo;

public class guestbookDaoTest {

	public static void main(String[] args) {
	//	testInsert();
	//	testFindPassword();
	//	testDelete();
		
	}

	private static void testDelete() {
		new guestbookDao().delete(3L);
	}

	private static void testFindPassword() {
		
		List<guestbookVo> list = new guestbookDao().findByPassword(3L);
		for(guestbookVo vo: list)
			System.out.println(vo);
		
	}

	private static void testFindAll() {
		List<guestbookVo> list = new guestbookDao().findAll();
		for(guestbookVo vo: list)
			System.out.println(vo);
	}
	
	private static void testInsert() {
		guestbookVo vo = new guestbookVo();
		vo.setName("이름1");
		vo.setPassword("비번1");
		vo.setMessage("메시지1");
		new guestbookDao().insert(vo);
	}

}
