package com.example.Company.service;

import com.example.Company.model.pojo.PaymentOrderPojo;
import com.example.Company.service.jaxws.ProcessPaymentOrder;
import com.example.service.bankstatementrequest.BankStatementRequest;

public interface SOAPClientService {

	public String sendPaymentOrder(PaymentOrderPojo paymentOrderModel);

	public byte[] generateAndEncryptSessionKey();
	
	public void sendSessionKey();
	
	public ProcessPaymentOrder signWithCert(ProcessPaymentOrder ppo);
	
	public String sendBankStatementRequest(BankStatementRequest bankStatementRequest);
	
}
