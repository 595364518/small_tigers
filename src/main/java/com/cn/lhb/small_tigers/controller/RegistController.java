package com.cn.lhb.small_tigers.controller;

import com.cn.lhb.small_tigers.domain.User;
import com.cn.lhb.small_tigers.mapper.GlobalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegistController {

    @Autowired(required = false)
    GlobalMapper globalMapper;

    @RequestMapping(value ="/regist" )
    public void ss(){

    }
    @RequestMapping(value = "/regists")
    public String regist(User user, Model m){
        User user1=null;
        user1 = globalMapper.queryUser(user.getUsername());
        if(user1 ==null){
            return "success";
        }
        m.addAttribute("user1",user1);
        return "failed";
    }

}
