<%--Directive--%>
<%@ page import="java.util.Scanner"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title></title>
</head>
<body>
<%--Declaration--%>
<%! //not scriptlet (Declaration)

    int coef = 3;
    String decl = "This String comes from Declaration tag (instance variable)  ";

%>

<h1>Hello World!</h1>

<%--scriptlet--%>
<%

    out.println("This comes from scriptlet. 7 + 5 =");
    out.println(7 + 5);
    out.println("<br>");
    out.println(decl + coef);
    out.println("<br>");
    Scanner scanner = new Scanner(System.in);

%>
<br>
<%--Expression--%>
<%= decl + coef + " but without out.println() (Expression)" %>


</body>
</html>
