package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController

public class TransactController {

	@Autowired
	SenderRepository sr;
	
	@Autowired
	ReceiverRepository rr;
	
	@PostMapping(value="/postData")
	@Transactional
	public String postThis(@RequestBody Transact t) {
		sr.save(t.getSender());
		int a=10/0;
		rr.save(t.getReceiver());
		
		return "saved";
	}
	
}
