package com.hji.play;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.hji.play.filters.pre.SimpleFilter;

@SpringBootApplication
@EnableZuulProxy
public class HelloZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloZuulApplication.class, args);
	}

	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
