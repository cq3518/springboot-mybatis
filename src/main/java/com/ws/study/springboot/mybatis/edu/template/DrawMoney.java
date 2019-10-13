package com.ws.study.springboot.mybatis.edu.template;

import org.springframework.stereotype.Service;

@Service
public class DrawMoney extends BankTemplateMethod  implements InterfaceA{
    @Override
    void transact() {
        System.out.println("我要取款");
    }

    @Override
    public String get() {
        return "A";
    }
}
