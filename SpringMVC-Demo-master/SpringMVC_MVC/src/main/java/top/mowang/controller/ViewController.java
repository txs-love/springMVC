package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Spring-MVC-Demo
 *
 * * @author txssherry@gmail.com
 *  * @date 2023/1/9 15:47
 **/
@Controller
public class ViewController {

    @RequestMapping("/testView")
    public String testView(){
        return "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:https://mowangblog.top";
    }
}
