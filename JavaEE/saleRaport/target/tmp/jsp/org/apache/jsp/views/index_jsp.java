/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.3.7.v20160115
 * Generated at: 2018-03-24 16:36:17 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DataBase.DBController;
import java.util.List;
import Pojo.Policy;
import Pojo.Agent;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Pojo.Policy");
    _jspx_imports_classes.add("Pojo.Agent");
    _jspx_imports_classes.add("DataBase.DBController");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("          integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <title>Formularz</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-light bg-light mx-auto\">\r\n");
      out.write("    <a class=\"navbar-brand mx-auto\" href=\"/\">\r\n");
      out.write("        <h4 class=\"text-primary\">Raportowaczka Sprzedażowa</h4>\r\n");
      out.write("    </a>\r\n");
      out.write("</nav>\r\n");
      out.write("<div class=\"col-md-6 offset-md-3\">\r\n");
      out.write("    <form action=\"add\" method=\"post\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <div class=\"form-group form-inline\">\r\n");
      out.write("                <p class=\"font-weight-bold pt-4\">Rejestracja sprzedaży jako ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${agentObj}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                <a class=\"pt-2 pl-4 text-muted text-right\" href=\"/clearCookie\">\r\n");
      out.write("                    <small>>>zmien<<</small>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <select required class=\"form-control\" id=\"brand\" name=\"brand\">\r\n");
      out.write("                <option disabled selected>Marka</option>\r\n");
      out.write("                <option>MTU</option>\r\n");
      out.write("                <option>MTU24</option>\r\n");
      out.write("                <option>YCD</option>\r\n");
      out.write("                <option>EH</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <label></label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" pattern=\"[0-9]{11,}\" required id=\"policyNumber\" name=\"policyNumber\"\r\n");
      out.write("                   placeholder=\"Numer Polisy\">\r\n");
      out.write("            <label></label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" required id=\"callerPhoneNumber\" name=\"callerPhoneNumber\"\r\n");
      out.write("                   placeholder=\"Numer dzwoniącego\">\r\n");
      out.write("            <label></label>\r\n");
      out.write("            <div class=\"input-group mb-3\">\r\n");
      out.write("                <div class=\"input-group-prepend\">\r\n");
      out.write("                    <span class=\"input-group-text\">PLN</span>\r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"text\" name=\"policyValue\" placeholder=\"Składka\" pattern=\"[0-9]{2,}\" class=\"form-control\" aria-label=\"Amount (to the nearest dollar)\">\r\n");
      out.write("                <div class=\"input-group-append\">\r\n");
      out.write("                    <span class=\"input-group-text\">.00</span>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <select class=\"form-control\" required id=\"sourceIncome\" name=\"sourceIncome\">\r\n");
      out.write("                <option disabled selected>Kolejka</option>\r\n");
      out.write("                <option>pg_BS_leady_oferta_mieszkanie</option>\r\n");
      out.write("                <option>pg_BS_leady_oferta_pojazd</option>\r\n");
      out.write("                <option>pg_BS_leady_zbywca_MTU</option>\r\n");
      out.write("                <option>pg_cb_sprzedaz_porzucone_MTU</option>\r\n");
      out.write("                <option>pg_dialer_Byli_Klienci</option>\r\n");
      out.write("                <option>pg_EH_K_oferta</option>\r\n");
      out.write("                <option>pg_mail_YCD_leadyshortcake</option>\r\n");
      out.write("                <option>pg_mtu_dialer_OCN</option>\r\n");
      out.write("                <option>pg_mtu_dialer_rankomat</option>\r\n");
      out.write("                <option>pg_mtu_nieodebrane</option>\r\n");
      out.write("                <option>pg_MTU_sprzedaz</option>\r\n");
      out.write("                <option>pg_MTU_zawarcie_nowej_polisy</option>\r\n");
      out.write("                <option>pg_mtu24_baner</option>\r\n");
      out.write("                <option>pg_mtu24_dialer_3krok</option>\r\n");
      out.write("                <option>pg_mtu24_dialer_3krok_2i3</option>\r\n");
      out.write("                <option>pg_mtu24_oferta</option>\r\n");
      out.write("                <option>pg_ycd_dialer_3krok</option>\r\n");
      out.write("                <option>pg_ycd_dialer_mfind</option>\r\n");
      out.write("                <option>pg_ycd_dialer_rankomat</option>\r\n");
      out.write("                <option>pg_ycd_nieodebrane</option>\r\n");
      out.write("                <option>pg_YCD_oferta</option>\r\n");
      out.write("                <option>pg_YCD_zawarcie_umowy</option>\r\n");
      out.write("                <option>pracownik</option>\r\n");
      out.write("                <option>ręczne odnowienie</option>\r\n");
      out.write("                <option>ręczne odnowienie - YCD/MTU24.pl</option>\r\n");
      out.write("                <option>ręczne odnowienie - zadania iHestia</option>\r\n");
      out.write("                <option>zadania iHestia</option>\r\n");
      out.write("                <option>źródło własne</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <label></label>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <textarea class=\"form-control\" id=\"extraInfo\" name=\"extraInfo\" rows=\"2\"\r\n");
      out.write("                          placeholder=\"Dodatkowe informacje\"></textarea>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div>\r\n");
      out.write("                <label for=\"agencyClient\">Czy klient agencyjny</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-check form-check-inline\" id=\"agencyClient\">\r\n");
      out.write("                <input class=\"form-check-input\" type=\"radio\" name=\"agencyClient\" id=\"inlineRadio1\" value=\"Nie\"\r\n");
      out.write("                       checked=\"checked\">\r\n");
      out.write("                <label class=\"form-check-label\" for=\"inlineRadio1\">Nie</label>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-check form-check-inline\">\r\n");
      out.write("                <input class=\"form-check-input\" type=\"radio\" name=\"agencyClient\" id=\"inlineRadio2\" value=\"Tak\">\r\n");
      out.write("                <label class=\"form-check-label\" for=\"inlineRadio2\">Tak</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <button type=\"submit\" class=\"btn btn-primary btn-lg btn-block\">Dodaj >></button>\r\n");
      out.write("    </form>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <div class=\"nav nav-tabs mt-5\" id=\"nav-tab\" role=\"tablist\">\r\n");
      out.write("            <a class=\"nav-item nav-link active\" id=\"nav-home-tab\" data-toggle=\"tab\" href=\"#nav-home\" role=\"tab\"\r\n");
      out.write("               aria-controls=\"nav-home\" aria-selected=\"true\">Dziś</a>\r\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-profile-tab\" data-toggle=\"tab\" href=\"#nav-profile\" role=\"tab\"\r\n");
      out.write("               aria-controls=\"nav-profile\" aria-selected=\"false\">7 dni</a>\r\n");
      out.write("            <a class=\"nav-item nav-link\" id=\"nav-contact-tab\" data-toggle=\"tab\" href=\"#nav-contact\" role=\"tab\"\r\n");
      out.write("               aria-controls=\"nav-contact\" aria-selected=\"false\">30 dni</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"tab-content\" id=\"nav-tabContent\">\r\n");
      out.write("        <div class=\"tab-pane fade show active\" id=\"nav-home\" role=\"tabpanel\" aria-labelledby=\"nav-home-tab\">\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("                ");

                    if (request.getAttribute("agentObj") instanceof Agent) {
                        List<Policy> agentPolisiesList = new DBController().getPolicies((Agent) request.getAttribute("agentObj"), 1);
                
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">#</th>\r\n");
      out.write("                    <th scope=\"col\">Brand</th>\r\n");
      out.write("                    <th scope=\"col\">Numer Polisy</th>\r\n");
      out.write("                    <th scope=\"col\">Składka</th>\r\n");
      out.write("                    <th scope=\"col\">Kolejka</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                ");

                    int counter = 0;
                    for (Policy p : agentPolisiesList) {
                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("\r\n");
      out.write("                    <th scope=\"row\">");
      out.print( ++counter);
      out.write("\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getBrand());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getPolicyNumber());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getPolicyValue());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getSourceIncome());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"tab-pane fade\" id=\"nav-profile\" role=\"tabpanel\" aria-labelledby=\"nav-profile-tab\">\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("                ");

                    if (request.getAttribute("agentObj") instanceof Agent) {
                        List<Policy> agentPolisiesList = new DBController().getPolicies((Agent) request.getAttribute("agentObj"), 7);

                
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">#</th>\r\n");
      out.write("                    <th scope=\"col\">Brand</th>\r\n");
      out.write("                    <th scope=\"col\">Numer Polisy</th>\r\n");
      out.write("                    <th scope=\"col\">Składka</th>\r\n");
      out.write("                    <th scope=\"col\">Kolejka</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                ");

                    int counter = 0;
                    for (Policy p : agentPolisiesList) {

                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("\r\n");
      out.write("                    <th scope=\"row\">");
      out.print( ++counter);
      out.write("\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getBrand());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getPolicyNumber());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getPolicyValue());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getSourceIncome());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"tab-pane fade\" id=\"nav-contact\" role=\"tabpanel\" aria-labelledby=\"nav-contact-tab\">\r\n");
      out.write("            <table class=\"table\">\r\n");
      out.write("                ");

                    if (request.getAttribute("agentObj") instanceof Agent) {
                        List<Policy> agentPolisiesList = new DBController().getPolicies((Agent) request.getAttribute("agentObj"), 30);

                
      out.write("\r\n");
      out.write("                <thead>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th scope=\"col\">#</th>\r\n");
      out.write("                    <th scope=\"col\">Brand</th>\r\n");
      out.write("                    <th scope=\"col\">Numer Polisy</th>\r\n");
      out.write("                    <th scope=\"col\">Składka</th>\r\n");
      out.write("                    <th scope=\"col\">Kolejka</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </thead>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                ");

                    int counter = 0;
                    for (Policy p : agentPolisiesList) {

                
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("\r\n");
      out.write("                    <th scope=\"row\">");
      out.print( ++counter);
      out.write("\r\n");
      out.write("                    </th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getBrand());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getPolicyNumber());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getPolicyValue());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");
      out.print( p.getSourceIncome());
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 }
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}