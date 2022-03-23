package com.d2h.consumer.D2HConsumerApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.d2h.consumer.D2HConsumerApp.Entity.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer,Integer> {

}
