package org.cap.boot;

import java.time.LocalDate;

public class OrderDetails {
	
	private int order_id;
	private LocalDate order_date;
	private String delivery_loc;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public LocalDate getOrder_date() {
		return order_date;
	}
	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}
	public String getDelivery_loc() {
		return delivery_loc;
	}
	public void setDelivery_loc(String delivery_loc) {
		this.delivery_loc = delivery_loc;
	}
	@Override
	public String toString() {
		return "OrderDetails [order_id=" + order_id + ", order_date=" + order_date + ", delivery_loc=" + delivery_loc
				+ "]";
	}
	
	
	

}
