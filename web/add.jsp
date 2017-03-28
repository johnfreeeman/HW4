<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add A New Customer</title>
    </head>
    <body>
        <h1>Add A New Customer</h1>
        
        <form name="addForm" action="addCustomer" method="get">
            
            <label>Customer Name:</label>
            <input type="text" name="name" value=""/>
            <br>
            <label>Email Address:</label>
            <input type="text" name="email" value=""/>
            <br>
            <label>Age:</label>
            <input type="text" name="age" value=""/>
            <br>
            <label>Favorite Brand:</label>
            <input type="text" name="brand" value=""/>
            <br>
            <input type="submit" name="submit" value="Submit" />
        </form>
    </body>
</html>
