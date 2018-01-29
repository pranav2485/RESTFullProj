package com.mtc.app.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="supplier")
public class Supplier {

	@Id
	@Column(name="supplier_id")
	private int id;
	@Column(name="supplier_name")
	private String name;
	
	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Supplier(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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
	
	
}
