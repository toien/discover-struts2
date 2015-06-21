package com.toien.discover.base.web;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4877515735510916659L;
	
	
	protected JsonResponse jsonResponse;


	public JsonResponse getJsonResponse() {
		return jsonResponse;
	}

	public void setJsonResponse(JsonResponse jsonResponse) {
		this.jsonResponse = jsonResponse;
	}
}
