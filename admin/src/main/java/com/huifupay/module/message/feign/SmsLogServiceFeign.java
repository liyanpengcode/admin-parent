package com.huifupay.module.message.feign;

import com.huifupay.module.common.constant.MicroServiceTypeConstant;
import com.huifupay.module.message.feign.fallback.SmsLogServiceFeignFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * @author guoqing
 * @title: 短信服务Feign
 * @description:
 * @date 2018/4/10 20:30
 */
@FeignClient(name = MicroServiceTypeConstant.MESSAGE, fallback = SmsLogServiceFeignFallBack.class)
public interface SmsLogServiceFeign {

    @RequestMapping(value="sms/getList",method = RequestMethod.POST)
    Object getList(Map<String, Object> map);

    @RequestMapping(value = "sms/getCount", method = RequestMethod.POST)
    int getCount(Map<String, Object> param);

    @RequestMapping(value = "sms/deleteBatch", method = RequestMethod.POST)
    int deleteBatch(String[] ids);
}