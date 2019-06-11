package com.min.blog.modules.app.service.impl;

import com.min.blog.modules.app.entity.Comment;
import com.min.blog.modules.app.mapper.CommentMapper;
import com.min.blog.modules.app.service.CommentService;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
