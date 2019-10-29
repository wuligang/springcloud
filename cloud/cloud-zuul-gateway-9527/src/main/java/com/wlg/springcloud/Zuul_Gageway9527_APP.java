package com.wlg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul_Gageway9527_APP {

	public static void main(String[] args) {
		SpringApplication.run(Zuul_Gageway9527_APP.class, args);
	}
}
