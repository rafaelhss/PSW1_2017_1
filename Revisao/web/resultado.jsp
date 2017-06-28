<%-- 
    Document   : resultado
    Created on : 27/06/2017, 20:13:48
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
        <h1>Resultado:</h1>
        <h2>Você ${requestScope.resultado} </h2>
        <h3>O premio estava em: ${requestScope.portaSistema}, 
            Voce escolheu: ${requestScope.portaUsuario}</h3>
        
            <c:if test="${requestScope.portaUsuario == '1' 
                          && requestScope.portaSistema == requestScope.portaUsuario}">
               <!-- porta aberta com premio -->
                <img height="150" src="http://fscomps.fotosearch.com/compc/CSP/CSP991/k12200723.jpg">    
            </c:if>
            <c:if test="${requestScope.portaUsuario == '1' 
                          && requestScope.portaSistema != requestScope.portaUsuario}">
               <!--Porta aberta sem premio -->
                <img height="150" src="http://fscomps.fotosearch.com/compc/CSP/CSP941/k9419143.jpg">    
            </c:if>
            <c:if test="${requestScope.portaUsuario != '1'}">
                <!-- porta fechada! -->
               <img height="150" src="https://sc02.alicdn.com/kf/HTB1NlRkHpXXXXbIaXXXq6xXFXXXQ/OPPEIN-White-Timer-Lacquer-Finish-Door-Wooden.jpg">    
            </c:if>
            <c:if test="${requestScope.portaUsuario == '2' 
                          && requestScope.portaSistema == requestScope.portaUsuario}">
               <!-- porta aberta com premio -->
                <img height="150" src="http://fscomps.fotosearch.com/compc/CSP/CSP991/k12200723.jpg">    
            </c:if>
            <c:if test="${requestScope.portaUsuario == '2' 
                          && requestScope.portaSistema != requestScope.portaUsuario}">
               <!--Porta aberta sem premio -->
                <img height="150" src="http://fscomps.fotosearch.com/compc/CSP/CSP941/k9419143.jpg">    
            </c:if>
            <c:if test="${requestScope.portaUsuario != '2'}">
                <!-- porta fechada! -->
               <img height="150" src="https://sc02.alicdn.com/kf/HTB1NlRkHpXXXXbIaXXXq6xXFXXXQ/OPPEIN-White-Timer-Lacquer-Finish-Door-Wooden.jpg">    
            </c:if>               
            <c:if test="${requestScope.portaUsuario == '3' 
                          && requestScope.portaSistema == requestScope.portaUsuario}">
               <!-- porta aberta com premio -->
                <img height="150" src="http://fscomps.fotosearch.com/compc/CSP/CSP991/k12200723.jpg">    
            </c:if>
            <c:if test="${requestScope.portaUsuario == '3' 
                          && requestScope.portaSistema != requestScope.portaUsuario}">
               <!--Porta aberta sem premio -->
                <img height="150" src="http://fscomps.fotosearch.com/compc/CSP/CSP941/k9419143.jpg">    
            </c:if>
            <c:if test="${requestScope.portaUsuario != '3'}">
                <!-- porta fechada! -->
               <img height="150" src="https://sc02.alicdn.com/kf/HTB1NlRkHpXXXXbIaXXXq6xXFXXXQ/OPPEIN-White-Timer-Lacquer-Finish-Door-Wooden.jpg">    
            </c:if>               

            
            
    </body>
</html>
