package com.huifupay.module.message.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-04-11 15:16:49
 */
public class SmsLog implements Serializable {
	private static final long serialVersionUID = 1L;
	
	/**短信记录id**/
	private String id;
	/**发送所属模块 1 注册 **/
	private String sendSmsModel;
	/**发送所属url**/
	private String sendSmsUrl;
	/**发送内容**/
	private String sendSmsContent;
	/**发送时间**/
	private Date sendSmsTime;
	/**发送状态 1成功 2 失败**/
	private String sendSmsStatus;
	/**发送号码**/
	private String sendSmsPhone;

	/**
	 * 设置：短信记录id
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * 获取：短信记录id
	 */
	public String getId() {
		return id;
	}
	/**
	 * 设置：发送所属模块 1 注册 
	 */
	public void setSendSmsModel(String sendSmsModel) {
		this.sendSmsModel = sendSmsModel;
	}
	/**
	 * 获取：发送所属模块 1 注册 
	 */
	public String getSendSmsModel() {
		return sendSmsModel;
	}
	/**
	 * 设置：发送所属url
	 */
	public void setSendSmsUrl(String sendSmsUrl) {
		this.sendSmsUrl = sendSmsUrl;
	}
	/**
	 * 获取：发送所属url
	 */
	public String getSendSmsUrl() {
		return sendSmsUrl;
	}
	/**
	 * 设置：发送内容
	 */
	public void setSendSmsContent(String sendSmsContent) {
		this.sendSmsContent = sendSmsContent;
	}
	/**
	 * 获取：发送内容
	 */
	public String getSendSmsContent() {
		return sendSmsContent;
	}
	/**
	 * 设置：发送时间
	 */
	public void setSendSmsTime(Date sendSmsTime) {
		this.sendSmsTime = sendSmsTime;
	}
	/**
	 * 获取：发送时间
	 */
	public Date getSendSmsTime() {
		return sendSmsTime;
	}
	/**
	 * 设置：发送状态 1成功 2 失败
	 */
	public void setSendSmsStatus(String sendSmsStatus) {
		this.sendSmsStatus = sendSmsStatus;
	}
	/**
	 * 获取：发送状态 1成功 2 失败
	 */
	public String getSendSmsStatus() {
		return sendSmsStatus;
	}
	/**
	 * 设置：发送号码
	 */
	public void setSendSmsPhone(String sendSmsPhone) {
		this.sendSmsPhone = sendSmsPhone;
	}
	/**
	 * 获取：发送号码
	 */
	public String getSendSmsPhone() {
		return sendSmsPhone;
	}
}
