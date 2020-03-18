<%-- 
    Document   : index
    Created on : Nov 10, 2018, 12:24:33 AM
    Author     : Jahed
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!doctype html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>BLOG</title>
      <!-- Bootstrap Css -->
    <link rel="stylesheet" href="cs/bootstrap.min.css">
    <!-- Font Awesome Css -->
    <link rel="stylesheet" href="cs/font-awesome.min.css">
    <!-- Owl Carousel Css -->
    <link rel="stylesheet" href="cs/owl.carousel.min.css">
    <link rel="stylesheet" href="cs/owl.theme.default.min.css">
    <!-- Animate -->
    <link rel="stylesheet" href="cs/animate.css">
    <!-- Swiper Master Css -->
    <link rel="stylesheet" href="vendors/swiper-master/css/swiper.min.css">
    <!-- magnific-popup -->
    <link rel="stylesheet" href="cs/magnific-popup.css">
    <!-- Slicknav Master -->
    <link rel="stylesheet" href="vendors/slicknav-master/slicknav.min.css">
    <!-- Site Style Css -->
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="cs/responsive.css">
    <!-- Modernizr Js -->
    <script src="vendors/modernizr-js/modernizr.js"></script>
</head>

<body>

<!--[if lt IE 8]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="http://browsehappy.com/">upgrade your browser</a> to improve your experience.</p>
<![endif]-->

<!-- ================ Start Header Section ================ -->
    <header class="header">
        <div class="top-header bg-1 txt-clr-2">
            <div class="container">
                <div class="row">
                    <div class="col-lg-5 col-md-9 col-sm-9 col-12 top-hdr-padding">
                        <ul class="list-inline">
                            <li class="list-inline-item">
                                <span><i class="fa fa-envelope"></i></span> jahidulafrad29@gmail.com
                            </li>
                            <li class="list-inline-item">
                                <span><i class="fa fa-mobile"></i></span> 01557202541
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <div class="bottom-header">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 offset-lg-2 col-12">
                        <div class="barnd-logo text-center ptb-40">
                            <a href="index.jsp" class="logo">
                                <img src="IMG/logo.png" class="img-fluid" alt="">
                            </a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Start sitemenu -->
        <div class="sitemenu" id="sticky-header">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-9 col-6 offset-lg-2">
                        <nav class="navbar-expand-lg navbar-light">
                            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNav">
                                <ul id="menubar" class="navbar-nav">
                                    <li>
                                        <a href="index.jsp">home</a>
                                    </li>
                                    <li>
                                        <a href="#">about</a>
                                    </li>
                                    <li><a href="registration.jsp">Registration</a></li>
                                    <li><a href="upload.jsp">Upload</a></li>
                                    <li><a href="view.jsp">View</a></li>
                                    <li><a href="view_d.jsp">Download</a></li>
                                </ul>
                            </div>
                        </nav>
                    </div>
                    <div class="col-lg-2 col-md-3 col-6 trvel-user">
                        <ul class="d-flex justify-content-end">
                            <li class="user-option">
                                <i class="fa fa-user"></i>
                                <ul>
                                    <li><a href="login.jsp"><i class="fa fa-sign-in"></i> Login</a></li>
                                    <li><a href="registration.jsp"><i class="fa fa-pencil-square-o"></i> Register</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </header>

<!-- ================ Start Main Section ================ -->
<div class="main" role="main">

    <!-- Start page title section -->
    <div class="page-title">
        <div class="container">
            <div class="row">
                <div class="col-md-12 text-center">
                    <h5 class="fz-26 fw-5">Blog grid</h5>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb text-center d-inline-flex">
                            <li class="breadcrumb-item"><a href="index.jsp">Home</a></li>
                            <li class="breadcrumb-item active" aria-current="page">Blog</li>
                        </ol>
                    </nav>
                </div>
            </div>
        </div>
    </div>

    <!-- Start blog grid layout -->
    <div class="blog-grid-layout bg-2">
        <div class="container">

              <p>We provide a new efficient RDPC protocol based on homomorphic hash function.User normally thinks about how to store information on files for future usage.<br>
                  Sometimes he used to share his data to another person’s also that is called public data which can be shared with others.But some data may be protective means<br>
                  private only for limited persons or single usage. Some Users will store the files in the cloud and share with other users but the information in the cloud is not<br>
                  encrypted so it cannot be secure so, I proposed this web application. In this project, I can encrypt the user’s uploaded files and I can also generate a secret key<br>
                  if any user requests for the file then I can verify and respond to their requests. Using the key, he can access the file.</p>

        </div>
    </div>

    <!-- Start client section -->
    <div class="client-area client-area-3 client-area-style-2">
        <div class="container">
            <div class="row">
                <div class="col-lg-6 col-md-8 offset-lg-3 col-md-2 col-12">
                    <div class="section-title text-center">
                        <h4 class="fw-7">I Am Featured In</h4>
                        <p class="fz-16 fw-4">It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. </p>
                    </div>
                </div>
        </div>
    </div>

</div>

