<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.1.9.1.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/dingtalk.js"></script>
</head>
<body>
<input type="text" id="url">
  <button onclick="getApplicationInfo();" type="button"></button>
  <script type="application/javascript">
      //alert(location.href);
      dd.runtime.permission.requestAuthCode({
          corpId: "dinga3b4fa38131d5f5b35c2f4657eb6378f",
          onSuccess: function(result) {
             alert(result.code)
          },
          onFail : function(err) {}
      })
  </script>
</body>
</html>
