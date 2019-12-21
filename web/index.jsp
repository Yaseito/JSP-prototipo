<%-- 
    Document   : index
    Created on : 20/12/2019, 10:26:53 PM
    Author     : User
--%>

<%@page import="modelo.entidad.UnidadMedida"%>
<%@page import="modelo.entidad.Categoria"%>
<%@page import="modelo.entidad.Marca"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="controlador.cMarca"%>
<%@page import="controlador.cCategoria"%>
<%@page import="controlador.cProducto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar Producto</title>
    </head>
    <body>
        <h1>Formulario de Registro de Producto</h1>
        <jsp:useBean id="cnm" class="controlador.cMarca" scope="page">
        </jsp:useBean>
        <jsp:useBean id="cnc" class="controlador.cCategoria" scope="page">
        </jsp:useBean>
        <jsp:useBean id="cnu" class="controlador.cUnidadMedida" scope="page">
        </jsp:useBean>
        <%
        List datosm = cnm.leerCombo();
        List datosc = cnc.leerCombo();
        List datosu = cnu.leerCombo();
        Iterator itm = datosm.iterator();
        Iterator itc = datosc.iterator();
        Iterator itu = datosu.iterator();
        %>
 
        <form action="ServletProducto" method="post">
            <label>Descripcion</label>
            <input type="text" name="descripcion"/><br>
            <label>Precio de Venta</label>
            <input type="text" name="pventa"/><br>
            <label>Codigo de Barras</label>
            <input type="text" name="codbarras"/><br>
            <label>Categoria</label>
                <select name="categoria">
                    <% while (itc.hasNext()) {
                        Categoria c = (Categoria) itc.next();
                   
                    %>
                    <option value="<%=c.getIdCategoria()%>" name= "listacategoria">
                        <%=c.getNombre()%>
                    </option>
                    <%
                            }
                    %>
                </select><br>
            <label>marca</label>

                <select name="marca">
                    <% while (itm.hasNext()) {
                        Marca m = (Marca) itm.next();
                   
                    %>
                    <option value="<%=m.getIdMarca()%>" name= "listamarca"><%=m.getNombre()%>
                    </option>
                    <%
                            }
                    %>
                </select><br>
            <label>Unidad de Medida</label>
                <select name="umedida">
                    <% while (itu.hasNext()) {
                        UnidadMedida um = (UnidadMedida) itu.next();
                   
                    %>
                    <option value="<%=um.getIdUnidadMedidad()%>" name= "listaunidad">
                        <%=um.getNombre()%>
                    </option>
                    <%
                            }
                    %>
                </select><br>
            
            <input type="submit" value="Registrar Producto"/>
        </form>
    </body>
</html>