/**
 * Created by Gurongjing on 2017/4/28.
 */

function getApplicationInfo(){
    $.ajax({
            url:"main/getSignature.do",
            type:"post",
            data:"url="+$("#url").val(),
            dataType:"json",
            cache: false,
            contentType:"application/x-www-form-urlencoded;charset=UTF-8",
            success:function(data){
                if(data.error){
                    $.alert("数据错误");
                }else{
                    var innerHtml = "";
                    innerHtml += "<span>agentId"+data.agentId+"</span>";
                    $("#caselist_wrap").html(innerHtml);
                }
            },
            error: function() {
                $.alert("接口调用失败", "");
            }
        });
}
