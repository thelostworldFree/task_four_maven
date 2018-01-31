package com.fuwei.service;

import java.util.List;

import com.fuwei.pojo.CarrerDetail;
import com.fuwei.pojo.Student;

public interface CarrerDetailService {

	List<CarrerDetail> list1(String carrerDetail);
	void add1(CarrerDetail c);
	void update1(CarrerDetail c);
	void delete1(CarrerDetail c);
	CarrerDetail get1(int cid);

}
