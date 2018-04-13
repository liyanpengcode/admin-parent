package com.huifupay.module.message.controller;

import com.huifupay.module.message.entity.SmsLog;
import com.huifupay.module.message.feign.SmsLogServiceFeign;
import com.huifupay.module.message.service.SmsLogService;
import com.huifupay.system.common.enumresource.StateEnum;
import com.huifupay.system.common.log.SysLog;
import com.huifupay.system.common.utils.PageUtils;
import com.huifupay.system.common.utils.Query;
import com.huifupay.system.common.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author guoqing
 * @title: Message服务控制类
 * @description: 通过Feign调用服务
 * @date 2018/4/10 15:50
 */
@Controller
@RequestMapping("smslog")
public class SmsLogController {
    @Autowired
    private SmsLogService smsLogService;

    @Resource
    private SmsLogServiceFeign smsLogServiceFeign;

    Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 跳转到列表页
     */
    @RequestMapping("/list")
    @RequiresPermissions("smslog:list")
    public String list() {
        return "module/smslog/list";
    }

    /**
     * 列表数据
     */
    @ResponseBody
    @RequestMapping("/listData")
    @RequiresPermissions("smslog:list")
    public R listData(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);

        //*************通过Feign调用接口-返回数据************start*
        List<SmsLog> smsLogList = (List<SmsLog>)smsLogServiceFeign.getList(query);
        int total = smsLogServiceFeign.getCount(query);
        //*************通过Feign调用接口-返回数据************end*

        PageUtils pageUtil = new PageUtils(smsLogList, total, query.getLimit(), query.getPage());
        return R.ok().put("page", pageUtil);
    }

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("smslog:save")
    public String add() {
        return "smslog/add";
    }

    /**
     * 跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("smslog:update")
    public String edit(Model model, @PathVariable("id") String id) {
        SmsLog smsLog = smsLogService.get(id);
        model.addAttribute("model", smsLog);
        return "smslog/edit";
    }

    /**
     * 信息
     */
    @ResponseBody
    @RequestMapping("/info/{id}")
    @RequiresPermissions("smslog:info")
    public R info(@PathVariable("id") String id) {
        SmsLog smsLog = smsLogService.get(id);
        return R.ok().put("smsLog", smsLog);
    }

    /**
     * 保存
     */
    @ResponseBody
    @SysLog("保存")
    @RequestMapping("/save")
    @RequiresPermissions("smslog:save")
    public R save(@RequestBody SmsLog smsLog) {
        smsLogService.save(smsLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @ResponseBody
    @SysLog("修改")
    @RequestMapping("/update")
    @RequiresPermissions("smslog:update")
    public R update(@RequestBody SmsLog smsLog) {
        smsLogService.update(smsLog);

        return R.ok();
    }

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用")
    @RequestMapping("/enable")
    @RequiresPermissions("smslog:update")
    public R enable(@RequestBody String[] ids) {
        String stateValue = StateEnum.ENABLE.getCode();
        smsLogService.updateState(ids, stateValue);
        return R.ok();
    }

    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用")
    @RequestMapping("/limit")
    @RequiresPermissions("smslog:update")
    public R limit(@RequestBody String[] ids) {
        String stateValue = StateEnum.LIMIT.getCode();
        smsLogService.updateState(ids, stateValue);
        return R.ok();
    }

    /**
     * 删除
     */
    @ResponseBody
    @SysLog("删除")
    @RequestMapping("/delete")
    @RequiresPermissions("smslog:delete")
    public R delete(@RequestBody String[] ids) {
        //smsLogService.deleteBatch(ids);
        int result = smsLogServiceFeign.deleteBatch(ids);
        if(result>0){
            return R.ok();
        }else{
            return R.error();
        }
    }

}
