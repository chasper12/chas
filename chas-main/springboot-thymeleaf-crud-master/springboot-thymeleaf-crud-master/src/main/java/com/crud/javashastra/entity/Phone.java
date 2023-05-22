package com.crud.javashastra.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	public
	String Uname;
	@Column
	int size;
	@Column
	String color;
	@Column
	int quantity;


	public Phone() {
		super();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return Uname;
	}

	public void setUname(String Uname) {
		this.Uname = Uname;
	}
	
	public int setSize() {
		return size;
	}

	public void getsize(int size) {
		this.size = size;
	}

	public String getcolor() {
		return color;
	}

	public void setcolor(String color) {
		this.color = color;
	}

	public int getquantity() {
		return quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

}
