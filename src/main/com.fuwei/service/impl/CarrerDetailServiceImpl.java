package com.fuwei.service.impl;

import java.util.List;

import com.fuwei.pojo.CarrerDetail;
import com.fuwei.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fuwei.mapper.CarrerDetailMapper;
import com.fuwei.service.CarrerDetailService;

@Service
public class CarrerDetailServiceImpl implements CarrerDetailService {
	@Autowired
	CarrerDetailMapper carrerDetailMapper;
	
	
	public List<CarrerDetail> list1(String carrerDetail){
		return carrerDetailMapper.list1(carrerDetail);
	}

	@Override
	public void add1(CarrerDetail c) {
		carrerDetailMapper.add1(c);
		
	}


	@Override
	public void update1(CarrerDetail c) {
		carrerDetailMapper.update1(c);
	}


	@Override
	public void delete1(CarrerDetail c) {
		carrerDetailMapper.delete1(c.getCid());
	}


	@Override
	public CarrerDetail get1(int cid) {
		// TODO Auto-generated method stub
		return carrerDetailMapper.get1(cid);
	};

}
