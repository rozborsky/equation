<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>web</title>
        <style>
           <%@include file='style.css' %>
        </style>
	</head>

	<body>
		<div id="content">
			<form:form action="solveTheEquation" method="post" commandName="getValues">
				<fieldset>

					<table border="0">
						<tr>
							<td>a</td>
							<td>b</td>
							<td>c</td>
						</tr>
						<tr>
							<td><form:input path="a" value="0"/></td>
							<td><form:input path="b" value="0"/></td>
							<td><form:input path="c" value="0"/></td>
						</tr>
						<tr>
							<td><form:errors path="a"/></td>
							<td><form:errors path="b"/></td>
							<td><form:errors path="c"/></td>
						</tr>
						<tr>
							<td colspan="3" align="center"><input type="submit" value="рассчитать" /></td>
						</tr>
					</table>
				</fieldset>
			</form:form>
    	</div>
    </body>
</html>