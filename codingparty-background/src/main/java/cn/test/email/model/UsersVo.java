package cn.test.email.model;

public class UsersVo {
	
	private  Integer dbBegin;//每页的开始数据
	private  Integer pageCount;//每页数据记录数将   数据初始化
	private String uname=null;

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

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	

	
	
	
	
	
	

}
