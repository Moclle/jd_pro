package com.jd.springmvcAdvice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@ControllerAdvice
public class MyControllerAdvice {




    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", exception.getMessage());
        return modelAndView;
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
    }

    @ModelAttribute
    public void addAttributes(Model model) {
        model.addAttribute("author", "zard1991");
        model.addAttribute("time", LocalDate.now());
    }

}
