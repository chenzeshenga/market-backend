package com.chenzeshenga.market.entity;

import java.util.List;

public class VenueData {

	private int code;
	private String msg;
	private List<Venue> data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public List<Venue> getData() {
		return data;
	}

	public void setData(List<Venue> data) {
		this.data = data;
	}

}
