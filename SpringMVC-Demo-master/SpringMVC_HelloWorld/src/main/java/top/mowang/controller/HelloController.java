package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring-MVC-Demo
 * hello mvc
 *
 * @author txssherry@gmail.com
 * @date 2023/1/9 15:47
 **/
@Controller
@SuppressWarnings("all")
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/target")
    public String target(){
        return "target";
    }

}
