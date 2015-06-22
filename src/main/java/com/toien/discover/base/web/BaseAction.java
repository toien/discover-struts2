package com.toien.discover.base.web;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class BaseAction extends ActionSupport implements ServletRequestAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4877515735510916659L;
	
	public static final String JSON = "json";
	

	protected JsonResponse jsonResponse;
	
	protected HttpServletRequest request;
	

	public BaseAction() {
		ActionContext context = ActionContext.getContext();
		ActionInvocation invocation = context.getActionInvocation();

		invocation.addPreResultListener(new PreResultListener() {
			public void beforeResult(ActionInvocation invocation,
					String resultCode) {
				
				if (isAjaxRequest()) {
					System.out.println("Change to json result");
					invocation.setResultCode(JSON);
				}
			}
		});

		System.out.println("Constructing BaseAction...");
	}

	public JsonResponse getJsonResponse() {
		return jsonResponse;
	}

	public void setJsonResponse(JsonResponse jsonResponse) {
		this.jsonResponse = jsonResponse;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
	
	public boolean isAjaxRequest() {
		return "XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"));
	}
}
