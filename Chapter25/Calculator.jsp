<%@ page language="java" %>
<jsp:useBean id= "calc" scope= "session"   class= "com.sap.examples.calculator.beans.CalcProxy" />

<html>
<head>
<title>
Calculator
</title>
<h1>Calculator Example</h1>
</head>
<body>
<FORM METHOD= "post" ACTION= "Calculator.jsp" >
<P> Select Operation: </P>
<P><SELECT NAME= "expression" >
<OPTION VALUE=1> Multiply
<OPTION VALUE=2> Divide
<option VALUE=3> Add
<option VALUE=4> Subtract
</SELECT></P>
<P> First number: </P>
<P><INPUT NAME= "firstnumber" size=10></P>
<P> Second number: </P>
<P><INPUT name= "secondnumber" size=10></P>
<P><INPUT TYPE= "SUBMIT" NAME= "Submit" VALUE= "Calculate" ></P>
</FORM>

<P>
<HR HEIGHT= "1px" WIDTH= "80%" COLOR= "#000000" >
</P>
<% try { %>
<P>
<B> <%="Result is " + calc.getResult(request.getParameter("firstnumber"),
 request.getParameter("secondnumber"), request.getParameter("expression"))%></B>
</P>
<% } catch (Exception ex) { %>
     <%=ex.getMessage() %>
<% } %>

</body>
</html>
