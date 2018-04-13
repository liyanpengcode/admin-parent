package com.huifupay.module.message.service;

import com.huifupay.module.message.entity.SmsLog;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-04-11 15:16:49
 */
public interface SmsLogService {
	
	SmsLog get(String id);
	
	List<SmsLog> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(SmsLog smsLog);
	
	void update(SmsLog smsLog);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    void updateState(String[] ids, String stateValue);
}
