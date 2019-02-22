
      <%
        HttpSession s = request.getSession();
        if(s.getAttribute("session_user") ==null || s.getAttribute("session_user") == "" || s.getAttribute("session_user").equals("")){
        	response.sendRedirect("login.jsp");
        }else{
            String email = (String)s.getAttribute("email");
        }
        
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie cookie : cookies) {
                cookie.setValue("-");
                cookie.setMaxAge(0);
                response.addCookie(cookie);
            }
        }
        
        response.addHeader("Cache-Control", "no-cache,no-store,private,must-revalidate,max-stale=0,post-check=0,pre-check=0"); 
        response.addHeader("Pragma", "no-cache"); 
        response.addDateHeader ("Expires", 0);
      %>
      
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout</title>
</head>
<body>
<h1>Logout Successfully</h1>

<%
if(session.getAttribute("session_user") != null){
	session.removeAttribute("session_user");
	request.getSession(false);
	session.setAttribute("session_user", null);
	session.invalidate();
	response.sendRedirect("login.jsp");
}
%>


</body>
</html>