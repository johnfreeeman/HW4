<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers Database</title>
        <link rel="stylesheet" type="text/css" href="newcss.css"/>
    </head>

    <% String table = (String) request.getAttribute("table");%>


    <body>
        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main"> 


                <h1>Sanghyeop's Customers</h1>

                <%= table%>

                <br><br>

                <a href ="add">Add A New Customer</a>
                <br><br>
                <a href="search.jsp">Search Customer</a>

            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>

    </body>
</html>
