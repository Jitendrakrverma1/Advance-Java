
<html>
<body bgcolor=green text=red>
    <h1>
    
     <%
     String s1 = request.getParameter("uname");
     String s2 = request.getParameter("pword");
     if(s1.equals("abc") && s2.equals("123"))
     {
    	 out.println("Welcome to jsp....");
     }
     else{
    	 out.println("Invalid username/password....");
     }
     %>
   </h1>
</body>
</html>