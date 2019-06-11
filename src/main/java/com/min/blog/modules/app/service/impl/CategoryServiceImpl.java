package com.min.blog.modules.app.service.impl;

import com.min.blog.modules.app.entity.Category;
import com.min.blog.modules.app.mapper.CategoryMapper;
import com.min.blog.modules.app.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
