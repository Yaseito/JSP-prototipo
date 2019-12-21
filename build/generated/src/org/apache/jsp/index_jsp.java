package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.entidad.Marca;
import java.util.Iterator;
import java.util.List;
import controlador.cMarca;
import controlador.cCategoria;
import controlador.cProducto;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrar Producto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Formulario de Registro de Producto</h1>\n");
      out.write("        ");
      controlador.cMarca cnm = null;
      synchronized (_jspx_page_context) {
        cnm = (controlador.cMarca) _jspx_page_context.getAttribute("cnm", PageContext.PAGE_SCOPE);
        if (cnm == null){
          cnm = new controlador.cMarca();
          _jspx_page_context.setAttribute("cnm", cnm, PageContext.PAGE_SCOPE);
          out.write("\n");
          out.write("        ");
        }
      }
      out.write("\n");
      out.write("        ");

        List datos = cnm.leerCombo();
        Iterator it = datos.iterator();
        
      out.write("\n");
      out.write(" \n");
      out.write("        <form action=\"ServletProducto\" method=\"post\">\n");
      out.write("            <label>Descripcion</label>\n");
      out.write("            <input type=\"text\" name=\"descripcion\"/><br>\n");
      out.write("            <label>Precio de Venta</label>\n");
      out.write("            <input type=\"text\" name=\"pventa\"/><br>\n");
      out.write("            <label>Codigo de Barras</label>\n");
      out.write("            <input type=\"text\" name=\"codbarras\"/><br>\n");
      out.write("            <label>Categoria</label>\n");
      out.write("                <select name=\"categoria\">\n");
      out.write("                    \n");
      out.write("                    <option name= \"listacategoria\" value=\"");
      out.print(cCategoria.leerCombo());
      out.write("\">\n");
      out.write("                \n");
      out.write("                    </option>\n");
      out.write("\n");
      out.write("                </select><br>\n");
      out.write("            <label>marca</label>\n");
      out.write("                <select name=\"marca\">\n");
      out.write("                    ");
 while (it.hasNext()) {
                        Marca m = (Marca) it.next();
                   
                    
      out.write("\n");
      out.write("                    <option value=\"");
      out.print(m.getIdMarca());
      out.write("\" name= \"listamarca\">");
      out.print(m.getNombre());
      out.write("\n");
      out.write("                    </option>\n");
      out.write("                    ");

                            }
                    
      out.write("\n");
      out.write("                </select><br>\n");
      out.write("            <label>Unidad de Medida</label>\n");
      out.write("                <select name=\"umedida\">\n");
      out.write("\n");
      out.write("                    <option name= \"listaunidad\">\n");
      out.write("                        text\n");
      out.write("                    </option>\n");
      out.write("\n");
      out.write("                </select><br>\n");
      out.write("            \n");
      out.write("            <input type=\"submit\" value=\"Registrarme\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
