package com.toien.discover.hello.web.action;

import com.toien.discover.base.web.BaseAction;
import com.toien.discover.base.web.JsonResponse;
import com.toien.discover.hello.po.Message.Status;

/**
 * demonstrate how enum type communicate with front end
 * 
 * @author toien
 *
 */
public class EnumAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1924750643923284136L;

	private Status status;
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String execute() throws Exception {
		
		System.out.println("execute EnumAction...");
		
		jsonResponse = JsonResponse.sucess(status);
		
        return JSON;
    }

}
