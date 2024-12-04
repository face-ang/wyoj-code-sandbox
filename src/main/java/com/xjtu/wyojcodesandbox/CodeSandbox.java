package com.xjtu.wyojcodesandbox;

import com.xjtu.wyojcodesandbox.model.ExecuteCodeRequest;
import com.xjtu.wyojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
