package com.xjtu.wyojcodesandbox.model;

import lombok.Data;

/**
 * 进程执行信息
 */
@Data
public class ExecuteMessage {
    /**
     * 返回码
     */
    private Integer exitValue;
    /**
     * 程序执行正常信息
     */
    private String message;
    /**
     * 程序执行错误信息
     */
    private String errorMessage;
    /**
     * 程序执行时间（放工具类里面，因为是在工具类里执行的）
     */
    private Long time;
    /**
     * 程序执行内存
     */
    private Long memory;
}
