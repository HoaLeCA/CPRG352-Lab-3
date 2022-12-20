<%-- 
    Document   : agecalculator
    Created on : 22-Sep-2022, 2:14:25 PM
    Author     : levan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><a>Age Calculator</a></h1><br>
        <form method="POST" action ="age">
            <div>
                <lable>Enter your age:</lable>
                <input type = "text" name="age" value="${getAge}">
            </div>
            <div> 
                <input type="submit" value="Age next birthday">
            </div>
            <div>
                <p>${message} ${st} ${result} ${displayError} </p>
                
            </div>
            
            <div>
                <a href="arithmetic">Arithmetic Calculator</a>
            </div>
                
        </form>
        
        
    </body>
</html>
