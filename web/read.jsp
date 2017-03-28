<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers Database</title>
    </head>
    
    <% String table = (String) request.getAttribute("table");%>
    
    
    <body>
        <h1>Sanghyeop's Customers</h1>
        <%= table %>
        
        <br><br>
        
        <a href ="add">Add A New Customer</a>
    </body>
</html>
