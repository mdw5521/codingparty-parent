package cn.test.email.controller;

import java.util.List;
import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.test.email.model.SeedPaper;
import cn.test.email.model.Shouvo;
import cn.test.email.model.TExamQuestion;
import cn.test.email.model.TestPaper;
import cn.test.email.service.AddTiService;
import cn.test.email.service.TestPaperService;

@Controller
public class TestPaperController {

	@Autowired
	private TestPaperService testPaperService;
	@Autowired
    private AddTiService addTiService;

	private Logger logger = Logger.getAnonymousLogger();

	/**
	 * 管理页面 跳转到我的试卷页面 查询出所有的试卷 以及子卷
	 */
	@RequestMapping("/toMyExam.do")
	public String toMyExam(Model model, SeedPaper sp) {
		List<TestPaper> testPaper = null;
		try {
			testPaper = testPaperService.selectAllTestPaper(sp);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("查询试卷失败！");
		}
		if (testPaper != null) {
			model.addAttribute("testPaper", testPaper);
		}
		
		return "my-test-paper";
	}

		

}
