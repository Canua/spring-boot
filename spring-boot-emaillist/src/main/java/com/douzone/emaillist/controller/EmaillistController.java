package com.douzone.emaillist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.emaillist.dao.EmaillistDao;
import com.douzone.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	// 우리가 new를 하지않고 컨테이너에게 맡긴다.
	// 컨테이너가 세팅을 한다.
	// 비즈니스와 웹 화면을 분리를 위해서
	@Autowired
	private EmaillistDao emaillistDao;

	/*
	 * // 데이터를 넘기는 방법 // 1. ModelAndView
	 * 
	 * @RequestMapping("") public ModelAndView list() { ModelAndView mav = new
	 * ModelAndView(); mav.addObject("list", emaillistDao.getList());
	 * mav.setViewName("/WEB-INF/views/list.jsp");
	 * 
	 * return mav; }
	 */
	// 데이터를 넘기는 방법
	// 2. 매핑할 때 파마미터 정보를 넣어서 넘긴다.
	@RequestMapping({"", "/list"})
	public String list(Model model) {
		model.addAttribute("list", emaillistDao.getList());
		return "list";
	}

	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(EmaillistVo emaillistVo) {
		emaillistDao.insert(emaillistVo);	
		// redirect
		return "redirect:/";
	}
}