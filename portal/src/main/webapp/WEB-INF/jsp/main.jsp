<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>免登测试页</title>
    <script src="js/jquery.1.9.1.min.js"></script>
    <script src="js/dingtalk.js"></script>
    <script src="js/main.js"></script>
</head>
<body>


<div>
    <label>
        用户名:
    </label>
    <input id = "name"></input> </br>
    <label>
        用户唯一标示:
    </label>
    <input id = "unionid"></input></br>
    <label>
        用户id:
    </label>
    <input id = "userid"></input></br>
    <label>
        用户电话:
    </label>
    <input id = "mobile"></input></br>
    <button onclick="getApplicationInfo();" type="button" style="width: 800px;height: 80px"></button>

</div>
  <script type="application/javascript">
      //alert(location.href);

  </script>
</body>
</html>
