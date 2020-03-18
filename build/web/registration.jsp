<%-- 
    Document   : registration
    Created on : Jan 24, 2019, 12:37:39 AM
    Author     : Jahed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="registration.css" type="text/css"/>
        <title>Registration</title>
    </head>
    <body>
        <h1>Provide your information</h1>
        <form method="post" action="insert">
            <div class="T">
                <div class="t">ID : </div>
                <div class="tt">
                    <input type="number" name="id"> 
                </div>
                <div style="clear:both"></div>
                <div class="t">Enter Firstname : </div>
                <div class="tt">
                    <input type="text" name="fname"> 
                </div>
                <div style="clear:both"></div>
                <div class="t">Enter Lastname : </div>
                <div class="tt">
                    <input type="text" name="lname"> 
                </div>
                <div style="clear:both"></div>
                <div class="t">Phone : </div>
                <div class="tt">
                    <input type="text" name="phn"> 
                </div>
                <div style="clear:both"></div>
                <div class="t">Email : </div>
                <div class="tt">
                    <input type="text" name="email"> 
                </div>
                <div style="clear:both"></div>
<!--                <div class="t">Donar_Religion : </div>
                <div class="tt">
                    <input type="text" name="dept"> 
                </div>
                <div style="clear:both"></div>-->
                <div class="t">Address : </div>
                <div class="tt">
                    <input type="text" name="address"> 
                </div>
                <div style="clear:both"></div>
                <div class="t"><p>Gender : </p></div>
                <div class="tt">
                    <input type="radio" name="gender" value="male" checked>Male</br>
                    <input type="radio" name="gender" value="female">Female</br>
                    <input type="radio" name="gender" value="other">Other
                </div>
                <div style="clear:both"></div>
                <div class="t">Password : </div>
                <div class="tt">
                    <input type="password" name="password"> 
                </div>
                <div style="clear:both"></div>
                <div class="r">
                    <input type="submit" value="submit">
                </div>
            </div>
        </form>
    </body>
</html>