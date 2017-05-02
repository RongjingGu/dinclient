/**
 * Created by Gurongjing on 2017/4/28.
 */

function getApplicationInfo() {
    $.ajax({
        url: "main/getSignature.do",
        type: "post",
        data: "url=" + window.location.href,
        dataType: "json",
        cache: false,
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        success: function (data) {
            if (data.error) {
                $.alert("数据错误");
            } else {
                dd.ready(function () {
                    ;
                });
                dd.config(data);
                //alert(data.signature);
                dd.runtime.permission.requestAuthCode({
                    corpId: "dinga3b4fa38131d5f5b35c2f4657eb6378f",
                    onSuccess: function (result) {
                        // alert(result.code);
                        sendCode(result.code);
                    },
                    onFail: function (err) {
                    }
                });
            }
        },
        error: function () {
            $.alert("接口调用失败", "");
        }
    });
}

function sendCode(code) {
    $.ajax({
        url: "main/getUserInfoByCode.do",
        type: "post",
        data: "code=" + code,
        dataType: "json",
        cache: false,
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        success: function (data) {
            if (data.error) {
                $.alert("数据错误");
            } else {
                getUserDetail(data.userid)
            }
        },
        error: function () {
            $.alert("接口调用失败", "");
        }
    });
}

function getUserDetail(userid) {
    $.ajax({
        url: "main/getUserDetailByUserId.do",
        type: "get",
        data: "userid=" + userid,
        dataType: "json",
        cache: false,
        contentType: "application/x-www-form-urlencoded;charset=UTF-8",
        success: function (data) {
            if (data.error) {
                $.alert("数据错误");
            } else {
                $("#name").val(data.name);
                $("#unionid").val(data.unionid);
                $("#userid").val(data.userid);
                $("#mobile").val(data.mobile);
            }
        },
        error: function () {
            $.alert("接口调用失败", "");
        }
    });
}


