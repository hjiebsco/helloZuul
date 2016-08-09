package com.hji.play;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.hji.play.filters.pre.SimplePostFilter;
import com.hji.play.filters.pre.SimplePreFilter;
import com.hji.play.filters.pre.SimpleRouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class HelloZuulApplication {

	public static void main(String[] args) {
		System.out.println("a new version");
		SpringApplication.run(HelloZuulApplication.class, args);
	}

	@Bean
	public SimplePreFilter simplePreFilter() {
		return new SimplePreFilter();
	}

	@Bean
	public SimpleRouteFilter simpleRouteFilter() {
		return new SimpleRouteFilter();
	}

	@Bean
	public SimplePostFilter simplePostFilter() {
		return new SimplePostFilter();
	}
}
