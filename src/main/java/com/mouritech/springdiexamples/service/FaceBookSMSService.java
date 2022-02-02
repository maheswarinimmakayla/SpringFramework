package com.mouritech.springdiexamples.service;

import org.springframework.stereotype.Service;


@Service("FaceBookService")
public class FaceBookSMSService implements MessageService{
	public void sendMsg(String msg) {
		System.out.println(msg + "..........sent message using FacebookSMSService");
		
	}
}