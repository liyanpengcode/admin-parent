package com.huifupay.module.message.service.impl;

import com.huifupay.module.message.dao.SmsLogDao;
import com.huifupay.module.message.entity.SmsLog;
import com.huifupay.module.message.service.SmsLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service("smsLogService")
@Transactional
public class SmsLogServiceImpl implements SmsLogService {
	@Autowired
	private SmsLogDao smsLogDao;
	
	@Override
	public SmsLog get(String id){
		return smsLogDao.get(id);
	}

	@Override
	public List<SmsLog> getList(Map<String, Object> map){
		return smsLogDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return smsLogDao.getCount(map);
	}

	@Override
	public void save(SmsLog smsLog){
		smsLogDao.save(smsLog);
	}

	@Override
	public void update(SmsLog smsLog){
		smsLogDao.update(smsLog);
	}

	@Override
	public void delete(String id){
		smsLogDao.delete(id);
	}

	@Override
	public void deleteBatch(String[] ids){
		smsLogDao.deleteBatch(ids);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			SmsLog smsLog=get(id);
			smsLog.setSendSmsStatus(stateValue);
            update(smsLog);
        }
    }
	
}
