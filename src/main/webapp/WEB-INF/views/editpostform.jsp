<%--
  Created by IntelliJ IDEA.
  User: hannahchun
  Date: 2022/12/02
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Form</title>
</head>
<style>
    #list {
        font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }
    #list td, #list th {
        border: 1px solid #ddd;
        padding: 8px;
        text-align:left;
    }
    #list tr:nth-child(even){background-color: #f2f2f2;}
    #list tr:hover {background-color: #ddd;}
    #list th {
        padding-top: 12px;
        padding-bottom: 12px;
        text-align: center;
        background-color: #006bb3;
        color: white;
    }
</style>
<body>

<h1>Edit Form</h1>
<form:form modelAttribute="boardVO" method="post" action="../editok">
    <form:hidden path="id" />
    <table id="list">
        <tr><th>Category</th><td><form:input path="category" /></td></tr>
        <tr><th>Title:</th><td><form:input path="title" /></td></tr>
        <tr><th>Writer:</th><td><form:input path="writer" /></td></tr>
        <tr><th>Content:</th><td><form:textarea cols="50" rows="5" path="content" /></td></tr>
    </table>
    <br/><button type="submit">Edit</button>
    <input type="button" value="Cancel" onclick="history.back()"/>
</form:form>

</body>
</html>
