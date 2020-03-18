package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <title>BLOG</title>\n");
      out.write("      <!-- Bootstrap Css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"cs/bootstrap.min.css\">\n");
      out.write("    <!-- Font Awesome Css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"cs/font-awesome.min.css\">\n");
      out.write("    <!-- Owl Carousel Css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"cs/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"cs/owl.theme.default.min.css\">\n");
      out.write("    <!-- Animate -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"cs/animate.css\">\n");
      out.write("    <!-- Swiper Master Css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/swiper-master/css/swiper.min.css\">\n");
      out.write("    <!-- magnific-popup -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"cs/magnific-popup.css\">\n");
      out.write("    <!-- Slicknav Master -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"vendors/slicknav-master/slicknav.min.css\">\n");
      out.write("    <!-- Site Style Css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"cs/responsive.css\">\n");
      out.write("    <!-- Modernizr Js -->\n");
      out.write("    <script src=\"vendors/modernizr-js/modernizr.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!--[if lt IE 8]>\n");
      out.write("<p class=\"browserupgrade\">You are using an <strong>outdated</strong> browser. Please <a href=\"http://browsehappy.com/\">upgrade your browser</a> to improve your experience.</p>\n");
      out.write("<![endif]-->\n");
      out.write("\n");
      out.write("<!-- ================ Start Header Section ================ -->\n");
      out.write("    <header class=\"header\">\n");
      out.write("        <div class=\"top-header bg-1 txt-clr-2\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-5 col-md-9 col-sm-9 col-12 top-hdr-padding\">\n");
      out.write("                        <ul class=\"list-inline\">\n");
      out.write("                            <li class=\"list-inline-item\">\n");
      out.write("                                <span><i class=\"fa fa-envelope\"></i></span> jahidulafrad29@gmail.com\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"list-inline-item\">\n");
      out.write("                                <span><i class=\"fa fa-mobile\"></i></span> 01557202541\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"bottom-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-8 offset-lg-2 col-12\">\n");
      out.write("                        <div class=\"barnd-logo text-center ptb-40\">\n");
      out.write("                            <a href=\"index.jsp\" class=\"logo\">\n");
      out.write("                                <img src=\"IMG/logo.png\" class=\"img-fluid\" alt=\"\">\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Start sitemenu -->\n");
      out.write("        <div class=\"sitemenu\" id=\"sticky-header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-6 col-md-9 col-6 offset-lg-2\">\n");
      out.write("                        <nav class=\"navbar-expand-lg navbar-light\">\n");
      out.write("                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNav\" aria-controls=\"navbarNav\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"navbarNav\">\n");
      out.write("                                <ul id=\"menubar\" class=\"navbar-nav\">\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"index.jsp\">home</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">about</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"registration.jsp\">Registration</a></li>\n");
      out.write("                                    <li><a href=\"upload.jsp\">Upload</a></li>\n");
      out.write("                                    <li><a href=\"view.jsp\">View</a></li>\n");
      out.write("                                    <li><a href=\"view_d.jsp\">Download</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-2 col-md-3 col-6 trvel-user\">\n");
      out.write("                        <ul class=\"d-flex justify-content-end\">\n");
      out.write("                            <li class=\"user-option\">\n");
      out.write("                                <i class=\"fa fa-user\"></i>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"login.jsp\"><i class=\"fa fa-sign-in\"></i> Login</a></li>\n");
      out.write("                                    <li><a href=\"registration.jsp\"><i class=\"fa fa-pencil-square-o\"></i> Register</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("<!-- ================ Start Main Section ================ -->\n");
      out.write("<div class=\"main\" role=\"main\">\n");
      out.write("\n");
      out.write("    <!-- Start page title section -->\n");
      out.write("    <div class=\"page-title\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12 text-center\">\n");
      out.write("                    <h5 class=\"fz-26 fw-5\">Blog grid</h5>\n");
      out.write("                    <nav aria-label=\"breadcrumb\">\n");
      out.write("                        <ol class=\"breadcrumb text-center d-inline-flex\">\n");
      out.write("                            <li class=\"breadcrumb-item\"><a href=\"index.jsp\">Home</a></li>\n");
      out.write("                            <li class=\"breadcrumb-item active\" aria-current=\"page\">Blog</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Start blog grid layout -->\n");
      out.write("    <div class=\"blog-grid-layout bg-2\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("              <p>We provide a new efficient RDPC protocol based on homomorphic hash function.User normally thinks about how to store information on files for future usage.<br>\n");
      out.write("                  Sometimes he used to share his data to another person’s also that is called public data which can be shared with others.But some data may be protective means<br>\n");
      out.write("                  private only for limited persons or single usage. Some Users will store the files in the cloud and share with other users but the information in the cloud is not<br>\n");
      out.write("                  encrypted so it cannot be secure so, I proposed this web application. In this project, I can encrypt the user’s uploaded files and I can also generate a secret key<br>\n");
      out.write("                  if any user requests for the file then I can verify and respond to their requests. Using the key, he can access the file.</p>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Start client section -->\n");
      out.write("    <div class=\"client-area client-area-3 client-area-style-2\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-6 col-md-8 offset-lg-3 col-md-2 col-12\">\n");
      out.write("                    <div class=\"section-title text-center\">\n");
      out.write("                        <h4 class=\"fw-7\">I Am Featured In</h4>\n");
      out.write("                        <p class=\"fz-16 fw-4\">It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. </p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- ================ Start Footer Section ================ -->\n");
      out.write("<footer class=\"footer txt-clr-2\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-3 ftr-link\">\n");
      out.write("                <div class=\"ftr-title pt-15 mb-35\">\n");
      out.write("                    <h3>GhoraGhuri</h3>\n");
      out.write("                </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">About Us</a></li>\n");
      out.write("                    <li><a href=\"#\">Help</a></li>\n");
      out.write("                    <form class=\"subscribe-form mt-25\">\n");
      out.write("                        <div class=\"form-group mb-0\">\n");
      out.write("                            <input type=\"email\" class=\"form-control email-input\" placeholder=\"Enter your email\">\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary subscribe-btn bg-1\">subscribe</button>\n");
      out.write("                    </form>\n");
      out.write("                </ul>\n");
      out.write("                <p class=\"fz-14 mt-30\">© 2019 All Right Reserved By GhoraGhuri</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-3 ftr-link\">\n");
      out.write("                <div class=\"ftr-title pt-15 mb-35\">\n");
      out.write("                    <h3>Quick Link</h3>\n");
      out.write("                </div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#\">Destination</a></li>\n");
      out.write("                    <li><a href=\"#\">Tour Story</a></li>\n");
      out.write("                    <li><a href=\"#\">Hotel & Resort</a></li>\n");
      out.write("                    <li><a href=\"#\">Restaurants</a></li>\n");
      out.write("                    <li><a href=\"#\">Transport</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <div class=\"ftr-title pt-15 mb-35\">\n");
      out.write("                    <h3>Twitter Feed</h3>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"twitter-link\">\n");
      out.write("                    <li><span class=\"mr-10\"><i class=\"fa fa-twitter\"></i></span><a href=\"#\">https://twitter.com /envato/status/ 944202192013144064 https://twitter.com/envato/status/944202192013144064</a></li>\n");
      out.write("                    <li><span class=\"mr-10\"><i class=\"fa fa-twitter\"></i></span><a href=\"#\">https://twitter.com /envato/status/ 944202192013144064 https://twitter.com/envato/status/944202192013144064</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-lg-3\">\n");
      out.write("                <div class=\"ftr-title pt-15 mb-35\">\n");
      out.write("                    <h3>Contact Information</h3>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"ftr-contact\">\n");
      out.write("                    @if(isset($settingsDisplay[0]))\n");
      out.write("                        @foreach($settingsDisplay as $setting)\n");
      out.write("                    <li><span>Location:</span>BSMRSTU</li>\n");
      out.write("                    <li><span>Email:</span> {{$setting->email}}</li>\n");
      out.write("                    <li><span>Phone:</span> {{$setting->phone}}</li>\n");
      out.write("                     @endforeach\n");
      out.write("                        @endif\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"ftr-social\">\n");
      out.write("                    <div class=\"ftr-title pt-15 mb-15\">\n");
      out.write("                        <h3 class=\"fz-18\">FOLLOW US</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"d-flex\">\n");
      out.write("                        <li><a href=\"http://facebook.com/\" class=\"icon-fb\"><i class=\"fa fa-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"https://twitter.com\" class=\"icon-twit\"><i class=\"fa fa-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"http://google.com/\" class=\"icon-glg\"><i class=\"fa fa-google\"></i></a></li>\n");
      out.write("                        <li><a href=\"http://youtube.com/\" class=\"icon-utb\"><i class=\"fa fa-youtube\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <a href=\"#\" class=\"scrollup\"><i class=\"fa fa-angle-up\"></i></a>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<!-- ================ Start Jquery Plugins ================ -->\n");
      out.write("<script src=\"{{asset('/blog/js/jquery.min.js')}}\"></script>\n");
      out.write("<!-- Bootstrap Js -->\n");
      out.write("<script src=\"{{asset('/blog/js/bootstrap.min.js')}}\"></script>\n");
      out.write("<!-- Owl Carousel Js -->\n");
      out.write("<script src=\"{{asset('/blog/js/owl.carousel.min.js')}}\"></script>\n");
      out.write("<!-- Swiper Master Js -->\n");
      out.write("<script src=\"{{asset('/blog/vendors/swiper-master/js/swiper.min.js')}}\"></script>\n");
      out.write("<!-- Slicknav Master -->\n");
      out.write("<script src=\"{{asset('/blog/vendors/slicknav-master/jquery.slicknav.min.js')}}\"></script>\n");
      out.write("<!-- magnific popup -->\n");
      out.write("<script src=\"{{asset('/blog/js/magnific-popup.min.js')}}\"></script>\n");
      out.write("<!-- counterup -->\n");
      out.write("<script src=\"{{asset('/blog/vendors/counterup/waypoints.min.js')}}\"></script>\n");
      out.write("<script src=\"{{asset('/blog/vendors/counterup/counterup.min.js')}}\"></script>\n");
      out.write("<!-- scroll up -->\n");
      out.write("<script src=\"{{asset('/blog/js/scrollup.js')}}\"></script>\n");
      out.write("<!-- main js -->\n");
      out.write("<script src=\"{{asset('/blog/js/main.js')}}\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"CSS/home.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>File Sharing</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"main\">\n");
      out.write("  <ul>\n");
      out.write("     <li><a href=\"#\">home</a></li>\n");
      out.write("\t <li><a href=\"#\">about</a></li>\n");
      out.write("\t <li><a href=\"registration.jsp\">registration</a></li>\n");
      out.write("\t <li><a href=\"upload.jsp\">upload</a></li>\n");
      out.write("         <li><a href=\"view.jsp\">view file</a></li>\n");
      out.write("         <li><a href=\"view_d.jsp\">download file</a></li>\n");
      out.write("\t <li class=\"submain\"><a href=\"login.jsp\">login</a>\n");
      out.write("\t    <ul class=\"sub\">\n");
      out.write("\t\t  <li><a href=\"logout\">logout</li>\n");
      out.write("\t </li>\n");
      out.write("  </ul>\n");
      out.write("  </div>\n");
      out.write("  <div style=\"clear:both\"></div>\n");
      out.write("  <img src=\"Images/study.jpg\">\n");
      out.write("  <div class=\"footer\">Copyright &copy;Only_Jahidul_Afrad.com</div>\n");
      out.write("    </body>\n");
      out.write("</html>-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
