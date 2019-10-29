package com.wlg.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.wlg.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService	>{

	@Override
	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			
			@Override
			public List<Dept> list() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Dept get(Long id) {
				return new Dept()
						.setDeptno(id)
						.setDname("服务暂时不可用，已采用服务降级措施")
						.setDb_source("no database have this info");
			}
			
			@Override
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
