package org.cap.boot;

import java.time.LocalDate;

public class Expected_date {

	private LocalDate deliveryDate;
	private String deliveryLocation;
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getDeliveryLocation() {
		return deliveryLocation;
	}
	public void setDeliveryLocation(String deliveryLocation) {
		this.deliveryLocation = deliveryLocation;
	}
	@Override
	public String toString() {
		return "Expected_date [deliveryDate=" + deliveryDate + ", deliveryLocation=" + deliveryLocation + "]";
	}
	
	
	
}
