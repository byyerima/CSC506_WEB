package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />\n");
      out.write("<title>CSC506 WEB AND INTERNET PROGRAMMING</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {color: #0000FF}\n");
      out.write(".style2 {color: #FF0000}\n");
      out.write(".text-center {text-align:center!important}\n");
      out.write(".style5 {\n");
      out.write("\tcolor: #0000FF;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("}\n");
      out.write(".style7 {color: #000000; font-size: 16px; }\n");
      out.write(".style8 {font-size: 16px}\n");
      out.write("#Layer1 {\n");
      out.write("\tposition:absolute;\n");
      out.write("\tleft:493px;\n");
      out.write("\ttop:846px;\n");
      out.write("\twidth:102px;\n");
      out.write("\theight:17px;\n");
      out.write("\tz-index:1;\n");
      out.write("\tbackground-color: #FF0000;\n");
      out.write("}\n");
      out.write(".style9 {color: #00FF00}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<div align=\"center\">\n");
      out.write("  <table width=\"829\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\n");
      out.write("    <!--DWLayoutTable-->\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"158\" colspan=\"20\" valign=\"top\"><img src=\"images/BANNA.png\" width=\"828\" height=\"158\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"19\" colspan=\"20\" valign=\"top\" bgcolor=\"#FFFF33\"><div align=\"center\" class=\"style1\">HOME! &nbsp;&nbsp;COURSE!&nbsp;&nbsp;&nbsp; <a href=\"login.jsp\">LOGIN!</a>&nbsp;<a href=\"sign.jsp\">REGISTER!</a>&nbsp;&nbsp;ABOUT US! </div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"19\" colspan=\"20\" valign=\"top\" bgcolor=\"#00CC99\"><span class=\"style2\"><marquee>\n");
      out.write("        <div align=\"center\">Welcome to CSC506, Web and Internet Programming class by Mr. A.U Atiku</div>\n");
      out.write("      </marquee>\n");
      out.write("      </span> </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"377\" colspan=\"20\" valign=\"top\"><object classid=\"clsid:166B1BCA-3F9C-11CF-8075-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/director/sw.cab#version=8,5,0,0\" width=\"828\" height=\"377\">\n");
      out.write("          <param name=\"src\" value=\"web.gif\" />\n");
      out.write("          <embed src=\"images/web.gif\" pluginspage=\"http://www.macromedia.com/shockwave/download/\" width=\"828\" height=\"377\"></embed>\n");
      out.write("      </object></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td width=\"9\" height=\"247\">&nbsp;</td>\n");
      out.write("      <td colspan=\"5\" rowspan=\"4\" valign=\"top\"><p align=\"center\" class=\"style5\">THE WEB </p>        <p align=\"center\" class=\"style7\">The Web  is the leading information retrieval service of the Internet (the worldwide  computer network). The Web gives users access to a vast array of documents that  are connected to each other by means of hypertext or hypermedia links&mdash;i.e.,  hyperlinks, electronic connections that link related pieces of information in  order to allow a user easy access to them.....</p></td>\n");
      out.write("      <td width=\"12\">&nbsp;</td>\n");
      out.write("      <td colspan=\"3\" valign=\"top\"><p align=\"center\" class=\"style1\">THE INTERNET </p>\n");
      out.write("      <p align=\"center\" class=\"style7\">The  Internet is a global network of billions of computers and other electronic  devices. With the Internet, it's possible to access almost any information,  communicate with anyone else in the world, and do much more. The Internet is an  increasingly important part of everyday life for people around the world. But  if you've never used the Internet before, all of this new information might  feel a bit confusing at first....</p>        <p align=\"center\">&nbsp;</p></td>\n");
      out.write("      <td width=\"14\">&nbsp;</td>\n");
      out.write("      <td colspan=\"8\" rowspan=\"4\" valign=\"top\"><p align=\"center\" class=\"style1\">PROGRAMMING</p>\n");
      out.write("      <p align=\"center\" class=\"style8\">programming  is giving a set of instructions to a computer to execute. If you&rsquo;ve ever cooked  using a recipe before, you can think of yourself as the computer and the  recipe&rsquo;s author as a programmer. The recipe author provides you with a set of  instructions which you read and then follow. The more complex the instructions,  the more complex the result! Programming is, quite literally, all around us.  From the take-out we order, to the movies....</p>        <p align=\"center\">&nbsp;</p></td>\n");
      out.write("      <td width=\"22\">&nbsp;</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"2\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td width=\"96\"></td>\n");
      out.write("      <td width=\"112\"></td>\n");
      out.write("      <td width=\"70\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"20\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td valign=\"top\" bgcolor=\"#FF0000\"><div align=\"center\"><span class=\"style1\">More</span></div></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"16\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td height=\"7\"></td>\n");
      out.write("      <td width=\"59\"></td>\n");
      out.write("      <td width=\"41\"></td>\n");
      out.write("      <td width=\"12\"></td>\n");
      out.write("      <td width=\"23\"></td>\n");
      out.write("      <td width=\"88\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td width=\"12\"></td>\n");
      out.write("      <td width=\"59\"></td>\n");
      out.write("      <td width=\"54\"></td>\n");
      out.write("      <td width=\"5\"></td>\n");
      out.write("      <td width=\"4\"></td>\n");
      out.write("      <td width=\"14\"></td>\n");
      out.write("      <td width=\"71\"></td>\n");
      out.write("      <td width=\"52\"></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td height=\"19\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td colspan=\"3\" valign=\"top\" bgcolor=\"#FF0000\"><div align=\"center\"><span class=\"style1\">More</span></div></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td valign=\"top\" bgcolor=\"#FF0000\"><div align=\"center\" class=\"style1\">More</div></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td height=\"23\"></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"40\"></td>\n");
      out.write("      <td colspan=\"2\" rowspan=\"9\" valign=\"top\"><p class=\"style1\">HOME!</p>\n");
      out.write("        <p class=\"style1\">COURSE!</p>\n");
      out.write("        <p class=\"style1\">LOGIN!</p\n");
      out.write("          <p class=\"style1\">REGISTER!</p\n");
      out.write("      <p class=\"style1\">ABOUT US!</p>        <p class=\"style1\">ABOUT US! </p></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td colspan=\"6\" rowspan=\"8\" valign=\"top\"><img src=\"images/images.png\" width=\"397\" height=\"166\" /></td>\n");
      out.write("      <td colspan=\"9\" valign=\"top\" bgcolor=\"#FFFFCC\"><span class=\"style9\">Connect to us on our social media platforms</span> </td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"22\"></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td rowspan=\"3\" valign=\"top\"><img src=\"images/f.png\" width=\"52\" height=\"56\" /></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"19\"></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td colspan=\"3\" valign=\"top\"><span class=\"style1\">Facebook</span></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"21\"></td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td>&nbsp;</td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td height=\"15\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td rowspan=\"2\" valign=\"top\"><img src=\"images/index.jpg\" width=\"59\" height=\"45\" /></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"30\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td colspan=\"2\" rowspan=\"2\" valign=\"top\"><span class=\"style1\">Instagram</span></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"1\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td rowspan=\"5\" valign=\"top\"><img src=\"images/t.png\" width=\"57\" height=\"60\" /></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"18\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("      <td height=\"12\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td rowspan=\"2\" valign=\"top\"><span class=\"style1\">Tweeter</span></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"13\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"16\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"19\" colspan=\"20\" valign=\"top\" bgcolor=\"#336633\"><div align=\"center\"><span class=\"text-center\">Copyright 2021. Modibbo Adama University of Technology, Yola. . All Rights Reserved.</span></div></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td height=\"5\"></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("      <td></td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
