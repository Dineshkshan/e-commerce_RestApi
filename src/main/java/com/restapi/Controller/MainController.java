package com.restapi.Controller;

import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.restapi.Dao.MainmodelDao;
import com.restapi.Model.Mainmodel;

@Controller
public class MainController {
	
	@Autowired
	private MainmodelDao mainmodel;
	
	String StoreType;
	
	@RequestMapping("/index")
	public String indexpage()
	{
		return "index";
	}
	
	@RequestMapping(value="/mainpage",method=RequestMethod.GET)	
	public ModelAndView mainpage(HttpServletRequest request,HttpServletResponse response,Model models)
	{
		String type=request.getParameter("search");
		System.out.println(type);
		StoreType=type;
		List<Mainmodel> model=mainmodel.findByType(type);
//		for (Iterator iterator = model.iterator(); iterator.hasNext();) {
//			Mainmodel mainmodel = (Mainmodel) iterator.next();
//			System.out.println(mainmodel.getProductName());
//		}
		models.addAttribute("bookproduct",new Mainmodel());
		ModelAndView mv=new ModelAndView();
		mv.addObject("value",model);
		mv.setViewName("Book");
		return mv;
	}
	
	@RequestMapping( value="/Main",method = RequestMethod.GET)
	public ModelAndView MainPage(Model models)
	{
		List<Mainmodel> model=mainmodel.findByType(StoreType);
		models.addAttribute("bookproduct",new Mainmodel());
		ModelAndView mv=new ModelAndView();
		mv.addObject("value",model);
		mv.setViewName("Book");
		return mv;
	}
  
}
