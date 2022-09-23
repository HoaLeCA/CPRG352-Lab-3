
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author levan
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

   

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return; //
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Capture incomming parameters
        String firstarithmetic = request.getParameter("first_arithmetic");
        String secondarithmetic = request.getParameter("second_arithmetic");
        String operation = request.getParameter("calculator");
        
        //Set attribute that can send to web browser
        request.setAttribute("firstArithmetic", firstarithmetic);
        request.setAttribute("secondArithmetic", secondarithmetic);
        
        //check if user input either null or blank
        
        if(firstarithmetic == null || firstarithmetic.equals("")||secondarithmetic == null || secondarithmetic.equals("")){
             //Sending message to user
            request.setAttribute("result", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
        }
        
        try {
            int first =   Integer.parseInt(firstarithmetic);
            int second =   Integer.parseInt(secondarithmetic);
            
            if(operation.equals("+")){
                request.setAttribute("result", first + second);                
            }
            else if(operation.equals("-")){
                request.setAttribute("result", first - second); 
            }
            else if(operation.equals("*")){
                request.setAttribute("result", first * second); 
            }
            else if(operation.equals("%")) {
                request.setAttribute("result", first % second); 
            }
            else {
                 request.setAttribute("result", "Invalid");
            }
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
            return;
            
        } catch (NumberFormatException e) {
             request.setAttribute("result", "Invalid");
             // load attribute to browser
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return; //stop the call
        }catch (ArithmeticException e) {
             request.setAttribute("result", "Can not divide by ZERO");
             // load attribute to browser
             getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
             return; //stop the call
        }
        
    }



}
