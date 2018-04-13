package com.huifupay.module.message.feign.fallback;

import com.huifupay.module.message.feign.SmsLogServiceFeign;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author guoqing
 * @title:
 * @description:
 * @date 2018/4/10 20:35
 */
@Component
public class SmsLogServiceFeignFallBack implements SmsLogServiceFeign {

    /*@Override
    public String getSmsLog(SmsLog sms) {
        return JSON.toJSONString(ServerResponse.createByErrorMessage("调用Message服务失败[Feign]！"));
    }*/

    @Override
    public Object getList(Map<String, Object> map) {
        return null;
    }

    @Override
    public int getCount(Map<String, Object> param) {
        return 0;
    }

    @Override
    public int deleteBatch(String[] ids) {
        return 0;
    }
}
