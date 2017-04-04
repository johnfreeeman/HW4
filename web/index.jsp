<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My Customers</title>
        <link rel="stylesheet" type="text/css" href="newcss.css"/>
    </head>
    <body>
        <div class="wrap">

            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>

            <div class="main">  

                <h1>My Customers Database</h1>


                <a href="read">View All Customers</a>
                <br><br>
                <a href="search.jsp">Search Customers</a>
            </div>

            <%@ include file="includes/footer.jsp" %>

        </div>
    </body>
</html>
