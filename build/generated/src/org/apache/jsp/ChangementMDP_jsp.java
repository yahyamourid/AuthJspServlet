package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ChangementMDP_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Changement MPD</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

            String login = (String) session.getAttribute("changerMDP");
            
            if (login != null && login.equals("yes")){
        
      out.write("\n");
      out.write("        <form action=\"AuthController\" method=\"POST\" onsubmit=\"return validateForm()\">\n");
      out.write("    <table>\n");
      out.write("        <tbody>\n");
      out.write("            <tr>\n");
      out.write("                <td>Mot de passe :</td>\n");
      out.write("                <td><input id=\"password\" name=\"password\" type=\"password\"/></td>\n");
      out.write("                <td>Confirmer mot de passe :</td>\n");
      out.write("                <td><input id=\"confPassword\" name=\"confPassword\" type=\"password\"/></td>\n");
      out.write("                <td><input name=\"op\" value=\"changerMPD\" type=\"hidden\"/></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td colspan=\"4\"><input type=\"submit\"></td>\n");
      out.write("            </tr>\n");
      out.write("        </tbody>\n");
      out.write("    </table>\n");
      out.write("</form>\n");
      out.write("        ");
} else 
                response.sendRedirect("RecuperationCode.jsp");
                
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("function validateForm() {\n");
      out.write("    var password = document.getElementById(\"password\").value;\n");
      out.write("    var confPassword = document.getElementById(\"confPassword\").value;\n");
      out.write("\n");
      out.write("    if (password !== confPassword) {\n");
      out.write("        alert(\"Les mots de passe ne correspondent pas !\");\n");
      out.write("        return false; \n");
      out.write("    }\n");
      out.write("    return true;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
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