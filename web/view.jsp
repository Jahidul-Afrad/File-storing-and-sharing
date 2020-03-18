<%-- 
    Document   : view
    Created on : Jan 22, 2019, 11:53:20 PM
    Author     : Jahed
--%>

<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.io.File"%>
<%@page import="java.security.NoSuchAlgorithmException"%>
<%@page import="javax.crypto.CipherOutputStream"%>
<%@page import="javax.crypto.Cipher"%>
<%@page import="javax.crypto.spec.SecretKeySpec"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/view.css" rel="stylesheet" type="text/css"/>
        <title>View File</title>
    </head>
    <body>
        <%
            try {
                String url = "jdbc:mysql://localhost:3306/fileupload";
                String dname = "root";
                String pass = "";
                String query = "select * from image_table";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, dname, pass);
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);
        %>
        <table class="tbl">
            <tr>
                <th>Id</th>
                <th>Author Name</th>
                <th  colspan="2"style="text-align: left">Image</th>
            </tr>
            <%
                while (rs.next()) {
                    //out.println("hi");
                    int imageid = rs.getInt("id");
                    String Author1 = rs.getString("firstname");
                    String Author2 = rs.getString("lastname");
                    String filename = rs.getString("filename");

                    FileInputStream file = new FileInputStream("D:\\Back up hp 2000\\My File\\JAVA CODE\\yearproject\\web\\Images" + File.separator + filename);
                    FileOutputStream outStream = new FileOutputStream("Decrypt.jpg");
                    byte k[] = "NiTh5252".getBytes();
                    SecretKeySpec key = new SecretKeySpec(k, "DES");

                    try {
                        Cipher enc = Cipher.getInstance("DES");
                        enc.init(Cipher.DECRYPT_MODE, key);
                        CipherOutputStream cos = new CipherOutputStream(outStream, enc);
                        byte[] buf = new byte[1024];
                        int read;
                        while ((read = file.read(buf)) != -1) {
                            cos.write(buf, 0, read);
                        }
                        file.close();
                        outStream.flush();
                        cos.close();
                        JOptionPane.showMessageDialog(null, "Successfully Decrypt");
                    } catch (NoSuchAlgorithmException ex) {

                    }


            %>
            <tr>
                <td><%=imageid%></td>
                <td><%=Author1 + " " + Author2%></td>
                <td><image src="Images/<%=filename%>"width="50"height="50" style="text-align:left"/></td>

            <br>
            </tr>
        </table>
        <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
    </body>
</html>
