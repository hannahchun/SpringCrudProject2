<%--
  Created by IntelliJ IDEA.
  User: hannahchun
  Date: 2022/12/02
  Time: 12:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
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

<h1>Add New Post</h1>
<form action="addok" method="post">
    <table id="list">
        <tr><th>Category</th><td><input type="text" name="category"/></td></tr>
        <tr><th>Title</th><td><input type="text" name="title"/></td></tr>
        <tr><th>Writer</th><td><input type="text" name="writer"/></td></tr>
        <tr><th>Content</th><td><textarea cols="50" rows="5" name="content"></textarea></td></tr>
    </table>
    <br/><button type="button" onclick="location.href='list'">View All Records</button>
    <button type="submit">Add</button>
</form>

</body>
</html>
