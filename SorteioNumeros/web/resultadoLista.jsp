<%-- 
    Document   : resultadoLista
    Created on : 06/06/2017, 20:16:57
    Author     : Rafael.Soares
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table border="1px">
            <thead>
                <td>negoço</td>
            </thead>
                <c:forEach items="${requestScope.lis}" var="valor">
                    <tr>        
                        <td>${valor}</td>
                    </tr>
                </c:forEach>
        </table>
        
        
       
        
        
    </body>
</html>
