/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.toien.discover.hello.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.toien.discover.base.web.BaseAction;
import com.toien.discover.base.web.JsonResponse;

/**
 * <code>Set welcome message.</code>
 */
public class JSONAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8708293693543929632L;

	private String string1 = "A";
	private String string2 = null;
	private String[] stringarray1 = { "A1", "B1" };

	private int number1 = 123456789;

	private int[] numberarray1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	private List<String> lists = new ArrayList<String>();
	private Map<String, String> maps = new HashMap<String, String>();

	public JSONAction() {
		lists.add("list1");
		lists.add("list2");
		lists.add("list3");
		lists.add("list4");
		lists.add("list5");

		maps.put("key1", "value1");
		maps.put("key2", "value2");
		maps.put("key3", "value3");
		maps.put("key4", "value4");
		maps.put("key5", "value5");
	}

	public String execute() {
		
		JsonResponse response = new JsonResponse();
		
		response.setCode(101);
		response.setResult(string1);
		
		setJsonResponse(response);
		return Action.SUCCESS;
	}

	// no getter method, will not include in the JSON

	public List<String> getLists() {
		return lists;
	}

	public Map<String, String> getMaps() {
		return maps;
	}

	public int getNumber1() {
		return number1;
	}

	public int[] getNumberarray1() {
		return numberarray1;
	}

	public String getString1() {
		return string1;
	}

	public String getString2() {
		return string2;
	}

	public String[] getStringarray1() {
		return stringarray1;
	}

	public void setLists(List<String> lists) {
		this.lists = lists;
	}

	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public void setNumberarray1(int[] numberarray1) {
		this.numberarray1 = numberarray1;
	}

	public void setString1(String string1) {
		this.string1 = string1;
	}

	public void setString2(String string2) {
		this.string2 = string2;
	}

	public void setStringarray1(String[] stringarray1) {
		this.stringarray1 = stringarray1;
	}
}
