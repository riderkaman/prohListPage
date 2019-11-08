<%--
  Created by IntelliJ IDEA.
  User: rider
  Date: 2019-11-07
  Time: 오후 5:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>금칙어리스트</title>
    <style type="text/css">
        body{
            text-align:center;
        }
        table{
            width: 60%;
            height: 50%;
            margin: auto;
        }
    </style>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>no.</th>
        <th>금칙어</th>
        <th>등록자</th>
        <th>등록시간</th>
        <th>수정</th>
        <th>삭제</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="item" items="${list}" varStatus="status">
        <tr>
            <!-- <td><c:out value="${item.rnum}" /></td> -->
            <td><c:out value="${item.no}" /></td>
            <td><c:out value="${item.word}" /></td>
            <td><c:out value="${item.name}" /></td>
            <td><c:out value="${item.registerTime}" /></td>
            <td><button>수정</button></td>
            <td><button>삭제</button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<jsp:include page="/WEB-INF/views/board/paging.jsp">
    <jsp:param value="${paging.page}" name="page"/>
    <jsp:param value="${paging.beginPage}" name="beginPage"/>
    <jsp:param value="${paging.endPage}" name="endPage"/>
    <jsp:param value="${paging.prev}" name="prev"/>
    <jsp:param value="${paging.next}" name="next"/>
</jsp:include>

</div>
</body>
</html>
