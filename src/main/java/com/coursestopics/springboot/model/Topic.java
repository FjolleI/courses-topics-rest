/**
 * 
 */
package com.coursestopics.springboot.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@Data
public class Topic {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String description;
	
	public Topic(){
		super();
	}
	
	public Topic(Integer id, String name, String description){
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

}
