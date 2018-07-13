<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/7/13
  Time: 9:05
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title></title>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1" name="viewport" />
<link href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" rel="stylesheet" />
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.0.0-beta/js/bootstrap.min.js"></script>
<table class="table table-hover">
    <thead>
    <tr>
        <th>姓名</th>
        <th>编号</th>
        <th>信息</th>
        <th>涂鸦</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${callchainlist}" var="callchain">
        <tr>
            <td>${callchain.name}</td>
            <td>${callchain.ID}</td>
            <td>${callchain.inf}</td>
            <td>${callchain.nothing}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
