<%-- 
    Document   : view_d
    Created on : Jan 24, 2019, 5:36:24 PM
    Author     : Jahed
--%>

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
        <title>Download File</title>
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

            %>
            <tr>
                <td><%=imageid%></td>
                <td><%=Author1 + " " + Author2%></td>
                <td><image src="Images/<%=filename%>"width="50"height="50" style="text-align:left"/></td>
                <td colspan="2"><a href="Download?id=<%=imageid%>">download</a></td>
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

