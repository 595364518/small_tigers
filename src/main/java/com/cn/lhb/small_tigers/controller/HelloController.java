package com.cn.lhb.small_tigers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping(value = "/index")
    public ModelAndView modelAndView() throws Exception {
        ModelAndView mav = new ModelAndView("index");
        //测试专用
//        if(1==1){
//            throw new Exception("这是一个1=1的真异常");
//        }
        mav.addObject("name","猪猪");
        return mav;
    }
}
