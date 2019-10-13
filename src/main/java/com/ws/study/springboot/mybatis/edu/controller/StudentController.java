package com.ws.study.springboot.mybatis.edu.controller;


import com.ws.study.springboot.mybatis.edu.entity.Student;
import com.ws.study.springboot.mybatis.edu.service.StudentService;
import com.ws.study.springboot.mybatis.edu.template.BankTemplateMethod;
import com.ws.study.springboot.mybatis.edu.template.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;


/**
 * <p>
 * 学生表 前端控制器
 * </p>
 *
 * @author 王松
 * @since 2019-01-23
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    @Autowired(required = false)
    private Factory factory;
    @Autowired
    private Map<String,BankTemplateMethod> service;

    @GetMapping("list")
    public Object getStudent(@RequestParam String name) {

        List<Student> list3 = studentService.findByNameUseMapper(name);
        System.out.println(list3);

        return list3;
    }
    @GetMapping("template")
    public String getTemplate() {
        /*service.get("drawMoney").process();
         new DrawMoney().evaluate();*/
         factory.get("A").process();
        return "";
    }


}
