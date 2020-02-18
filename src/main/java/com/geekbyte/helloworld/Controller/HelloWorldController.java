package com.geekbyte.helloworld.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController   //该注解用于方法返回字符串
@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping("/world")
    @ResponseBody   //使其能返回字符串
    public String helloWorld() {
        return "Hello,World!";
    }
}
