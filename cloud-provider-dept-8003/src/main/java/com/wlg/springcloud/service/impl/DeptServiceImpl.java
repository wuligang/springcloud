package com.wlg.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wlg.springcloud.dao.DeptDao;
import com.wlg.springcloud.entities.Dept;
import com.wlg.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long deptno) {
		return deptDao.findById(deptno);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

}
