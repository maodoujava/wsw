package cn.jiyun.ssm.controller;

import cn.jiyun.ssm.pojo.User;
import cn.jiyun.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

   /* @GetMapping("show/{deptno}")
    @ResponseBody
    public User findall(@PathVariable("deptno")long deptno){
        return this.UserService.findbyId(deptno);
    }*/

   @GetMapping("/")
    public User test(){
       return userService.findbyId(1);
   }
}
