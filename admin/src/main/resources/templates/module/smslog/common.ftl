<#--  公用页面-->
<#--  chenyi 2018-04-11 15:16:49-->
            <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">短信记录id<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="id" maxlength="20" lay-verify="required"
                 value="${(model.id)!""}"  placeholder="请输入短信记录id"  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">发送所属模块 1 注册 <span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="sendSmsModel" maxlength="255" lay-verify="required"
                 value="${(model.sendSmsModel)!""}"  placeholder="请输入发送所属模块 1 注册 "  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">发送所属url<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="sendSmsUrl" maxlength="255" lay-verify="required"
                 value="${(model.sendSmsUrl)!""}"  placeholder="请输入发送所属url"  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">发送内容<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="sendSmsContent" maxlength="255" lay-verify="required"
                 value="${(model.sendSmsContent)!""}"  placeholder="请输入发送内容"  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">发送时间<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="sendSmsTime" maxlength="20" lay-verify="required"
                 value="${(model.sendSmsTime)!""}"  placeholder="请输入发送时间"  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">发送状态 1成功 2 失败<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="sendSmsStatus" maxlength="255" lay-verify="required"
                 value="${(model.sendSmsStatus)!""}"  placeholder="请输入发送状态 1成功 2 失败"  class="layui-input">
            </div>
        </div>

              <div class="layui-form-item">${(model.bucket)!""}
            <label class="layui-form-label">发送号码<span class="span_must">*</span></label>
            <div class="layui-input-normal">
                <input type="text"  name="sendSmsPhone" maxlength="255" lay-verify="required"
                 value="${(model.sendSmsPhone)!""}"  placeholder="请输入发送号码"  class="layui-input">
            </div>
        </div>

             <#-- <div class="layui-form-item">
            <label class="layui-form-label">状态</label>
            <div cyType="radioTool" cyProps="enumName:'StateEnum'" name="state"
                 value="${(model.state)!"1"}" class="layui-input-inline"></div>
        </div>-->