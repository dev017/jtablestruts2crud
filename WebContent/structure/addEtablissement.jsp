<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="ActionEtablissement" >
  <s:textfield name="nom" label="Name" value="" />
<%--   <s:textarea name="tel" label="Tél" value="" cols="50" rows="5" /> --%>
   <s:textfield name="tel" label="Téléphone" value="" />
   <s:textfield name="fax" label="Fax" value="" />
  <s:submit />
</s:form>


<s:if test="etablissementList.size() > 0">
<table border="1px" cellpadding="8px">
	<tr>
		<th>Nom</th>
		<th>Téléphone</th>
		<th>Fax</th>
	</tr>
	<s:iterator value="customerList" status="userStatus">
		<tr>
			<td><s:property value="nom" /></td>
			<td><s:property value="tel" /></td>
			<td><s:property value="fax" /></td>
<%-- 			<td><s:date name="createdDate" format="dd/MM/yyyy" /></td> --%>
		</tr>
	</s:iterator>
</table>
</s:if>
<br/>


</body>
</html>