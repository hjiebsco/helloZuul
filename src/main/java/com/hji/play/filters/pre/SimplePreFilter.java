package com.hji.play.filters.pre;

import com.netflix.zuul.ZuulFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimplePreFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(SimplePreFilter.class);

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() {
		log.info("doing PRE filter");
		return null;
	}

}
