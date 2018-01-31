package com.fuwei.controller;


import java.util.List;

import com.fuwei.pojo.Student;
import com.fuwei.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fuwei.service.CarrerDetailService;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping(value="/index",method=RequestMethod.GET)
	public ModelAndView listCategory(){
	
		ModelAndView mav = new ModelAndView();
		List<Student> cs= studentService.list();
		int count= studentService.count(1);
		int count2= studentService.count(2);
		// 放入转发参数
		mav.addObject("cs", cs);
		mav.addObject("cs1", count);
		mav.addObject("cs2", count2);
		// 放入jsp路径

		mav.setViewName("index");
		return mav;
	}
	/*@RequestMapping(value="/index2",method=RequestMethod.GET)
	public ModelAndView count(){

		ModelAndView mav = new ModelAndView();
		int count= studentService.count(1);

		// 放入转发参数
		mav.addObject("cs1", count);
		// 放入jsp路径
		mav.setViewName("/index");
		return mav;
	}*/

}
