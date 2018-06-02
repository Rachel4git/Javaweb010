<%@ page import="main.atrachel.Custormer" %><%--
  Created by IntelliJ IDEA.
  User: hd48552
  Date: 2018/6/2
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>TestListener</title>
</head>
<body>
<h4> test listener</h4>
<%

    Custormer cc =(Custormer) session.getAttribute("customer1");
    if(cc==null){
        cc= new Custormer("001","rachel","18");
        session.setAttribute("customer1",cc);
        System.out.println("--------------"+((Custormer) session.getAttribute("customer1")).getName());
    }
    session.removeAttribute("customer1");
%>

<%--<%--%>
    <%--request.setAttribute("name","rachel");--%>
    <%--request.setAttribute("name","RACHEL");--%>
    <%--request.removeAttribute("name");--%>

<%--%>--%>
<%
//    session.invalidate();
%>
</body>
</html>
