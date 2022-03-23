package com.d2h.consumer.D2HConsumerApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.d2h.consumer.D2HConsumerApp.Entity.Consumer;
import com.d2h.consumer.D2HConsumerApp.Repository.ConsumerRepository;
import com.in28minutes.springboot.model.Question;

@RestController
public class ConsumerController {
    
	@Autowired
	ConsumerRepository repository;
	
	@GetMapping("/consumers")
	public List<Consumer> getConsumerDetails(){
		
		List<Consumer> consumers=repository.findAll();
		return consumers;
		
	}
	
	@PostMapping("/consumers")
	public Consumer addConsumerDetails(@RequestBody Consumer cons){
				repository.save(cons);
		return cons;
		
	}
}
