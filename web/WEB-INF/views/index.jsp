<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rider
  Date: 2019-11-05
  Time: 오후 6:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
  <head>
    <script src="<c:url value="../resources/js/jquery-2.2.4.min.js" />"></script>
    <title>Main</title>
  </head>
  <body>
hello world<br>
  <button id="getBtn1">페이징리스트</button>

  <script type="text/javascript">
      document.getElementById("getBtn1").onclick = function (ev) {
        // console.log('클릭됨');
        location.href = 'getProhListPaging';
      }
  </script>
  </body>
</html>
