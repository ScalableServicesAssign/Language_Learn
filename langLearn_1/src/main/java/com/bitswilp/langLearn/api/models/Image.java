package com.bitswilp.langLearn.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "Image")
public class Image {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;

private String name;
private String description;

@Lob
private byte[] image;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public byte[] getImage() {
	return image;
}

public void setImage(byte[] image) {
	this.image = image;
}

public Image(String name, String description, byte[] image) {
	super();
	this.name = name;
	this.description = description;
	this.image = image;
}

public Image() {
	super();
	// TODO Auto-generated constructor stub
}




}
