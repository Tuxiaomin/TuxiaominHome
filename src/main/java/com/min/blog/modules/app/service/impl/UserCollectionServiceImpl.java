package com.min.blog.modules.app.service.impl;

import com.min.blog.modules.app.entity.UserCollection;
import com.min.blog.modules.app.mapper.UserCollectionMapper;
import com.min.blog.modules.app.service.UserCollectionService;
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
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollection> implements UserCollectionService {

}
