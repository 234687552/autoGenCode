package com.company.project.service.impl;

import com.company.project.dao.CarMapper;
import com.company.project.model.Car;
import com.company.project.service.CarService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by lzd on 2017/11/28.
 */
@Service
@Transactional
public class CarServiceImpl extends AbstractService<Car> implements CarService {
    @Resource
    private CarMapper carMapper;

}
