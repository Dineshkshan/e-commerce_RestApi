package com.restapi.Controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.restapi.Dao.OrdertableDao;
import com.restapi.Model.Mainmodel;
import com.restapi.Model.Ordertable;

@Controller
public class OrderController {
	
	@Autowired
	private OrdertableDao order;
	
	@Autowired
	private MainController main;

	@RequestMapping("/MainPage")
	public void cartpage(@ModelAttribute("bookproduct") Mainmodel model,Model m,HttpServletResponse response) throws Exception
	{
		PrintWriter out=response.getWriter();
		System.out.println(main.StoreType);
		System.out.println(model.getProductName());
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
	    System.out.println(formatter.format(date));
	    Ordertable ordertable=new Ordertable(main.StoreType,model.getProductName(),formatter.format(date));
	    order.save(ordertable);
	    List<Ordertable> table=order.findAll();
		//ModelAndView mv=new ModelAndView();
//		mv.addObject("value",table);
//		mv.setViewName("Cart");
		m.addAttribute("value",table);
		//return "Cart";
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Added to cart Successfully');");
		out.println("location='/Main';");
		out.println("</script>");
		
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteitem(@PathVariable int id)
	{
		System.out.println("Product name is"+id);
		//Ordertable ortable=new Ordertable(ProductName);
		order.deleteById(id);
		return "redirect:/Cart";
	}
	
	@RequestMapping("/Cart")
	public ModelAndView cartredirect()
	{
		List<Ordertable> table=order.findAll();
		ModelAndView mv=new ModelAndView();
		mv.addObject("value",table);
		mv.setViewName("Cart");
		return mv;
	}
	
	@RequestMapping(value="/confirmorder")
	public String confirmorderhere()
	{
		return "ConfirmOrder";
	}
}
