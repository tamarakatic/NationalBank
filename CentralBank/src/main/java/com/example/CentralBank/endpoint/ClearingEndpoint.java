package com.example.CentralBank.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.CentralBank.service.ClearingService;
import com.example.CentralBank.service.jaxws.ProcessMT102;
import com.example.CentralBank.service.jaxws.ProcessMT102Response;
import com.example.service.mt102.SinglePayment;

@Endpoint
public class ClearingEndpoint extends WebServiceGatewaySupport {

    private static final String NAMESPACE_URI = "http://service.CentralBank.example.com/";

    @Autowired
    private ClearingService clearingService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "processMT102")
    @ResponsePayload
    public ProcessMT102Response processMT102(@RequestPayload ProcessMT102 mt102) {
        System.out.println(mt102.getArg0().getMessageId());
        System.out.println("single payments:");
        for(SinglePayment singlePayment : mt102.getArg0().getSinglePayment()) {
            System.out.println(singlePayment.getTotal());
        }
        ProcessMT102Response r = new ProcessMT102Response();
        String code = clearingService.processMT102(mt102.getArg0());
        if(code.equals("readyToClear")){
        	code = clearingService.performClear();
        }
        r.setReturn(code);
        
        return r;
    }

}
