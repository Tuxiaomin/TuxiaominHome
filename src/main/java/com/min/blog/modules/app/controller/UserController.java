package com.min.blog.modules.app.controller;


import com.min.blog.modules.app.entity.User;
import com.min.blog.modules.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author min
 * @since 2019-05-07
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/getBy")
    public Object getBy(){
        User u = userService.getById(1125667541155414017L);

        return u;
    }

}
