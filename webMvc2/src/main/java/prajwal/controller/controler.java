package prajwal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controler {
    @GetMapping("/prajwal")
    public ModelAndView getmsg() {
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("msg", "hi prajwal");
    	mav.setViewName("index");
    	
    	return mav;
    }
    @GetMapping("/sinkar")
    public ModelAndView getmsg2() {
    	ModelAndView mav = new ModelAndView();
    	mav.addObject("msg", "hi prajwal sinkar");
    	mav.setViewName("index");
    	return mav;
    }
}
