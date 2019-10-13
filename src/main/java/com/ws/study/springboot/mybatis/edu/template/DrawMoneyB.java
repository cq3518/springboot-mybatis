package com.ws.study.springboot.mybatis.edu.template;

import org.springframework.stereotype.Service;

@Service
public class DrawMoneyB extends BankTemplateMethod  implements InterfaceA{
    @Override
    void transact() {
        System.out.println("我要取款B");
    }

    @Override
    public String get() {
        return "B";
    }
}
