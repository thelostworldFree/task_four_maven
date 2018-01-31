package com.fuwei.controller;


import java.util.List;

import com.fuwei.pojo.CarrerDetail;
import com.fuwei.pojo.Student;
import com.fuwei.service.CarrerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CarrerDetailController {
	@Autowired
    CarrerDetailService studentService;

	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public ModelAndView DetailList(){
	
		ModelAndView mav = new ModelAndView();
		List<CarrerDetail> html= studentService.list1("前端开发方向");
		List<CarrerDetail> java= studentService.list1("后端开发方向");
		List<CarrerDetail> move= studentService.list1("移动开发方向");
		List<CarrerDetail> whole= studentService.list1("整站开发方向");
		List<CarrerDetail> run= studentService.list1("运维开发方向");
		// 放入转发参数
		mav.addObject("html", html);
		mav.addObject("java", java);
		mav.addObject("move", move);
		mav.addObject("whole", whole);
		mav.addObject("run", run);
		// 放入jsp路径
		mav.setViewName("detail");
		return mav;
	}
	

}
