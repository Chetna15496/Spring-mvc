package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {
	
	@GetMapping("/show")
	public String show(Model m, HttpServletRequest req) {
		int prodId=Integer.parseInt(req.getParameter("txtpid"));
		String prodName=req.getParameter("txtpname");
		float price=Float.parseFloat(req.getParameter("txtprice"));
		m.addAttribute("prodId", prodId);
		m.addAttribute("prodName", prodName);
		m.addAttribute("price", price);
		return "show";
	}
	@GetMapping("/hello")
	public void hello(HttpServletResponse res) throws IOException {
		res.getWriter().println("Hello world");
	}

}
