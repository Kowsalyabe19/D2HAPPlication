package com.d2h.consumer.D2HConsumerApp.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import org.springframework.lang.NonNull;

@Entity
@Table(name="Consumer")
public class Consumer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@NonNull
	private String name;
	
	private String language;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id",referencedColumnName = "Id")
	private Address address;
	 
	protected Consumer() {
		
	}
	
	public Consumer(String name, String language, Address address) {
		super();
		this.name = name;
		this.language = language;
		this.address = address;
	}

	public int getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getLanguage() {
		return language;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Consumer [Id=" + Id + ", name=" + name + ", language=" + language + ", address=" + address + "]";
	}
}
