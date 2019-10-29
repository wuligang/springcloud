package com.wlg.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.wlg.myrule.MyRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	/**
	 * 使用随机算法替换默认的轮询算法
	 * @return
	 */
	@Bean
	public IRule myRule() {
		return new MyRule();
	}
}
