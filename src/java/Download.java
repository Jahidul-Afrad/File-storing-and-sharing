/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Jahed
 */
@WebServlet(urlPatterns = {"/Download"})
public class Download extends HttpServlet {

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
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        String eml = session.getAttribute("email").toString();
        String pas = session.getAttribute("pass").toString();
        //out.println(eml + " " + pas);
        if (eml != null && pas != null) {
            try {
                int input = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Select an Option...", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
                int imageid = Integer.parseInt(request.getParameter("id"));
                if (input == 1 || input == 2) {
                    response.sendRedirect("view_d.jsp");
                }
                String url = "jdbc:mysql://localhost:3306/fileupload";
                String dname = "root";

                String pass = "";
                String query = "select * from image_table where id=" + imageid + "";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, dname, pass);
                Statement st = con.createStatement();
                //out.println("hf");
                ResultSet rs = st.executeQuery(query);
                //out.println("hf");
                rs.next();
                String filename = rs.getString("filename");
                String filepath = rs.getString("path");
                out.println(filename + " " + filepath);
                response.setContentType("APPLICATION/OCTET-STREAM");
                response.setHeader("Content-Disposition", "attachment;filename=\"" + filename + "\"");
                FileInputStream fileInputStream = new FileInputStream(filepath + filename);
                int i;
                while ((i = fileInputStream.read()) != -1) {
                    out.write(i);
                }

                fileInputStream.close();
                out.close();
            } finally {
                out.close();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please first login");
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
        try {
            processRequest(request, response);
        } catch (Exception e) {

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
        try {
            processRequest(request, response);
        } catch (Exception e) {

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
//<%-- 
//    Document   : display
//    Created on : Jan 22, 2019, 7:09:34 PM
//    Author     : Jahed
//--%>
//
//<%@page import="java.io.File"%>
//<%@page import="java.sql.ResultSet"%>
//<%@page import="java.sql.Statement"%>
//<%@page import="java.sql.DriverManager"%>
//<%@page import="java.sql.Connection"%>
//<%@page contentType="text/html" pageEncoding="UTF-8"%>
//<!DOCTYPE html>
//<html>
//    <head>
//        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
//        <title>JSP Page</title>
//    </head>
//    <body>
//        <%
//            int imageid = Integer.parseInt(request.getParameter("id"));
//            out.println(imageid);
//            try {
//                String url = "jdbc:mysql://localhost:3306/fileupload";
//                String dname = "root";
//
//                String pass = "";
//                String query = "select filename from image_table where id=" + imageid + "";
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection con = DriverManager.getConnection(url, dname, pass);
//                Statement st = con.createStatement();
//                ResultSet rs = st.executeQuery(query);
//                rs.next();
//                String filename = rs.getString("filename");
//                out.println(filename);
//                Part part = request.getPart("filename");
//
//                String contentDisp = part.getHeader("Content-Disposition");
//                String[] items = contentDisp.split(";");
//                String fileName=null;
//                for (String s : items) {
//                    if (s.trim().startsWith("filename")) {
//                         fileName = s.substring(s.indexOf("=") + 2, s.length() - 1);
//                         out.println(fileName);
//                    }
//                }
//
//                //String fileName = extractFileName(part);
//                String savePath = "D:\\Back up hp 2000\\My File\\JAVA CODE\\yearproject\\web\\Download" + File.separator + fileName;
//                File fileSavedir = new File(savePath);
//                //D:\Back up hp 2000\My File\JAVA CODE\yearproject\web\Download  All Files	D:\Back up hp 2000\My File\JAVA CODE\yearproject\web\Download
//                part.write(savePath + File.separator);
//
//
//        %>
//        <table style=""width:100%">
//               <tr>
//                <th>Id</th>
//                <th>Image</th>
//            </tr>
//            <tr>
//                <td><%=imageid%></td><td>
//                <td><td><image src="Images/<%=filename%>"width="200"height="200"/></td>
//            </tr>
//        </table>
//        <%
//            } catch (Exception e) {
//                out.println(e);
//            }
//        %>
//    </body>
//</html>
