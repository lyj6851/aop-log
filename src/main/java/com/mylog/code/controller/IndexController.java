package com.mylog.code.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	/**Freemarker模板的Controller*/  
    @RequestMapping(value="/",method={RequestMethod.GET})  
	public ModelAndView getMain(HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/login/index");
		return mv;
	}

    /**jsp模板的Controller*/  
    @RequestMapping(value="/jsp",method={RequestMethod.GET})  
    public ModelAndView getJsp(HttpServletRequest request) {  
  
        ModelAndView mv = new ModelAndView("index");  
        mv.addObject("message1", "切换到jsp模板、");  
        mv.addObject("message2", "My First Spring Mvc");  
        mv.setViewName("index");  
        return mv;  
    }  
}
