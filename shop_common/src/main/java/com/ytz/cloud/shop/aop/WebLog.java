package com.ytz.cloud.shop.aop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @ClassName: WebLog
 * @Description: TODO  日志封装类
 * @author: basketBoy
 * @date: 2020/6/7
 * @Version: V1.0
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
public class WebLog implements Serializable {

    private static final long serialVersionUID = 3966114044588909923L;
    /**
     * 操作描述
     */
    private String description;

    /**
     * 操作用户
     */
    private String operationUser;

    /**
     * 操作时间
     */
    private Long startTime;

    /**
     * 消耗时间
     */
    private Integer spendTime;

    /**
     * 根路径
     */
    private String basePath;

    /**
     * URI
     */
    private String uri;

    /**
     * URL
     */
    private String url;

    /**
     * 请求类型
     */
    private String method;

    /**
     * IP地址
     */
    private String ip;

    /**
     * 请求参数
     */
    private Object parameter;

    /**
     * 请求返回的结果
     */
    private Object result;

}
