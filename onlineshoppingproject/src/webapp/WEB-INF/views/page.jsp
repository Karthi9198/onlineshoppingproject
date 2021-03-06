<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value=/resources/css" />
<spring:url var="js" value=/resources/js" />
<spring:url var="images" value=/resources/images" />



<c:set var="contextRoot" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Onlineshoppingproject - ${title}</title>
    
    <script>
    	window.menu = '${title}";
    </script>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/${css}/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
     <%@include file="./shared/navbar.jsp"%>


    <!-- Page Content -->

    <!-- Loading the home content -->
    <c:if test="${userClickHome == true }"> 
     <%@include file="home.jsp"%>
     </c:if>
     
         <!-- Load when user clicks about -->
    <c:if test="${userClickAbout == true }"> 
     	<%@include file="about.jsp"%>
    </c:if>
    
        <!-- Load when the user clicks contact -->
    <c:if test="${userClickContact == true }"> 
    	 <%@include file="contact.jsp"%>
    </c:if>
    
       <!-- Load when the user clicks contact -->
    <c:if test="${userClickAllProducts == true or userClickCategoryProducts==true}"> 
    	 <%@include file="listProducts.jsp"%>
    </c:if>
     
    

    <!-- /.container -->

   <!-- /.footer -->
   <%@include file="./shared/footer.jsp"%>
   
    <!-- Bootstrap core JavaScript -->
    <script src="vendor/${js}/jquery.min.js"></script>
    <script src="vendor/bootstrap/${js}/bootstrap.bundle.min.js"></script>

	<!-- Self coded javascript  -->
	 <script src="${js}/myapp.js"></script>
   
  </body>

</html>