<!-- ================ Start Footer Section ================ -->
<footer class="footer txt-clr-2">
    <div class="container">
        <div class="row">

            <div class="col-lg-3 ftr-link">
                <div class="ftr-title pt-15 mb-35">
                    <h3>GhoraGhuri</h3>
                </div>
                <ul>
                    <li><a href="#">About Us</a></li>
                    <li><a href="#">Help</a></li>
                    <form class="subscribe-form mt-25">
                        <div class="form-group mb-0">
                            <input type="email" class="form-control email-input" placeholder="Enter your email">
                        </div>
                        <button type="submit" class="btn btn-primary subscribe-btn bg-1">subscribe</button>
                    </form>
                </ul>
                <p class="fz-14 mt-30">© 2019 All Right Reserved By GhoraGhuri</p>
            </div>

            <div class="col-lg-3 ftr-link">
                <div class="ftr-title pt-15 mb-35">
                    <h3>Quick Link</h3>
                </div>
                <ul>
                    <li><a href="#">Destination</a></li>
                    <li><a href="#">Tour Story</a></li>
                    <li><a href="#">Hotel & Resort</a></li>
                    <li><a href="#">Restaurants</a></li>
                    <li><a href="#">Transport</a></li>
                </ul>
            </div>

            <div class="col-lg-3">
                <div class="ftr-title pt-15 mb-35">
                    <h3>Twitter Feed</h3>
                </div>
                <ul class="twitter-link">
                    <li><span class="mr-10"><i class="fa fa-twitter"></i></span><a href="#">https://twitter.com /envato/status/ 944202192013144064 https://twitter.com/envato/status/944202192013144064</a></li>
                    <li><span class="mr-10"><i class="fa fa-twitter"></i></span><a href="#">https://twitter.com /envato/status/ 944202192013144064 https://twitter.com/envato/status/944202192013144064</a></li>
                </ul>
            </div>

            <div class="col-lg-3">
                <div class="ftr-title pt-15 mb-35">
                    <h3>Contact Information</h3>
                </div>
                <ul class="ftr-contact">
                    @if(isset($settingsDisplay[0]))
                        @foreach($settingsDisplay as $setting)
                    <li><span>Location:</span>BSMRSTU</li>
                    <li><span>Email:</span> {{$setting->email}}</li>
                    <li><span>Phone:</span> {{$setting->phone}}</li>
                     @endforeach
                        @endif

                </ul>
                <div class="ftr-social">
                    <div class="ftr-title pt-15 mb-15">
                        <h3 class="fz-18">FOLLOW US</h3>
                    </div>
                    <ul class="d-flex">
                        <li><a href="http://facebook.com/" class="icon-fb"><i class="fa fa-facebook"></i></a></li>
                        <li><a href="https://twitter.com" class="icon-twit"><i class="fa fa-twitter"></i></a></li>
                        <li><a href="http://google.com/" class="icon-glg"><i class="fa fa-google"></i></a></li>
                        <li><a href="http://youtube.com/" class="icon-utb"><i class="fa fa-youtube"></i></a></li>
                    </ul>
                </div>
            </div>

        </div>
    </div>
    <a href="#" class="scrollup"><i class="fa fa-angle-up"></i></a>
</footer>

<!-- ================ Start Jquery Plugins ================ -->
<script src="{{asset('/blog/js/jquery.min.js')}}"></script>
<!-- Bootstrap Js -->
<script src="{{asset('/blog/js/bootstrap.min.js')}}"></script>
<!-- Owl Carousel Js -->
<script src="{{asset('/blog/js/owl.carousel.min.js')}}"></script>
<!-- Swiper Master Js -->
<script src="{{asset('/blog/vendors/swiper-master/js/swiper.min.js')}}"></script>
<!-- Slicknav Master -->
<script src="{{asset('/blog/vendors/slicknav-master/jquery.slicknav.min.js')}}"></script>
<!-- magnific popup -->
<script src="{{asset('/blog/js/magnific-popup.min.js')}}"></script>
<!-- counterup -->
<script src="{{asset('/blog/vendors/counterup/waypoints.min.js')}}"></script>
<script src="{{asset('/blog/vendors/counterup/counterup.min.js')}}"></script>
<!-- scroll up -->
<script src="{{asset('/blog/js/scrollup.js')}}"></script>
<!-- main js -->
<script src="{{asset('/blog/js/main.js')}}"></script>
</body>

</html>


<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="CSS/home.css" rel="stylesheet" type="text/css"/>
        <title>File Sharing</title>
    </head>
    <body>
       <div class="main">
  <ul>
     <li><a href="#">home</a></li>
	 <li><a href="#">about</a></li>
	 <li><a href="registration.jsp">registration</a></li>
	 <li><a href="upload.jsp">upload</a></li>
         <li><a href="view.jsp">view file</a></li>
         <li><a href="view_d.jsp">download file</a></li>
	 <li class="submain"><a href="login.jsp">login</a>
	    <ul class="sub">
		  <li><a href="logout">logout</li>
	 </li>
  </ul>
  </div>
  <div style="clear:both"></div>
  <img src="Images/study.jpg">
  <div class="footer">Copyright &copy;Only_Jahidul_Afrad.com</div>
    </body>
</html>-->