package com.wlg.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7002_APP {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002_APP.class,args);
	}
}
