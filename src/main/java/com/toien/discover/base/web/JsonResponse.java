package com.toien.discover.base.web;

public class JsonResponse {
	private boolean successful;
	
	private Integer code;

	private Object result;

	private String hint;
	
	public static JsonResponse sucess(Object result) {
		
		JsonResponse resp = new JsonResponse();
		
		resp.setCode(100);
		resp.setResult(result);
		resp.setSuccessful(true);
		
		return resp;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public String getHint() {
		return hint;
	}

	public Object getResult() {
		return result;
	}

	public boolean isSuccessful() {
		return successful;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public void setSuccessful(boolean successful) {
		this.successful = successful;
	}
	
}
