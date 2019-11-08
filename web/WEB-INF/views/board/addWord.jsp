<%--
  Created by IntelliJ IDEA.
  User: rider
  Date: 2019-11-08
  Time: 오후 3:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <script src="../resources/js/jquery-2.2.4.min.js"></script>
    <title>금칙어 추가</title>
</head>
<body>
    금칙어를 입력하세요<br>
    <input id="wordInput" type="text"><button id="addBtn">입력</button>

<script type="text/javascript">
    //
    document.getElementById("wordInput").onkeypress = function (ev) {
        if (ev.key === 'Enter') {
            insertWord();
        }
    }
    // 입력 버튼 눌렀을 때 금칙어 등록
    document.getElementById("addBtn").onclick = function (ev) {
        insertWord();
    }

    function insertWord() {
        var word = document.getElementById("wordInput");

        $.ajax({
            url : "insertWord",
            type : "post",
            data: {"word" : word.value},
            success: function(data) {
                console.log(data);
                if (data == 'dup') {
                    alert("해당 금칙어는 이미 등록되었습니다.\n다시 확인하시고 입력하세요. ");
                } else if(data == 'noword') {
                    alert("금칙어를 입력해 주세요.");
                } else if (data == 'success') {
                    alert("등록되었습니다.");
                    location.href = "getProhListPaging"
                }
            },
            error: function(err) {

            }
        })
    }
</script>
</body>
</html>
