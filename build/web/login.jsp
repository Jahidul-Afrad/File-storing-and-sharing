<%-- 
    Document   : login
    Created on : Jan 24, 2019, 12:11:08 PM
    Author     : Jahed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/bootstrap.min.css" type="text/css"/>
        <title>Login</title>
    </head>
    <body>

        <style>
            td{
                padding: 10px;
            }
            div{
                margin-top: 20px;
                width:50%;
                border:1px solid black;
                border-radius: 5px;
                background-color: lightslategray;
            }
            .btn{
                padding-bottom:5px;
            }
        </style>

    <center><h1>Login Here</h1></center>
    <center>
        <div>
            <form action="login">
                <table>
                    <tr>
                        <td>Email</td>
                        <td><input class="form-control" type="text" name="eml" placeholder="Enter your email"></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input class="form-control" type="password" name="pas" placeholder="Enter your password"></td>
                    </tr>
                </table>
                <center><input class="btn btn-success" type="submit" value="submit"></center>
            </form>
        </div>
    </center>
</body>
</html>
