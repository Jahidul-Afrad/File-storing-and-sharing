/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

/**
 *
 * @author Jahed
 */
@WebServlet(urlPatterns = {"/FileuploadServlet"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
public class FileuploadServlet extends HttpServlet {

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
            throws ServletException, IOException, ClassNotFoundException, SQLException, NoSuchPaddingException, InvalidKeyException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");

                 
        Part part = request.getPart("file");
        String fileName = extractFileName(part); 
        String savePath = "D:\\Back up hp 2000\\My File\\JAVA CODE\\yearproject\\web\\Images" + File.separator + fileName;
        File fileSavedir = new File(savePath);     
        part.write(savePath + File.separator);
        
        FileInputStream file = new FileInputStream(fileSavedir);
        FileOutputStream outStream = new FileOutputStream("Encrypt.jpg");
        byte k[] = "NiTh5252".getBytes();
        SecretKeySpec key = new SecretKeySpec(k, "DES");

        try {
            Cipher enc = Cipher.getInstance("DES");
            enc.init(Cipher.ENCRYPT_MODE, key);
            CipherOutputStream cos = new CipherOutputStream(outStream, enc);
            byte[] buf = new byte[1024];
            int read;
            while ((read = file.read(buf)) != -1) {
                cos.write(buf, 0, read);
            }
            file.close();
            outStream.flush();
            cos.close();
            JOptionPane.showMessageDialog(null,"Successfully Encrypt");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        try {
            //out.println("hi1");
            String url = "jdbc:mysql://localhost:3306/fileupload";
            String dname = "root";

            String pass = "";
            String query = "insert into image_table values(?,?,?,?,?)";
            //out.println("hi2");
            Class.forName("com.mysql.jdbc.Driver");
            //out.println("hi3");
            Connection con = DriverManager.getConnection(url, dname, pass);
            //out.println("hi4");
            PreparedStatement pt = con.prepareStatement(query);
            //out.println("hi5");
            //ResultSet rs=st.executeQuery();
            pt.setInt(1, id);
            pt.setString(2, firstName);
            pt.setString(3, lastName);
            pt.setString(4, fileName);
            pt.setString(5, savePath);
            pt.executeUpdate();
            out.println("<center><h1>Image inserted Successfully.....</h1></center>");
            out.println("<center><a href='display.jsp?id=" + id + "'>Display</a></center>");
            response.sendRedirect("upload.jsp");
        } catch (Exception e) {
            out.println(e);
        }
    }

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("Content-Disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(FileuploadServlet.class.getName()).log(Level.SEVERE, null, ex);
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
