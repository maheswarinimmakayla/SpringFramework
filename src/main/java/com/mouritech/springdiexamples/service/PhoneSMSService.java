package com.mouritech.springdiexamples.service;

import org.springframework.stereotype.Service;

@Service("PhoneService")
public class PhoneSMSService implements MessageService {

	public void sendMsg(String msg) {
		System.out.println(msg + "..........sent message using PhoneSMSService");
		
	}

}