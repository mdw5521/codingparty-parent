/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-12-07 12:44:03 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!-- saved from url=(0040)http://kao.acmcoder.com/enterprise/login -->\r\n");
      out.write("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>CodingParth后台管理页面</title>\r\n");
      out.write("\t\t <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"http://kao.acmcoder.com/images/acm.ico\" type=\"image/x-icon\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/all-exam.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/login.css\">\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/comp-enterprise.css\">\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/dologin.do\" method=\"post\" id=\"form\">\r\n");
      out.write("\t\t<!--head-->\r\n");
      out.write("\t\t<div class=\"head\">\r\n");
      out.write("\t\t\t<div class=\"head-bar public\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\">\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/home.do\"></a>\r\n");
      out.write("\t\t\t\t\t<p><span ><font size=\"5\">CodingParth后台管理页面</font></span></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!--head  end-->\r\n");
      out.write("\t\t<div class=\"main-box\">\r\n");
      out.write("\t\t<div class=\"userCnt\">\r\n");
      out.write("\t\t\t<div class=\"loginCnt\">\r\n");
      out.write("\t\t\t\t<h1>登录</h1>\r\n");
      out.write("\t\t\t\t<div class=\"login-box\">\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" id=\"phone\" name=\"name\" class=\"login-text input\" placeholder=\"请输入管理员账号\" maxlength=\"11\">\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" id=\"pwd\" name=\"pass\" class=\"login-text input\" placeholder=\"请输入密码\" maxlength=\"20\">\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"login-error\" id=\"err_msg\" style=\"display: none;\"><i></i>账号或密码输入错误</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"login-error\"><i></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ msg }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"登录\" id=\"sbtn\" class=\"login-btn btn\">\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"login-t\">\r\n");
      out.write("\t\t\t\t\t\t\t<span>\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"auto_login\"> <label for=\"auto_login\">下次自动登录</label>\r\n");
      out.write("\t\t\t\t\t\t\t</span>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\">忘记密码？</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"login-f\">\r\n");
      out.write("\t\t\t\t\t还没有账号，<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/register.do\">马上注册 &gt;&gt;</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/hm.js.aaa\"></script><script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/jquery.min.js.aaa\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/jquery.cookie.js.aaa\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/footer-exam.js.aaa\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/all.js.aaa\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/dataCheck.js.aaa\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/md5.js.aaa\" type=\"text/javascript\" charset=\"utf-8\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\tvar checkMobile = function(str) {\r\n");
      out.write("\t\t\tvar re = /^1\\d{10}$/;\r\n");
      out.write("\t\t\tif (re.test(str))\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar checkPwd = function(str) {\r\n");
      out.write("\t\t\tvar re = /^[a-zA-z0-9]\\w{5,}$/;\r\n");
      out.write("\t\t\tif (re.test(str))\r\n");
      out.write("\t\t\t\treturn true;\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tvar setErrMsg = function(_id, msg){\r\n");
      out.write("\t\t\tif(_id.parent().find('span').length == 0)\r\n");
      out.write("\t\t\t\t_id.parent().addClass('regisit-error').append('<span class=\"login-error \"><i></i>' + msg + '</span>');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\tvar $phone = $('#phone'), $pwd = $('#pwd'), $err_msg = $('#err_msg');\r\n");
      out.write("\t\t\t$('#sbtn').click(function(){\r\n");
      out.write("\t\t\t\tvar tosub = true;\r\n");
      out.write("\t\t\t\tif($.trim($phone.val())==''){\r\n");
      out.write("\t\t\t\t\ttosub = false;\r\n");
      out.write("\t\t\t\t\tsetErrMsg($phone, '请输入手机号码');\r\n");
      out.write("\t\t\t\t}else if( !checkMobile( $.trim( $phone.val() ) ) ){\r\n");
      out.write("\t\t\t\t\ttosub = false;\r\n");
      out.write("\t\t\t\t\tsetErrMsg($phone, '手机号码格式不正确');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif($.trim($pwd.val())==''){\r\n");
      out.write("\t\t\t\t\ttosub = false;\r\n");
      out.write("\t\t\t\t\tsetErrMsg($pwd, '请输入密码');\r\n");
      out.write("\t\t\t\t}else if(!checkPwd($.trim($pwd.val()))){\r\n");
      out.write("\t\t\t\t\ttosub = false;\r\n");
      out.write("\t\t\t\t\tsetErrMsg($pwd, '密码输入格式错误');\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t    if(tosub){\r\n");
      out.write("\t\t\t        /* var domain = 'kao.acmcoder.com';\r\n");
      out.write("\t\t\t\t\tvar data = getData({'phone': $.trim($phone.val()), 'pwd': $.trim($pwd.val())},\"loginc\",domain);\r\n");
      out.write("\t\t\t\t\t$.post('/enterprise/loginc',data,function(json){\r\n");
      out.write("\t\t\t\t\t\tif(json.success){\r\n");
      out.write("\t\t\t\t\t\t\tif(!!json.msg){\r\n");
      out.write("\t\t\t\t\t\t\t\tif(location.search=='?choseCompang'){\r\n");
      out.write("                                    window.location.href='https://demo2.acmcoder.com/v4.0/union/html/choseCompany/choseCompang.html';\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\tif(json.msg=='NULL'){\r\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.location.href='/enterprise';\r\n");
      out.write("\t\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\t\twindow.location.href=json.msg;\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t\twindow.location.href='/enterprise';\r\n");
      out.write("\t\t\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t\t\t$err_msg.html(\"<i></i>\"+json.msg);\r\n");
      out.write("\t\t\t\t\t\t\t$err_msg.show();\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},'json');  */\r\n");
      out.write("\t\t\t    \t$('#form').submit();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("/* \t\t\t$('li input').keydown(function(){\r\n");
      out.write("\t\t\t\t$err_msg.hide();\r\n");
      out.write("\t\t\t\t$(this).parent().removeClass('regisit-error');\r\n");
      out.write("\t\t\t\t$(this).parent('span').removeClass('regisit-error');\r\n");
      out.write("\t\t\t\t$(this).siblings('span').remove();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$(document).keydown(function(event){\r\n");
      out.write("\t\t\t\tif(event.keyCode == 13)\r\n");
      out.write("\t\t\t\t\t$('#sbtn').click();\r\n");
      out.write("\t\t\t});\r\n");
      out.write(" */\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"footer\"><div class=\"public\"><div class=\"footer-left\"><div class=\"footer-logo\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/blogo.png\" style=\"position: relative;top: -3px;\"></div><div class=\"footer-txt\"><a target=\"_blank\" href=\"http://www.acmcoder.com/aboutus/about.html\">关于我们</a>　|　<a target=\"_blank\" href=\"http://www.acmcoder.com/aboutus/contact.html\">联系我们</a>　|　<a target=\"_blank\" href=\"http://www.acmcoder.com/aboutus/shengming.html\">免责声明</a><br>Copyright © acmcoder.com<br>All Rights Reversed 京ICP备15012255-1</div></div><div class=\"footer-right\"><table><tbody><tr><td><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/f-phone.png\"></td><td style=\"font-size: 14px;\">客服热线：010-85359782<br>销售热线：010-85359766</td><td style=\"font-size: 14px;\"><a class=\"weixinPng\" href=\"javascript:void(0)\" style=\"color:white;position: relative;\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/f-weixin.png\"> &nbsp;&nbsp;iamacmcoder<img class=\"hide\" style=\"width: 80px;position: absolute;left: 130px;top: -50px;\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/saimaweixin.jpg\"></a><br><a href=\"javascript:void(0)\" style=\"color:white\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js-css-image/f-qq.png\"> &nbsp;&nbsp;2531743633</a><br></td></tr></tbody></table></div></div></div><div class=\"topW\" style=\"display: none; right: 351px;\"><span></span></div></form></body></html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}