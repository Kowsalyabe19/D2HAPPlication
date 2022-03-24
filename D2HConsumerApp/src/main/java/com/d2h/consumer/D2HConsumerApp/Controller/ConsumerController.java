package com.d2h.consumer.D2HConsumerApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.d2h.consumer.D2HConsumerApp.Entity.Consumer;
import com.d2h.consumer.D2HConsumerApp.Repository.ConsumerRepository;


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
	public List<Consumer> addConsumerDetails(@RequestBody List<Consumer> consumers){
				repository.saveAll(consumers);
		       return consumers;
		
	}
	@DeleteMapping("/consumers/{id}")
	 public String deleteConsumer(@PathVariable int id) {
		repository.deleteById(id);
		return "deleted";
	}
	
	@PutMapping("/consumers/{id}")
	public Consumer updateConsumer(@RequestBody Consumer consumer) {
		repository.save(consumer);
		return consumer;
	}
	@PatchMapping("/consumers/{id}")
	public Consumer partialupdateConsumer(@RequestBody Consumer consumer) {
		repository.save(consumer);
		return consumer;
	}
	
	
}
