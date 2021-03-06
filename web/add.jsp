<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Customer</title>
        <link rel="stylesheet" type="text/css" href="newcss.css"/>
    </head>
    <body>
        <div class="wrap">
            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>
        
        <div class="main">
        <h1>Add A New Customer</h1>
        
        <form name="addForm" action="addCustomer" method="get">
            <table>
                <tbody>
                <tr>
            <td>Customer Name:</td>
            <td><input type="text" name="name" value=""/></td>
                <br></tr>
                
                <tr>
            <td>Email Address:</td>
            <td><input type="text" name="email" value=""/></td>
                <br></tr>
                
                <tr>
            <td>Age:</td>
            <td><input type="text" name="age" value=""/></td>
                <br></tr>
                
                <tr>
            <td>Favorite Brand:</td>
            <td><input type="text" name="brand" value=""/></td>
                <br></tr>
                
            
            </tbody>
            </table>
            <br>
            <input type="reset" name="reset" value="Clear" />
            <input type="submit" name="submit" value="Submit" />
        </form>
        </div>
        <%@ include file="includes/footer.jsp" %>
       </div>
    </body>
</html>
