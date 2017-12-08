package cn.test.email.controller;

import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.test.email.model.TQuestion;
import cn.test.email.service.TestQuestionsService;

@Controller
public class TestQuestionsController {

	@Autowired
	private TestQuestionsService testQuestionsService;
	
	private Logger logger=Logger.getAnonymousLogger();
	
	
	
	/**
	 * 添加试题
	 * @throws Exception 
	 */
	@RequestMapping("/addDo.do")
	public String addDo(TQuestion tQuestion,String[] options) {

		if(options!=null && options.length>1){
			String st="";
			for (int i = 0; i < options.length; i++) {
				st+=options[i]+",";
			}
			tQuestion.set_option(st);
		}else if(options!=null && options.length==1){
			tQuestion.set_option(options[0]);
		}
		
		
		try {
			testQuestionsService.addQuestion(tQuestion);
		} catch (Exception e) {
			logger.info("添加失败");
		}
		Integer type = tQuestion.getType();//试题的类型
		return "redirect:/shoudong.do?type="+type;
	}
	
	
	
	
	
}
