package cn.blog.controller;

import cn.blog.service.UserService;
import cn.blog.utils.APIResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Api("用户管理类")
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/docker")
    @ResponseBody
    public APIResponse<String> dockerTest(){
        return APIResponse.success((Object) "hello docker");
    }
    
}
