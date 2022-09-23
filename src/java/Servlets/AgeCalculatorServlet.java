
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
        return; // IMPORTANT! stop the code call
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Capture incomming parameter
            String get_Age = request.getParameter("age");                      
            
        // set attribute that can be sent to web browser with requestDispatcher
            request.setAttribute("getAge", get_Age);
        // check if user input either null or blank
        if(get_Age == null || get_Age.equals("")){
            //Sending message to user
            String message = "You must give your current age";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request,response);
            
        }
        try {
            Integer.parseInt(get_Age);
             int nextAge = Integer.parseInt(get_Age) + 1;
             String s_t = "Your next birthday will be ";
             request.setAttribute("result", nextAge);
             request.setAttribute("st", s_t);
             // load attribute to browser
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
             return; //stop the call
        } catch (NumberFormatException e) {
            String display_Error = "You must enter a number.";
            request.setAttribute("displayError", display_Error);
             // load attribute to browser
             getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
             return; //stop the call
        }      
    }
}
