package com.hji.play.web;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {

	private AtomicInteger counter = new AtomicInteger(0);
	
	@RequestMapping("/ok")
	public String OK() {
		return "Zuul gateway is up: " + counter.incrementAndGet();
	}

}
