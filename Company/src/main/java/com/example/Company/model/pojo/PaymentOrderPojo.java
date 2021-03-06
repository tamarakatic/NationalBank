package com.example.Company.model.pojo;

public class PaymentOrderPojo {

	private Long invoiceId;
	
	private double amount;
	
	private boolean urgent;
	
	public PaymentOrderPojo(){}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean getUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}
	
	
}
