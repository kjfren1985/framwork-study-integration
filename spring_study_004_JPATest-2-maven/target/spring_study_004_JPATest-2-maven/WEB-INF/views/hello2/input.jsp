<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
input.jsp 页面---------------->
<br>
<br>
<s:form action="home7" commandName="user" method="post">
username: <s:input path="usrName"/>
password: <s:input path="passWord"/>
<s:button value="submit">submit</s:button>
</s:form>
</body>
</html>