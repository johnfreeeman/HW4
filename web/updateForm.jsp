
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "model.Customers"%>
<% Customers customer = (Customers) request.getAttribute("customer");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css"/>
        <title>Update A Customer</title>
        
    </head>
    <body>
        <div class="wrap">
        
            <%@ include file="includes/header.jsp" %>

            <%@ include file="includes/menu.jsp" %>
            
            <div class="main">
            
        <h1>Update A Customer</h1>
        
        <form name="updateForm" action="updateCustomer" method="get">
            
            <table class ="update">
                <tr>
            <td>Customer ID:</td>
            <td><input type="text" name="id" value="<%= customer.getCustomerID() %>" readonly/></td>
                <br></tr>
                
                    
                <tr>
            <td>Customer Name:</td>
            <td><input type="text" name="name" value="<%= customer.getCustomerName() %>"/></td>
                <br></tr>
                
                <tr>
            <td>Email Address:</td>
            <td><input type="text" name="email" value="<%= customer.getEmailAddr() %>"/></td>
                <br></tr>
                
                <tr>
            <td>Age:</td>
            <td><input type="text" name="age" value="<%= customer.getAge() %>"/></td>
                <br></tr>
                
                <tr>
            <td>Favorite Brand:</td>
            <td><input type="text" name="brand" value="<%= customer.getFavoriteBrand() %>"/></td>
                <br></tr>
            </table>
                <br>
            <input type="reset" name="reset" value="Clear" />
            <input type="submit" name="submit" value="Update" />
            
        </form>
                <%@ include file="includes/footer.jsp" %>
        
            </div>    
        </div>
    </body>
</html>
