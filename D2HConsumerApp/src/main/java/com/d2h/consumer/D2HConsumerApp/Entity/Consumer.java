package com.d2h.consumer.D2HConsumerApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Consumer")
public class Consumer {

	@Id
	@GeneratedValue
	private int Id;
	private String name;
	private String language;
	
	protected Consumer() {
		
	}
	public Consumer(String name, String language) {
		this.name = name;
		this.language = language;
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
	@Override
	public String toString() {
		return "Consumer [Id=" + Id + ", name=" + name + ", language=" + language + "]";
	}
}
