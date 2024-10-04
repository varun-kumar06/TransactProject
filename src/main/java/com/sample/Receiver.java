package com.sample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ReceiverTable")
public class Receiver {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int id;
	String name;
	int receivedAmt;
	int totalAmt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getReceivedAmt() {
		return receivedAmt;
	}
	public void setReceivedAmt(int receivedAmt) {
		this.receivedAmt = receivedAmt;
	}
	public int getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(int totalAmt) {
		this.totalAmt = totalAmt;
	}
	
	
	
}
