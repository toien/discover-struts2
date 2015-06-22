package com.toien.discover.base.web;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.config.entities.ResultConfig;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class ResultInterceptor implements Interceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4285667691469182276L;

	@Override
	public void destroy() {
		System.out.println("ResultInterceptor destroy...");
		
	}

	@Override
	public void init() {
		System.out.println("ResultInterceptor init...");
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		Map<String, ResultConfig> resultsMap = invocation.getProxy().getConfig().getResults();
		
		System.out.println(resultsMap);
		
		return invocation.invoke();
	}

}
