package com.purplehaze.course.entities.enums;

public enum OrderStatus {
	
	WAINTIG_PAYMENT(0),
	PAID(1),
	SHIPPED(2),
	DELIVERED(3),
	CANCELED(4);
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code; 
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid orderStatus code!");
	}
}
