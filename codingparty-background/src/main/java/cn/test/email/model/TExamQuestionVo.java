package cn.test.email.model;

import java.util.List;

@SuppressWarnings("serial")
public class TExamQuestionVo extends TExamQuestion{

	private  Integer dbBegin;//每页的开始数据
	private  Integer pageCount;//每页数据记录数将   数据初始化
	private  List<Integer> ids;
	
	
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	public Integer getDbBegin() {
		return dbBegin;
	}
	public void setDbBegin(Integer dbBegin) {
		this.dbBegin = dbBegin;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	
	
	
}
