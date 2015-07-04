package com.toien.discover.base.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.json.JSONInterceptor;

import com.opensymphony.xwork2.ActionInvocation;

public class PostJsonInterceptor extends JSONInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6692816700316913775L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
        
		// do nothing if request is "GET"
        if("GET".equals(request.getMethod())) {
        	return invocation.invoke();
        }
		
		return super.intercept(invocation);
	}
	
	

}
