<%--
  Created by IntelliJ IDEA.
  User: rider
  Date: 2019-11-05
  Time: 오후 6:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <script
            src="https://code.jquery.com/jquery-2.2.4.js"
            integrity="sha256-iT6Q9iMJYuQiMWNd9lDyBUStIq/8PuOW33aOqmvFpqI="
            crossorigin="anonymous"></script>
    <title>$Title$</title>
  </head>
  <body>
hello world
${home}
  <button id="getBtn">가져오기</button>

  <script type="text/javascript">
      document.getElementById("getBtn").onclick = function (ev) {
        // console.log('클릭됨');
        location.href = 'getProhList';
      }
  </script>
  </body>
</html>
