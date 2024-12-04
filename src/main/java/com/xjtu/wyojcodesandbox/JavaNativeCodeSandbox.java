package com.xjtu.wyojcodesandbox;

import com.xjtu.wyojcodesandbox.model.ExecuteCodeRequest;
import com.xjtu.wyojcodesandbox.model.ExecuteCodeResponse;
import org.springframework.stereotype.Component;

/**
 * Java 原生实现代码沙箱（因为模板就是根据原生类实现的，这里不用覆盖任何方法，直接复用模板方法）
 */
@Component
public class JavaNativeCodeSandbox extends JavaCodeSandboxTemplate {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        return super.executeCode(executeCodeRequest); // 直接调用父类的方法，这样不用重写过程
    }
}
