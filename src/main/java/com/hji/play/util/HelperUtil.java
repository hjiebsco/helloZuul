package com.hji.play.util;

import org.apache.commons.io.IOUtils;

import com.netflix.zuul.context.RequestContext;

public class HelperUtil {

	public static void printInputOutput(RequestContext ctx) {
		try {
			System.out.println("Input: " + IOUtils.toString(ctx.getRequest().getInputStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("body: " + ctx.getResponseBody());
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			System.out.println("Stream: " + IOUtils.toString(ctx.getResponseDataStream()));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
