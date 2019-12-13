package com.moliniao.controller;

import com.moliniao.entity.Dish;
import com.moliniao.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: created by limingzhou
 * @date: 2019/12/6
 * @description: com.moliniao.controller
 */
@ResponseBody
@RestController
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping("list")
    public List<Dish> list() {
       return dishService.listDishInfo();
    }

    @PostMapping("add")
    public Boolean addDish() {
        return dishService.addDish();
    }
}
