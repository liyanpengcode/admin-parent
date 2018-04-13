package com.huifupay.module.common.enums;

/**
 * 微服务枚举类
 */
public enum MicroServiceTypeEnum {
    PUBLIC("public", "公共服务"),
    MERCHANT("merchant", "商户服务"),
    AGENT("agent", "代理商服务"),
    Message("message", "消息服务");

    private final String code;
    private final String desc;

    MicroServiceTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}