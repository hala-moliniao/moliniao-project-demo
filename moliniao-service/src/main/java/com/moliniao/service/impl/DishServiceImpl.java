package com.moliniao.service.impl;

import com.moliniao.entity.Dish;
import com.moliniao.mapper.DishMapper;
import com.moliniao.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: created by limingzhou
 * @date: 2019/12/6
 * @description: com.moliniao.service.impl
 */
@Slf4j
@Service
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;

    @Override
    public List<Dish> listDishInfo() {
        return dishMapper.selectAll();
    }
}
