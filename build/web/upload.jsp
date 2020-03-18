<%-- 
    Document   : upload
    Created on : Jan 19, 2019, 1:24:45 AM
    Author     : Jahed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/upload.css" rel="stylesheet" type="text/css"/>
        <title>File Uploading</title>
    </head>
    <body style="background-image:url('Images/upload_back.png');">
<!--        <div class="img">
            <image src="Images/upload.jpg"/>
        </div>-->

<div class="img">
    <form  method="post" action="FileuploadServlet" enctype="multipart/form-data">
            <table width="400px" align="center" border=2>
                <tr>
                    <td align="center" colspan="2">Form Details</td> 
                </tr>
                <tr>
                    <td>Id</td>
                    <td><input type="number" name="id"></td> 
                </tr>
                <tr>
                    <td>Enter your Firstname:</td>
                    <td><input type="text" name="firstname"></td> 
                </tr>
                <tr>
                    <td>Enter your lastname:</td>
                    <td><input type="text" name="lastname"></td> 
                </tr>
                <tr>
                    <td>Upload your photo:</td>
                    <td><input type="file" name="file"></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="save">
                    </td>
                </tr>
        </form> 
</div>
        
    </body>
</html>
