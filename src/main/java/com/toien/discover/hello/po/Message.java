package com.toien.discover.hello.po;


public class Message {
	public static enum Status {
		NOT_PROCESSED(0, "未处理"), DELETED(1, "已删除"), PUNISHED(2, "已惩罚");
		
		private static Status[] ALL = Status.values();
		
		private int value;
		
		private String text;
		
		Status(int value) {
			this.value = value;
		}
		
		Status(int value, String text) {
			this.value = value;
			this.text = text;
		}
		
		public int getValue() {
			return value;
		}

		public String getText() {
			return text;
		}
		
		public String toString() {
			return this.text;
		}
		
		public static Status find(int value) {
			for(Status var : ALL) {
				if(var.getValue() == value) {
					return var;
				}
			}
			
			return null;
		}
		
	}
	
	private Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
}
