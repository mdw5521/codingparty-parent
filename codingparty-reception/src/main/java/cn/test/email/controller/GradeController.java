package cn.test.email.controller;

import java.util.HashMap;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.test.email.model.TPaperHistory;
import cn.test.email.model.TQuestionHistory;
import cn.test.email.service.PaperHistoryService;
import cn.test.email.service.QuestionHistoryService;
/**
 * 评分
 * @author AdminMcj
 *
 */
@Controller
@RequestMapping("/paper")
public class GradeController {

	@Autowired
	private QuestionHistoryService questionHistoryService;
	
	@Autowired
	private PaperHistoryService paperHistoryService;
	
	private Logger logger = Logger.getAnonymousLogger();
//	private static Logger log =Logger.getLogger(BankController.class);
	
	@RequestMapping("savepaper.do")
	public String savePaper(Integer pid,Integer uid,Integer[] qid,
		String[] uanswer,Integer[] state,Integer type,Model model){
		TQuestionHistory qhistory = new TQuestionHistory();
		qhistory.setUid(uid);
		qhistory.setPid(pid);
		for (int i = 0; i < qid.length; i++) {
			qhistory.setQid(qid[i]);
			qhistory.setUanswer(uanswer[i]);
			qhistory.setState(state[i]);
			questionHistoryService.saveQuestion(qhistory);
		}
		int count=0;
		for (int j = 0; j < state.length; j++) {
			if(state[j]==0){
				count++;
			}
		}
//		System.out.println("答对了："+count);
//		System.out.println("打错了："+(state.length-count));
		TPaperHistory phistory = new TPaperHistory();
		phistory.setPid(pid);
		phistory.setUid(uid);
		phistory.setTotalscore(100/state.length*count);
//		System.out.println("总分："+100/state.length*count);
		paperHistoryService.savePaper(phistory);
		
		model.addAttribute("totalnum", qid.length);
		model.addAttribute("count", count);
		model.addAttribute("totalscore", 100/state.length*count);
		return "gradeA";
	}
	

}
