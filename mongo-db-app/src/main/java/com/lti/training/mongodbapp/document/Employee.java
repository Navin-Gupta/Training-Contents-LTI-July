package com.lti.training.mongodbapp.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Document
@Data
@AllArgsConstructor
public class Employee {

	@Id
	private String id;
	private String name;
	private String email;
	
}
