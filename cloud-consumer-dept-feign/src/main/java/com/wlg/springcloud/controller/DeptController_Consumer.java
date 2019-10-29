package com.wlg.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wlg.springcloud.entities.Dept;
import com.wlg.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {

	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/add", method = RequestMethod.POST)
	public boolean add(Dept dept) {
		return service.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return service.list();
	}

}
