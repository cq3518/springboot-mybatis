package com.ws.study.springboot.mybatis.edu.template;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author cq
 * @version 1.0.1
 * <p> </p>
 * @date 2019/10/11
 * <p> springboot-mybatis</p>
 **/
public class Factory {
    @Autowired
    private List<InterfaceA> interfaceA;


    public BankTemplateMethod get(String name) {
        for (InterfaceA a : interfaceA) {
            String str = a.get();
            if (str.equals(name) && a instanceof BankTemplateMethod ) {

                return (BankTemplateMethod)a;
            }
        }
        return null;
    }
}
