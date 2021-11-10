
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "control", urlPatterns = {"/control"})
public class control extends HttpServlet {

    private RequestDispatcher dis;
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String ruta = "";
       String action = request.getParameter("action");
       
       switch (action){
       
           case "home":
               ruta = "view/home.jsp";
               this.home(request, response, ruta);
       break;
       }
        
        
    }

     protected void home(HttpServletRequest request, HttpServletResponse response,String ruta)
            throws ServletException, IOException {
  
         
         dis= request.getRequestDispatcher(ruta);
         dis.forward(request, response);
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
}
