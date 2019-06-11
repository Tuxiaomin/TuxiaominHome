package com.min.blog.modules.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestDataBinder;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

public class BaseController {
    @Autowired
    HttpServletRequest req;



}


