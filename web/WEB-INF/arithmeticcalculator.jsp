<%-- 
    Document   : arithmeticcalculator
    Created on : 22-Sep-2022, 2:32:49 PM
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
        <h1><a>Arithmetic Calculator</a></h1><br>
        <form method="POST" action ="arithmetic">
            <div>
                <lable>First:</lable>
                <input type = "text" name="first_arithmetic" value="${firstArithmetic}">
            </div>
            <div>
                <lable>Second:</lable>
                <input type = "text" name="second_arithmetic" value="${secondArithmetic}">
            </div>
            
            <div> 
                <input type="submit" value="+" name="calculator">
                <input type="submit" value="-" name="calculator">
                <input type="submit" value="*" name="calculator">
                <input type="submit" value="%" name="calculator">
            </div>
            <div>
                <p>Result: ${message}${result}</p>

            </div>
            
            <div>
                <a href="age">Age Calculator</a>
            </div>
                
        </form>
    </body>
</html>
