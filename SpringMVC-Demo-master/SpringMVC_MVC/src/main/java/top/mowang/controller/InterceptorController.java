package top.mowang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring-MVC-Demo
 *
 * * @author txssherry@gmail.com
 *  * @date 2023/1/9 15:47
 **/
@RestController
public class InterceptorController {

    @RequestMapping("testInterceptor")
    public String testInterceptor() {

        return "success";
    }

    @RequestMapping("testExceptionHandler")
    public String testExceptionHandler() {
        int i = 1 / 0;
        return "success";
    }

}
