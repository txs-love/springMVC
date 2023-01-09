package top.mowang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Spring-MVC-Demo
 *
 * @author txssherry@gmail.com
 * @date 2023/1/9 15:47
 **/
@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = {ArithmeticException.class})
    public String testException(Exception ex, Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
