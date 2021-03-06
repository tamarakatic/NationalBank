package com.example.Bank.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.Bank.service.ClearingService;
import com.example.Bank.service.RTGSService;
import com.example.Bank.service.jaxws.ProcessMT910;
import com.example.Bank.service.jaxws.ProcessMT910Response;

@Endpoint
public class MT910Endpoint {

	@Autowired
	private ClearingService clearingService;

	@Autowired
	private RTGSService rtgsService;

	private static final String NAMESPACE_URI = "http://service.Bank.example.com/";

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "processMT910")
	@ResponsePayload
	public ProcessMT910Response processMT910(@RequestPayload ProcessMT910 processMt910) {
		ProcessMT910Response response = new ProcessMT910Response();
		response.setReturn("test return mt910");
		if (processMt910.getArg0().getOrderMessageId().equals("RTGS")) {
			rtgsService.processMT910(processMt910.getArg0());
		} 
		else {
			clearingService.processMt910(processMt910.getArg0());
		}

		System.out.println("mt910 delivered....");

		return response;
	}
}
