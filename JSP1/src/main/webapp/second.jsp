                           <!-- JSP [Java Server Pages] -->
<%-- 
                       
*JSP stands for Java Server pages
* JSP is specification for deloping web application with Java programming language.
*JSP also stands for Jakarta server pages.
*JSP Engine is a peiece of software & converts JSP into a servlet.
*JSP Engine is part of server only.
*There are three phases in JSP Architecture-----
*1) conversion  :- done by JSP Engine.
 2)compilation  :- done by complier.    
 3)Execution :- done by JRE.
 
*JSP Element:= used to write JSP program.
   there are three jsp element-
    1) Scripting element :-
         a) scriptlets:- define inside methods. 
           Syntax:-
                 <% ........ %>   or    <jsp:scriptlet>............</jsp:scriptlet>
         b) declarations:- define outside methods but inside class.
           syntax:-
                <%!    ......   %>   or <jsp:declaration> .....   </jsp:declaration>
         c) Expression:- define as a parameter in println(.....).
           syntax:-
               <%=    ......   %>   or <jsp:expression> .....   </jsp:expression>
         d) Comments:-  
              <%--    ......   -%>  
              
    2) Directives:- there are three types....
         a) Include directive:-
            syntax:-  
                     <%@include ......... %>      Attribute:=   1) file="....."  *....= HTML or jsp filename
         a) Page directive:-
            syntax:-  
                     <%@Page ......... %>
         c) taglib directive:-
            syntax:-  
                     <%@taglib ......... %>      
    
    3)Actions :- there are 9 types of actions-----
            1)<jsp:forward>   2)<jsp:include>    3)<jsp:usebean>    4)<jsp:setProperty> 
            5)<jsp:getProperty>   6)<jsp:plugin>   7)<jsp:fallback>  8)<jsp:params> 
            9)<jsp:param>

 --%>
                       
<html>
<body bgcolor=yellow>
<h1>
 <jsp:scriptlet>
     out.println("Welcome to jsp");
 </jsp:scriptlet>
</h1>
</body>
</html>