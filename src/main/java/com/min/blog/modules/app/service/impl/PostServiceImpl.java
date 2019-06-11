package com.min.blog.modules.app.service.impl;

import com.min.blog.modules.app.entity.Post;
import com.min.blog.modules.app.mapper.PostMapper;
import com.min.blog.modules.app.service.PostService;
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
public class PostServiceImpl extends ServiceImpl<PostMapper, Post> implements PostService {

}
