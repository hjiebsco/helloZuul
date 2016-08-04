package com.hji.play.filters.pre;

import java.io.IOException;
import java.util.Date;

import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.ZuulFilter;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimplePostFilter extends ZuulFilter {

	private static Logger log = LoggerFactory.getLogger(SimplePostFilter.class);

	@Override
	public String filterType() {
		return "post";
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
		log.info("doing POST filter");
		RequestContext ctx = RequestContext.getCurrentContext();
		if (!"/".equals(ctx.getRequest().getContextPath())) {
			return null;
		}
		String originResponseBody = "";
		try {
			originResponseBody = IOUtils.toString(ctx.getResponseDataStream());
		} catch (IOException e) {
			log.error("Problem to get response", e);
		}
		ctx.setResponseBody(originResponseBody + " ---> (appended by a POST filter at " + new Date() + ")");
		return null;
	}

}
