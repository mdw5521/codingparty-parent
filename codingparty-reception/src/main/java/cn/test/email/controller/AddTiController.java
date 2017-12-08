package cn.test.email.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.test.email.model.Shouvo;
import cn.test.email.model.TExamQuestion;
import cn.test.email.model.TestPaper;
import cn.test.email.service.AddTiService;



@Controller
public class AddTiController {
	@Autowired
    private AddTiService addTiService;
	
	
	
	/*
	 * 预览试卷
	 */
	@RequestMapping("yl.do")
	public String yl(Integer id,Model model,String time,String pname) throws UnsupportedEncodingException{
		List<TExamQuestion> list = addTiService.yl(id);
		
		pname=new String(pname.getBytes("ISO-8859-1"), "utf-8");
		time=new String(time.getBytes("ISO-8859-1"), "utf-8");
		Shouvo s=null;
		
	  if(list.size()>0&&list!=null){
			s=new Shouvo();
			s.setL(list);
			s.setPname(pname);
			s.setTime(time);
			
		for (TExamQuestion tExamQuestion : list) {
			String option = tExamQuestion.get_option();
			if(option!=null){
				
				String[] split = option.split(",");
				List<String> ops =tExamQuestion.getOps();
				for (int i = 0; i < split.length; i++) {
					ops.add(split[i]);
				}
			}
		  }
		}
	    model.addAttribute("list", s);
		/*model.addAttribute("list", time);
		model.addAttribute("list", list);*/
		return "my-exam";
	
		
		
	}
	
}
