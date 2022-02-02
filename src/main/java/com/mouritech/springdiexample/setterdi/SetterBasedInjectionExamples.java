package com.mouritech.springdiexample.setterdi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mouritech.springdiexamples.service.MessageService;

@Component
public class SetterBasedInjectionExamples {
	private MessageService msgService;

	public MessageService getMsgService() {
		return msgService;
	}

	@Autowired
	//@Qualifier("WhatsAppService")
	@Qualifier("PhoneService")
	public void setMsgService(MessageService msgService) {
		this.msgService = msgService;
	}
	
	public void sendMsg(String message) {
		msgService.sendMsg(message);
	}
}
