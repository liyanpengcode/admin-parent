<#--  chenyi 2018-04-11 15:16:49-->

<html>
<head>
    <title>详情页面</title>
    <#include "../../resource.ftl"/>
</head>
<body>
<div class="layui-field-box">
    <form class="layui-form" action="">
             <div class="layui-form-item">
            <label class="layui-label-left">短信记录id<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.id)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">发送所属模块 1 注册 <span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.sendSmsModel)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">发送所属url<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.sendSmsUrl)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">发送内容<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.sendSmsContent)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">发送时间<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.sendSmsTime)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">发送状态 1成功 2 失败<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.sendSmsStatus)!"-"}</label>
        </div>
              <div class="layui-form-item">
            <label class="layui-label-left">发送号码<span class="label_span">:</span></label>
            <label class="layui-label-right">${(model.sendSmsPhone)!"-"}</label>
        </div>
          </form>
</div>

</body>
</html>
