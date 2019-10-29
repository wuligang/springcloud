package com.wlg.springcloud.service;

import java.util.List;

import com.wlg.springcloud.entities.Dept;

public interface DeptService {
	public boolean add(Dept dept);

	public Dept get(Long deptno);

	public List<Dept> list();
}
