<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/8
  Time: 16:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <TITLE>上传</title>
  </head>
  <body>
  <form action="UpLoadPhotoServlet" method="post" enctype="multipart/form-data">文件:
    <input name="filename" type="file"> <br>
    <input name="submit" type="submit" value="上传">
  </form>
  </body>
</html>
