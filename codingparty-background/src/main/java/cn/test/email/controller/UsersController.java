package cn.test.email.controller;



import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.test.email.model.PageBean;
import cn.test.email.model.Users;
import cn.test.email.service.IUserService;

@Controller
@RequestMapping("/user")
public class UsersController {
	
	@Autowired
	private IUserService iUserService;
	
	//登录
	@RequestMapping("/dologin")
	public String doLogin(Users user,HttpSession session,HttpServletRequest request) throws Exception{
		Users u=iUserService.selectUsers(user);
		session.setAttribute("loginUser", u);
	
		if(u!=null){
			//如果是管理员就跳转到管理页面
			return "redirect:/toMyExam.do";
		}
		//用户跳转到用户考试页面
		return "redirect:/toUserExam.do?rank="+u.getRank();
	}
	
	
	//登出
	@RequestMapping("/loginOut")
	public String loginOut(HttpSession session) throws Exception{
		
		session.invalidate();
		return "login";
		
	}
	
	
	

	
	
	
	
	
}
