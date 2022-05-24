<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="Cb" class="BEANS.AuthentificationBean" scope="session"></jsp:useBean>
<B>Bienvenue a votre session</B> <br>
<%if(request.getParameter("name").equals("")){ %>
<br>
<b>le nom est : <%= Cb.getNom() %> </b> <br><br>
<b>le prenom est : <%= Cb.getPrenom() %> </b><br>
<%} %>

nom <%= request.getParameter("name") %>
prenom <%= request.getParameter("Uname") %>
</body>
</html>