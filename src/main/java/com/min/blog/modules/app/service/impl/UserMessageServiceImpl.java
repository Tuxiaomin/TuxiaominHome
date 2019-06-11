package com.min.blog.modules.app.service.impl;

import com.min.blog.modules.app.entity.UserMessage;
import com.min.blog.modules.app.mapper.UserMessageMapper;
import com.min.blog.modules.app.service.UserMessageService;
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
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
