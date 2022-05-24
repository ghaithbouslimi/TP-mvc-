<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Cb"  class="BEANS.ControllerBean" scope="session"></jsp:useBean>

<b>le nom est : <%= Cb.getNom() %> </b> <br>
<b>le prenom est : <%= Cb.getPrénom() %> </b><br>
<b>le adresse est : <%= Cb.getAdresse() %> </b><br>
<b>le telephone est : <%= Cb.getTelephone() %> </b><br>
<b>le E-mail est : <%= Cb.getEmail() %> </b><br>
</body>
</html>