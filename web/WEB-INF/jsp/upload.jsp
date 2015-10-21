<%--
  Created by IntelliJ IDEA.
  User: azheng
  Date: 10/21/2015
  Time: 1:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <form action="<%= request.getContextPath()%>/course/upload/doUpload" method="post" enctype="multipart/form-data">
    <input type="file" name="file" />
    <button type="submit">提交</button>
  </form>
</body>
</html>
