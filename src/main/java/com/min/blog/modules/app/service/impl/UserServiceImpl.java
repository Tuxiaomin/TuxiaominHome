package com.min.blog.modules.app.service.impl;

import com.min.blog.modules.app.entity.User;
import com.min.blog.modules.app.mapper.UserMapper;
import com.min.blog.modules.app.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author min
 * @since 2019-05-07
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
