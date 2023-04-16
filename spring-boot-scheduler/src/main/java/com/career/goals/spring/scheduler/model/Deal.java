package com.career.goals.spring.scheduler.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
public class Deal {
	@Id
	@GeneratedValue
	private int id;
	private String name;
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
	@Override
	public String toString() {
		return "Deal [id=" + id + ", name=" + name + "]";
	}
	public Deal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Deal() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
