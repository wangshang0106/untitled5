<%--
  Created by IntelliJ IDEA.
  User: 王尚
  Date: 2018/10/26
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="statics/js/jquery-1.8.3.min.js"></script>

<html>
  <head>
    <title>$Title$</title>
    <script type="text/javascript">
      $(function () {
          $("button").click(function () {
              alert(1);
             $.getJSON("/hehe",{name:"周文文",pas:"123456"},function (res) {
                 alert(res);
             });
          });
      });

    </script>
  </head>
  <body>

      <button>点击</button>

  </body>
</html>
