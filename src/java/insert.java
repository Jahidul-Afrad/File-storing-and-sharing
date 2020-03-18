/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Jahed
 */
@WebServlet(urlPatterns = {"/insert"})
public class insert extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("id"));
        String FirstName = request.getParameter("fname");
        String LastName = request.getParameter("lname");
        String Phone =request.getParameter("phn");
        String Email =request.getParameter("email");
        String Address =request.getParameter("address");
        String Gender =request.getParameter("gender");
        String Password =request.getParameter("password");
        //out.println(FirstName+" "+LastName+" "+Phone+" "+Email+" "+Address+" "+Gender+" "+Password);
        try {
            //out.println("hi1");
            String url = "jdbc:mysql://localhost:3306/fileupload";
            String dname = "root";

            String pass = "";
            String query = "insert into registration values(?,?,?,?,?,?,?,?)";
            //out.println("hi2");
            Class.forName("com.mysql.jdbc.Driver");
            //out.println("hi3");
            Connection con = DriverManager.getConnection(url, dname, pass);
            //out.println("hi4");
            PreparedStatement pt = con.prepareStatement(query);
            //out.println("hi5");
            //ResultSet rs=st.executeQuery();
            pt.setInt(1,id);
            pt.setString(2, FirstName);
            //out.println("hi6");
            pt.setString(3, LastName);
            //out.println("hi7");
            pt.setString(4, Phone);
            //out.println("hi8");
            pt.setString(5, Email);
            //out.println("hi9");
            pt.setString(6, Address);
            //out.println("hi10");
            pt.setString(7, Gender);
            //out.println("hi11");
            pt.setString(8, Password);
            //out.println("hi12");
            pt.executeUpdate();
            response.sendRedirect("registration.jsp");
            
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         try{
        processRequest(request, response);
        }catch(Exception e){
            
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        processRequest(request, response);
        }catch(Exception e){
            
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
