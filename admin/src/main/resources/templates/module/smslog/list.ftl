<#--  chenyi 2018-04-11 15:16:49-->
<!DOCTYPE html>
<html>
<head>
    <title>列表</title>
    <#include "../../resource.ftl"/>
    <script type="text/javascript" src="/module/smslog/js/list.js"></script>
</head>
<body>
<form class="layui-form " action="">
    <div class="layui-form-item">
        <label class="layui-form-label">发送号码:</label>
        <div class="layui-input-inline">
            <input type="text" name="sendSmsPhone"  placeholder="请输入手机号码" class="layui-input">
        </div>

        <div class="layui-input-normal">
            <#--<button class="layui-btn layui-btn-green" lay-submit="" lay-filter="moreSearch">
                <i class="fa fa-chevron-down">&nbsp;</i>更多
            </button>-->
            <button class="layui-btn search-btn" table-id="smsLogTable" lay-submit="" lay-filter="search">
                <i class="fa fa-search">&nbsp;</i>查询
            </button>
            <button type="reset" class="layui-btn layui-btn-primary"><i class="fa fa-refresh">&nbsp;</i>重置</button>
        </div>
    </div>
    <div class="layui-form-item more-search">
       <#-- 更多条件-->
    </div>
</form>
<#--<div class="layui-btn-group">
        <@shiro.hasPermission name="smslog:save">
        <button class="layui-btn" onclick="addPage('/smslog/add')">
            <i class="fa fa-plus">&nbsp;</i>增加
        </button>
        </@shiro.hasPermission>
        <@shiro.hasPermission name="smslog:update">
        <button class="layui-btn" onclick="editPage('smsLogTable','/smslog/edit')">
            <i class="fa fa-pencil-square-o">&nbsp;</i>修改
        </button>
        <button class="layui-btn layui-btn-green" onclick="updateState('批量启用','smsLogTable','/smslog/enable')">
            <i class="fa fa-check-square-o">&nbsp;</i>启用
        </button>
        <button class="layui-btn  layui-btn-danger" onclick="updateState('批量禁用','smsLogTable','/smslog/limit')">
            <i class="fa fa-expeditedssl">&nbsp;</i>禁用
        </button>
        </@shiro.hasPermission>
        <@shiro.hasPermission name="smslog:delete">
         <button class="layui-btn layui-btn-delete" onclick="deleteBatch('批量删除','smsLogTable','/smslog/delete');">
            <i class="fa fa-trash-o">&nbsp;</i>删除
        </button>
        </@shiro.hasPermission>
</div>-->
<div class="layui-form ">
    <table class="layui-table" id="smsLogTable" cyType="pageGrid"
           cyProps="url:'/smslog/listData',checkbox:'true',pageColor:'#2991d9'">
        <thead>
        <tr>
            <!--复选框-->
            <th width="1%" param="{type:'checkbox'}">
                <input type="checkbox" lay-skin="primary" lay-filter="allChoose">
            </th>
            			            <!--isPrimary：是否是主键-->
            <th width="10%" param="{name:'id',isPrimary:'true',hide:'true'}">短信记录id</th>

		          <th width="10%" param="{name:'sendSmsModel',codeName:'sendSmsModel',render:'Render.sendSmsModel',sort:'true'}">发送所属模块</th>
			            			
		          <#--<th width="10%" param="{name:'sendSmsUrl',sort:'true'}">发送所属url</th>-->
			            			
		          <th width="10%" param="{name:'sendSmsContent',sort:'true'}">发送内容</th>
			            			
		          <th width="10%" param="{name:'sendSmsTime',sort:'true'}">发送时间</th>
			            			
		          <th width="10%" param="{name:'sendSmsStatus',codeName:'sendSmsStatus',render:'Render.sendSmsStatus',sort:'true'}">发送状态</th>
			            			
		          <th width="10%" param="{name:'sendSmsPhone',sort:'true'}">发送号码</th>
			                        <!--isPrimary：渲染列-->
            <#--<th width="10%" param="{name:'state',enumName:'StateEnum',render:'Render.customState'}">状态</th>-->
            <th width="10%" param="{operate:'true',buttons:'Render.state<#--,Render.edit-->,Render.delete'}">操作</th>
        </tr>
        </thead>
    </table>
</div>
</body>
</html>