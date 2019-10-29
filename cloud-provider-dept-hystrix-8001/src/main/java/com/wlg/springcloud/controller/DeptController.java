package com.wlg.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wlg.springcloud.entities.Dept;
import com.wlg.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService service;

	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "process_hystrix_get")
	public Dept get(@PathVariable Long id) {
		Dept dept = service.get(id);

		if (dept == null) {
			throw new RuntimeException("id:" + id + "不存在");
		}

		return dept;
	}

	/**
	 * get方法异常处理,在消费端实现服务降级这边可以注掉
	 */

	public Dept process_hystrix_get(@PathVariable Long id) {

		return new Dept().setDeptno(id).setDname("id:" + id + "不存在").setDb_source("no database have this info");
	}

}
