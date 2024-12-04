package com.xjtu.wyojcodesandbox.security;

import cn.hutool.core.io.FileUtil;

import java.nio.charset.Charset;

public class TestSecurityManager {
    public static void main(String[] args) {
        System.setSecurityManager(new MySecurityManager());
        FileUtil.writeString("aa","aaa", Charset.defaultCharset());
    }
}